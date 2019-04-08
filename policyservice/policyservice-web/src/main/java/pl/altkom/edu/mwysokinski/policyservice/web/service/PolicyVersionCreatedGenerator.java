package pl.altkom.edu.mwysokinski.policyservice.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.*;
import pl.altkom.edu.mwysokinski.policyservice.api.enums.LimitPeriod;
import pl.altkom.edu.mwysokinski.policyservice.api.event.PolicyVersionCreated;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;

import static pl.altkom.edu.mwysokinski.policyservice.web.QueueConfiguration.EXCHANGE;
import static pl.altkom.edu.mwysokinski.policyservice.web.QueueConfiguration.ROUTING_KEY;


@Service
public class PolicyVersionCreatedGenerator {

    private Logger log = LoggerFactory.getLogger(PolicyVersionCreatedGenerator.class);
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public PolicyVersionCreatedGenerator(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedRate = 3000)
    public void generatePolicyVersionCreatedMessage() {
        Address address = new Address();
        address.setCountry("PL");
        address.setCity("Warsaw");
        address.setStreet("Chłodna 51");

        PolicyHolder policyHolder = new PolicyHolder();
        policyHolder.setFirstName("FirstName");
        policyHolder.setLastName("LastName");
        policyHolder.setPesel("11111111111");
        policyHolder.setAccountNumber("00000000000000000000000000");
        policyHolder.setAddress(address);

        Percent percent = new Percent();
        percent.setPercent(BigDecimal.TEN);

        Limit limit = new Limit();
        limit.setLimitPeriod(LimitPeriod.POLICY_YEAR);
        limit.setMaxAmount(100);
        limit.setMaxQuantity(100);

        pl.altkom.edu.mwysokinski.policyservice.api.dto.Service service =
                new pl.altkom.edu.mwysokinski.policyservice.api.dto.Service();
        service.setCode("Code");
        service.setCoPayment(percent);
        service.setLimit(limit);

        LinkedList<pl.altkom.edu.mwysokinski.policyservice.api.dto.Service> services =
                new LinkedList<pl.altkom.edu.mwysokinski.policyservice.api.dto.Service>();
        services.add(service);

        Cover cover = new Cover();
        cover.setCoverCode("CoverCode");
        cover.setServices(services);

        LinkedList<Cover> covers = new LinkedList<Cover>();
        covers.add(cover);

        PolicyVersionCreated event = new PolicyVersionCreated();
        event.setPolicyNumber("PolicyNumber");
        event.setProductCode("ProductCode");
        event.setPolicyHolder(policyHolder);
        event.setPolicyValidFrom(new Date());
        event.setVersionNumber(1);
        event.setVersionValidFrom(new Date());
        event.setCovers(covers);

        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, event);
        log.info(event.toString());
    }

}
