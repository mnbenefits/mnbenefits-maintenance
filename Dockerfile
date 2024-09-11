FROM openjdk:17.0
COPY . .
RUN microdnf install findutils
RUN chmod +x gradlew
RUN ./gradlew assemble
COPY build/libs/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]
