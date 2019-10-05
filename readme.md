# Music Library

simple spring boot app example for experiments

### docker first time
```
cd musiclibrary
mvn clean install
mvn -Ddocker.image.tag='latest' dockerfile:build
docker-compose -f src/test/resources/docker-compose.yml up
```
