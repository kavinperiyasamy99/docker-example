FROM java:8
EXPOSE 8086
ADD /target/docker-example-0.0.1-SNAPSHOT.jar docker-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "docker-example-0.0.1-SNAPSHOT.jar"]