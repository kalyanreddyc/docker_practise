# Use an official Java runtime base image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR files into the container
COPY ./*.jar /app/

# Set the Java command as the fixed entry point, and specify the default JAR
ENTRYPOINT ["java", "-jar", "/app/first-demo-jar-1.1-SNAPSHOT.jar"]