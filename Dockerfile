# =========================
# STEP 1 : Build avec Maven + Java 21
# =========================
FROM maven:3.9.4-eclipse-temurin-21 AS builder

WORKDIR /app

# Copier le pom.xml pour le cache
COPY pom.xml .

# Copier le code source
COPY src ./src

# Build du projet
RUN mvn clean package -DskipTests

# =========================
# STEP 2 : Runtime JRE Alpine
# =========================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Installer curl pour les healthchecks
RUN apk add --no-cache curl

# Copier le jar
COPY --from=builder /app/target/user-service-app.jar app.jar

# Exposer le port réel du service
EXPOSE 8081

# Lancer l'application
ENTRYPOINT ["java","-jar","app.jar"]
