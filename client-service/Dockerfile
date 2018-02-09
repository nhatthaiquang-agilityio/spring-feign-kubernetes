FROM java:8-jre

ADD ./target/client-service-0.0.1.jar /app/

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/client-service-0.0.1.jar"]
EXPOSE 8899