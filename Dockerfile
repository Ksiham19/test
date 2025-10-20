FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/spring-openshift-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
