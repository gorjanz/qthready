package edu.gorjanz.qthready.queue;

import edu.gorjanz.qthready.domain.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String key, Message message) {
        rabbitTemplate.convertAndSend(key, message);
    }
}
