FROM openjdk:17-oracle
COPY ./target/Author-service-0.0.1-SNAPSHOT.jar Author-service.jar
CMD ["java","-jar","Author-service.jar"]