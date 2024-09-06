FROM openjdk:17.0
COPY . .
RUN chmod +x gradlew
RUN ./gradlew assemble
RUN cp target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]