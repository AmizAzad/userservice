FROM openjdk:17
EXPOSE 8080
ADD target/userservice.jar userservice.jar
ENTRYPOINT ["java","-jar","userservice.jar"]