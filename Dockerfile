## Use a base image with OpenJDK 17 installed
#FROM openjdk:17-jdk-slim
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the packaged Spring Boot application JAR file into the container
#COPY target/helloapi-0.0.1-SNAPSHOT.jar app.jar
#
## Expose the port that your Spring Boot application uses (default is 8080)
#EXPOSE 8080
#
## Specify the command to run your Spring Boot application when the container starts
#CMD ["java", "-jar", "app.jar"]


FROM openjdk:17-oracle

COPY target/helloapi-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]