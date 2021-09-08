package org.matias.springkafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id = "${spring.kafka.consumer.group-id}", topics = "my-topic")
public class Consumer {

    @KafkaHandler(isDefault = true)
    void listen(String message) {
        System.out.println(message);
    }
}
