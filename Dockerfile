FROM maven:3.9-amazoncorretto-21 AS builder

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

RUN mvn clean install -DskipTests

FROM amazoncorretto:21-alpine

WORKDIR /app

COPY --from=builder /target/rinhaBackend2025-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]