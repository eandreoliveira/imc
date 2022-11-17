FROM amazoncorretto:17-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ADD ./newrelic /newrelic

COPY build/libs/imc-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-javaagent:/newrelic/newrelic.jar","-jar","/app.jar"]