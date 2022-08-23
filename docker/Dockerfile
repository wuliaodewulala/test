FROM openjdk:16-alpine as Builder
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} /usr/local/application.jar
WORKDIR /usr/local
CMD java -jar application.jar