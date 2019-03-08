# kafka-gradle-plugin
Download, extract and start / stop kafka together with zookeeper easily by using Gradle

NOTE: _This plugin is intended to use only in UNIX at the moment..._

## available tasks

- kafkaInfo
- kafkaClean
- kafkaRmTar
- kafkaRmHome

- kafkaDownload
- kafkaExtract

- kafkaZookeeperStart
- kafkaBrokerStart
- kafkaStart

- kafkaBrokerStop
- kafkaZookeeperStop
- kafkaStop

## usage

```bash
# startup kafka:
./gradlew kafkaZookeeperStart # wait few seconds...
./gradlew kafkaBrokerStart

# clone some kafka app:
git clone https://github.com/daggerok/kafka-java-example.git
cd kafka-java-example/

# build and start consumer in background:
./gradlew -DmainClass=com.github.daggerok.ConsumerV1Kt
mv -f ./build/install/kafka-java-example ./build/consumer
bash ./build/consumer/bin/kafka-java-example &

# build and run producer:
./gradlew -DmainClass=com.github.daggerok.ProducerV1Kt
mv -f ./build/install/kafka-java-example ./build/producer
bash ./build/producer/bin/kafka-java-example one and two and three and four...

# shutdown and cleanup:
cd .. 
./gradlew kafkaStop
killall -9 java
rm -rf kafka-java-example
```
