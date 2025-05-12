FROM openjdk:11-jdk
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "hotel-app.jar"]