
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:8-alpine-jdk
MAINTAINER FRAN

COPY App/target/App-0.0.1-SNAPSHOT.jar  App.jar

ENTRYPOINT ["java","-jar","/App.jar"]
