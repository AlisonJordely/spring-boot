FROM openjdk:8-jdk-alpine
MAINTAINER TEST
ADD  target/demoapp.jar docker-images.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-images.jar"]