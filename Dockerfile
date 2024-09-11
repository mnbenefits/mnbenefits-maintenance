FROM openjdk:17.0
COPY . .
RUN microdnf install findutils
RUN chmod +x gradlew
RUN ./gradlew assemble
RUN cp build/libs/*.jar build/libs/app.jar
RUN cp build/libs/app.jar /
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]
