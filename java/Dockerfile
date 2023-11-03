# Eclipse Temurin, one of the most popular official images with a build-worthy JDK
FROM maven:latest

# change into a folder called /app
WORKDIR /app

# using maven for project managementt
COPY . .

RUN mvn clean package -Dmaven.test.skip

# second stage
FROM ubuntu/jre:17-22.04_edge

#COPY ./app/target/cardatabase-0.0.1-SNAPSHOT.jar .

CMD [ "-jar", "target/cardatabase-0.0.1-SNAPSHOT.jar" ]

