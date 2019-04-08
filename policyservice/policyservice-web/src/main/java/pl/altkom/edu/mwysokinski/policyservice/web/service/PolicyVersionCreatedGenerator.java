package pl.altkom.edu.mwysokinski.policyservice.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.altkom.edu.mwysokinski.policyservice.api.event.PolicyVersionCreated;

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
        PolicyVersionCreated event = new PolicyVersionCreated();
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, event);
        log.info(event.toString());
    }
}
