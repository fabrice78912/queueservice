# QueueService

Microservice Spring Boot pour envoyer et recevoir des messages via **Amazon MQ ActiveMQ** en utilisant **OpenWire sécurisé (SSL, port 61617)**.

Les messages sont envoyés sous forme **JSON** pour éviter les problèmes de `ObjectMessage` dans la console Amazon MQ.

---

## 📦 Prérequis

- Java 21
- Maven 3.9+
- Amazon MQ ActiveMQ (OpenWire activé, port 61617)
- macOS / Linux / Windows
- `.env` pour sécuriser les credentials

---

## 🔒 Sécurisation des données sensibles

Crée un fichier `.env` à la racine du projet :

```env
BROKER_URL=ssl://url-broker:61617
BROKER_USER=***************
BROKER_PASSWORD=**************
SERVER_PORT=**************
ACTIVE_PROFILE=dev