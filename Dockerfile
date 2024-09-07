# Start with a base image containing Java 17 runtime
FROM openjdk:17-jdk-slim

# Information about the maintainer
LABEL "org.opencontainers.image.authors"="swiftcart.com"

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory into the image
COPY product-app/target/product-app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on (e.g., 8081)
EXPOSE 8081

# Execute the application
ENTRYPOINT ["java", "-jar", "app.jar"]
