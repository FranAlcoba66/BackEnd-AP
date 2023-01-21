FROM amazoncorretto:11-alpine-jdk
MAINTAINER FRAN
COPY  App-0.0.1-SNAPSHOT App.jar
ENTRYPOINT ["java","-jar","/App.jar"]