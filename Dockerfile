FROM amazoncorretto:8-alpine-jdk
MAINTAINER FRAN

ENV DB_URL="jdbc:mysql://uhjurkijiyy0yqrx:SXwiHayfOlguZILewPwV@bxmv9x24kouy4uxtyo2e-mysql.services.clever-cloud.com:3306/bxmv9x24kouy4uxtyo2e?serverTimezone=UTC"
ENV DB_USERNAME="uhjurkijiyy0yqrx"
ENV DB_PASSWORD="SXwiHayfOlguZILewPwV"

COPY target/App-0.0.1-SNAPSHOT.jar  App.jar

ENTRYPOINT ["java","-jar","/App.jar"]

