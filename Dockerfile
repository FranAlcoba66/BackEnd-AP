FROM amazoncorretto:11-alpine-jdk
MAINTAINER FRAN
COPY target/App-0.0.1-SNAPSHOT.jar  App.jar
ENTRYPOINT ["java","-jar","/App.jar"]

App-0.0.1-SNAPSHOT