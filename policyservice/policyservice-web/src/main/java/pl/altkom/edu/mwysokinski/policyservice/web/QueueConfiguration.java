package pl.altkom.edu.mwysokinski.policyservice.web;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

    public static final String RABBITMQ_HOSTNAME = "localhost";
    public static final String EXCHANGE = "policy.created.exchange";
    public static final String ROUTING_KEY = "";

    @Bean
    public ConnectionFactory connectionFactory() {
        return new CachingConnectionFactory(RABBITMQ_HOSTNAME);
    }

    @Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        return new RabbitTemplate(connectionFactory());
    }

}
