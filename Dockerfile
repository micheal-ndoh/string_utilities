FROM eclipse-temurin:${JAVA_VERSION}-jdk-alpine as builder

WORKDIR /app

COPY src/ ./src/
COPY bin/ ./bin/

RUN javac -d /bin $(find src -name "*.java")

FROM eclipse-temurin:${JAVA_VERSION}-jre-alpine

WORKDIR /app

COPY --from=builder /app/src/out /app
CMD ["java", "-cp", "/app", "Bonus"]