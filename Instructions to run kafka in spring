# Kafka Quickstart

This quickstart guide will help you get started with Apache Kafka on your local machine.

## Prerequisites

Before you begin, make sure you have the following prerequisites installed:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (Kafka is written in Java)
- [Apache Kafka](https://kafka.apache.org/downloads) (Download and extract the Kafka binaries)

## Getting Started

##Topic's used
   1) kafka-in-action (1 partition)
   2) kafka-in-action-1 (3 partition)

#Consumer group
   1) group-1 (4 groups)

1. Download Kafka from the official website: [Kafka Downloads](https://kafka.apache.org/quickstart)

2. Extract the downloaded Kafka archive:
   tar -xzf kafka_2.13-3.5.0.tgz

3. Navigate to directory
   cd kafka_2.13-3.5.0

4. Start Zookeeper
   bin/zookeeper-server-start.sh config/zookeeper.properties

5. Start Kafka Server / Broker
   bin/kafka-server-start.sh config/server.properties

6. Run the Spring Boot Application
   It will automatically create topic


7. Use the postman to publish the data to topic by using this api
   localhost:8080/send?message="random message"

8. Use this command to get details of kafka topic (the messages being published)
   bin/kafka-topics.sh --describe --topic topic-name --bootstrap-server localhost:9092  


9. Use this command to get details of kafka topic partions and offset info
   bin/kafka-console-consumer.sh --topic topic-name --from-beginning --bootstrap-server localhost:9092 --property print.offset=true --property print.partition=true

10. Use the postman to publish the data to topic by using this api  
      This topic has 3 partitions (It will publish  10,000 messages to topic)
      localhost:8080/v2/send?message=12345

11. Use this command to get details of messages consumed by consumer
    bin/kafka-console-consumer.sh --topic topic-name --from-beginning --bootstrap-server localhost:9092      
