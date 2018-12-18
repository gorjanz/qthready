package edu.gorjanz.qthready.runner;

import edu.gorjanz.qthready.domain.Message;
import edu.gorjanz.qthready.queue.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements CommandLineRunner {

    @Autowired
    private RabbitMqProducer producer;

    @Override
    public void run(String... args) throws Exception {
        producer.sendMessage("qthready.hello1", new Message(1, "red"));
    }
}
