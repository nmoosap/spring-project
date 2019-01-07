FROM openjdk:8-jdk-alpine
COPY ./build/libs/-0.1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app.jar "]
