FROM adoptopenjdk/openjdk16
ADD target/bank-system.jar bank-system.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","bank-system.jar"]
