# Music Library

simple spring boot app example for experiments

### docker first time
```
cd musiclibrary
mvn clean install
mvn -Ddocker.image.tag='latest' dockerfile:build
docker save -o target/docker-musiclibrary.tar musiclibrary:latest
docker-compose -f docker-compose.yml up
```
