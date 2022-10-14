FROM openjdk:8
EXPOSE 8070
ADD target/Authentication.jar Authentication.jar
ENTRYPOINT ["java","-jar","Authentication.jar"]
