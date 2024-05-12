# Use the official OpenJDK image for Java 17
FROM openjdk:17-oracle as build

# Argument to specify the jar file
ARG JAR_FILE=target/*.jar

# Copy the jar file into the image
COPY ${JAR_FILE} app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
