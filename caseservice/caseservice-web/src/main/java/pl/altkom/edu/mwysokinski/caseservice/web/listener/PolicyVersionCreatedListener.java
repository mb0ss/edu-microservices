package pl.altkom.edu.mwysokinski.caseservice.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import pl.altkom.edu.mwysokinski.policyservice.api.event.PolicyVersionCreated;

@Service
public class PolicyVersionCreatedListener {

    private static Logger log = LoggerFactory.getLogger(PolicyVersionCreatedListener.class);

    @RabbitListener(queues = "${rabbitmq.policy.created.queue}")
    public void onEvent(final PolicyVersionCreated policyVersionCreated) {
        log.info(policyVersionCreated.toString());
    }

}
