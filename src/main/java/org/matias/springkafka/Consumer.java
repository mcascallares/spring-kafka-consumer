package org.matias.springkafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id = "${spring.kafka.consumer.group-id}", topics = "${spring.kafka.consumer.topics}")
public class Consumer {

    @KafkaHandler(isDefault = true)
    public void consume(ConsumerRecord<String, String> message) {
        System.out.println("Consumed key=" + message.key() + ", value=" + message.value());
    }
}
