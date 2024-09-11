FROM openjdk:17.0
COPY . .
RUN microdnf install findutils
ARG GetMyUsername
RUN echo ${GetMyUsername}
RUN chmod +x gradlew
RUN ./gradlew assemble
RUN cp build/libs/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]
