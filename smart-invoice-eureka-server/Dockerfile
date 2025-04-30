# Step 1: Build the application with Maven
FROM maven:3.8.4-openjdk-17-slim AS build

# Set working directory
WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .

# Download all dependencies (this will be cached if the dependencies are not changed)
RUN mvn dependency:go-offline

# Copy the rest of the application code
COPY src ./src

# Package the application into a JAR file
RUN mvn clean package -DskipTests

# Step 2: Create the Docker image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file from the build image
COPY --from=build /app/target/*.jar app.jar

# Expose port (default for Spring Boot)
EXPOSE 8761

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
