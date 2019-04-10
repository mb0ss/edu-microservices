package pl.altkom.edu.mwysokinski.policyservice.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.*;
import pl.altkom.edu.mwysokinski.policyservice.api.enums.LimitPeriod;
import pl.altkom.edu.mwysokinski.policyservice.api.event.PolicyVersionCreatedEvent;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;


@Service
public class PolicyVersionCreatedGenerator {

    @Value("${rabbitmq.policy.created.exchange}")
    private String EXCHANGE;

    @Value("${rabbitmq.routing.key}")
    private String ROUTING_KEY;

    private Logger log = LoggerFactory.getLogger(PolicyVersionCreatedGenerator.class);
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public PolicyVersionCreatedGenerator(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedRate = 3000)
    public void generatePolicyVersionCreatedMessage() {
        AddressDto addressDto = new AddressDto();
        addressDto.setCountry("PL");
        addressDto.setCity("Warsaw");
        addressDto.setStreet("Chłodna 51");

        PolicyHolderDto policyHolderDto = new PolicyHolderDto();
        policyHolderDto.setFirstName("FirstName");
        policyHolderDto.setLastName("LastName");
        policyHolderDto.setPesel("11111111111");
        policyHolderDto.setAccountNumber("00000000000000000000000000");
        policyHolderDto.setAddressDto(addressDto);

        PercentDto percentDto = new PercentDto();
        percentDto.setPercent(BigDecimal.TEN);

        LimitDto limitDto = new LimitDto();
        limitDto.setLimitPeriod(LimitPeriod.POLICY_YEAR);
        limitDto.setMaxAmount(100);
        limitDto.setMaxQuantity(100);

        ServiceDto serviceDto =
                new ServiceDto();
        serviceDto.setCode("Code");
        serviceDto.setCoPayment(percentDto);
        serviceDto.setLimitDto(limitDto);

        LinkedList<ServiceDto> serviceDtos = new LinkedList<>();
        serviceDtos.add(serviceDto);

        CoverDto cover = new CoverDto();
        cover.setCoverCode("CoverCode");
        cover.setServiceDtos(serviceDtos);

        LinkedList<CoverDto> covers = new LinkedList<>();
        covers.add(cover);

        PolicyVersionCreatedEvent event = new PolicyVersionCreatedEvent();
        event.setPolicyNumber("PolicyNumber");
        event.setProductCode("ProductCode");
        event.setPolicyHolderDto(policyHolderDto);
        event.setPolicyValidFrom(new Date());
        event.setVersionNumber(1);
        event.setVersionValidFrom(new Date());
        event.setCovers(covers);

        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, event);
        log.info("published " + event.getClass());
    }

}
