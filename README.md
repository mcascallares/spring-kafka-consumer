# spring-kafka-consumer
Sample Kafka consumer built with Spring Kafka

## Starting Zookeeper and Kafka

```
docker-compose up -d
```


## Running the consumer app

```
mvn spring-boot:run
```


## Producing sample data using kafka-console-producer

```
kafka-console-producer \
  --bootstrap-server localhost:29092 \
  --topic my-topic \
  --property parse.key=true \
  --property key.separator=":"
this-is-the-key:this-is-the-value
```
