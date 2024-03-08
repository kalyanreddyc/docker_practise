# Use an official Java runtime base image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy both JAR files into the container
COPY ./*.jar /app/

# Set Java as the fixed entry point command
ENTRYPOINT ["java", "-jar"]

# Set default JAR file as the default argument
CMD ["/app/first-demo-jar-1.1-SNAPSHOT.jar"]