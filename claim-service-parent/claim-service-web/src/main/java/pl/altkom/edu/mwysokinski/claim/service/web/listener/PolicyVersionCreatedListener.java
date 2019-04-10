package pl.altkom.edu.mwysokinski.claim.service.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import pl.altkom.edu.mwysokinski.policy.service.api.event.PolicyVersionCreatedEvent;

@Service
public class PolicyVersionCreatedListener {

    private static Logger LOG = LoggerFactory.getLogger(PolicyVersionCreatedListener.class);

    @RabbitListener(queues = "${rabbitmq.policy.created.queue}")
    public void onEvent(final PolicyVersionCreatedEvent event) {
        LOG.info("found" + event.getClass().getSimpleName());
    }

}
