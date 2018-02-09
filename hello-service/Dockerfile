FROM java:8-jre

ADD ./target/hello-service-0.0.1.jar /app/

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/hello-service-0.0.1.jar"]
EXPOSE 8090