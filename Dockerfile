# Use the official Java 21 image as a base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /findoc-back

# Copy the Spring Boot JAR file into the container
COPY target/FinDoc-0.0.1-SNAPSHOT.jar findoc-back.jar

# Expose the port on which the application will run
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "findoc-back.jar"]
