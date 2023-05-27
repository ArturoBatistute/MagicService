# Magic the Gathering api

![Alt text](src/main/resources/images/magic.gif?raw=true "Roar")

## Description

Simple API that returns random Magic cards to be used in a cloud environment.


## Technologies

* ``Java 17 with Spring Boot Framework``
* ``Docker``

## Getting Started

* To consume the API:

```bash
"Running a container":

docker build -t magic-service-api:latest .
docker run --name magic-api-v2 -d -p 8080:8080 "imageId"
```