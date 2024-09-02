# Start with a base image containing Java 17 runtime
FROM openjdk:17-jdk-slim

# Information around who maintains the image
LABEL "org.opencontainers.image.authors"="swiftcart.com"

# Add the application's jar to the image
COPY target/product-app-0.0.1-SNAPSHOT.jar product-app-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "product-app-0.0.1-SNAPSHOT.jar"]
