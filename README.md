# kafka-gradle-plugin
Download, extract and start / stop kafka together with zookeeper easily by using Gradle

<img src="./logo_gradke_kotlin_dsl.png" alt="gradle-kotlin-dsl" width="19%"/> <img src="./logo_kafka.png" alt="kafka" width="80%"/>

NOTE: _This plugin is intended to use only in UNIX at the moment..._

## available tasks

- kafkaInfo
- kafkaClean
- kafkaCleanArchive
- kafkaCleanData

- kafkaDownload
- kafkaExtract

- kafkaZookeeperStart
- kafkaBrokerStart
- kafkaStart

- kafkaBrokerStop
- kafkaZookeeperStop
- kafkaStop

- kafkaBrokerRestart
- kafkaZookeeperRestart
- kafkaRestart

## usage

_start kafka_

```bash
./gradlew kStart
```

_get and run test kafka app_

```bash
# clone some kafka app:
git clone https://github.com/daggerok/kafka-java-example.git
cd kafka-java-example/

# build and start consumer in background:
./gradlew -DmainClass=com.github.daggerok.ConsumerV1Kt ; \
mv -f ./build/install/kafka-java-example ./build/consumer ; \
bash ./build/consumer/bin/kafka-java-example &

# build and run producer:
./gradlew -DmainClass=com.github.daggerok.ProducerV1Kt ; \
mv -f ./build/install/kafka-java-example ./build/producer ; \
bash ./build/producer/bin/kafka-java-example one and two and three and four...
```

_shutdown and cleanup_

```bash
cd .. ; \
./gradlew kStop ; \
killall -9 java ; \
rm -rf kafka-java-example
```

## problem solving

_start kafka (long way in case of problems)_

```bash
./gradlew kafkaZookeeperStart # wait few seconds...
./gradlew kafkaBrokerStart
```

_verify_

```bash
jps
2448 QuorumPeerMain
1857 GradleDaemon
1858 KotlinCompileDaemon
1427 
2182 GradleDaemon
1847 RemoteMavenServer
2711 Kafka
2183 KotlinCompileDaemon
2766 Jps
1871 GradleDaemon
```

if you can see both: `QuorumPeerMain` and `Kafka`, then kafka is started.
