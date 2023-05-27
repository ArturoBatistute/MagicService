# Magic the Gathering api

![Alt text](src/main/resources/images/magic.gif?raw=true "Roar")

## Description

Simple API that returns random Magic cards to be used in a cloud environment.


## Technologies

* ``Java 17 with Spring Boot Framework``
* ``Docker``

## Getting Started

* To run a container:

```bash
docker build -t magic-service-api:latest .
docker run --name magic-api -d -p 8080:8080 magic-service-api:latest
```