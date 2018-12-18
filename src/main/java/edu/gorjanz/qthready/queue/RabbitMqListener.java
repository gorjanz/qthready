package edu.gorjanz.qthready.queue;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.printf("Message received: %s", new String(message.getBody()));
    }
}
