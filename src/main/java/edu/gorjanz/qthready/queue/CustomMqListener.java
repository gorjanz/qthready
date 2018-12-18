package edu.gorjanz.qthready.queue;

import edu.gorjanz.qthready.domain.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomMqListener {

    public void receiveMessage(Message message) {
        System.out.printf("Message received: %s - %s", message.getNumber(), message.getColor());
    }
}
