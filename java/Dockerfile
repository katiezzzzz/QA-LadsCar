# FROM ubuntu:22.04
# RUN apt update
# RUN apt install -y git
# RUN apt install -y default -jdk

# Eclipse Temurin, one of the most popular official images with a build-worthy JDK
FROM eclipse-temurin:17-jdk-jammy

# change into a folder called /app
WORKDIR /app

# # using maven for project managementt
# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:resolve

# download the project dependencies
RUN npm install

# package up the react project in the /app directory
RUN npm run build