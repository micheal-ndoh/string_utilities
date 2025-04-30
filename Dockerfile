ARG JAVA_VERSION=21
FROM eclipse-temurin:${JAVA_VERSION}-jdk-alpine as builder

WORKDIR /app

COPY src/ ./src/
COPY MANIFEST.MF ./MANIFEST.MF

RUN mkdir bin

RUN javac -d bin $(find src -name "*.java")

RUN jar cfm string_utilities.jar MANIFEST.MF -C bin .

FROM eclipse-temurin:${JAVA_VERSION}-jre-alpine

WORKDIR /app

COPY --from=builder /app/string_utilities.jar /app/string_utilities.jar

CMD ["java", "-jar", "/app/string_utilities.jar"]