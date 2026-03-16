# UserService

UserService est un microservice développé en **Java Spring Boot** pour gérer les utilisateurs, les rôles, les tokens et les appareils. Il utilise une base de données PostgreSQL et expose des API REST sécurisées.

---

## Table des matières

- [Fonctionnalités](#fonctionnalités)
- [Technologies](#technologies)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Configuration](#configuration)
- [Exécution](#exécution)
- [Endpoints API](#endpoints-api)
- [Tests](#tests)
- [Licence](#licence)

---

## Fonctionnalités

- Création, lecture, mise à jour et suppression d’utilisateurs
- Gestion des rôles et permissions
- Gestion des tokens (compte, mot de passe, MFA)
- Gestion des appareils associés aux utilisateurs
- Sécurité et validation des entrées (email, mot de passe fort, username unique)
- Support de PostgreSQL avec fonctions PL/pgSQL pour certaines opérations

---

## Technologies

- **Java 17**
- **Spring Boot 3**
- **Spring Data JDBC / JdbcClient**
- **PostgreSQL**
- **Lombok**
- **Jakarta Validation (Bean Validation)**
- **JUnit / Mockito pour les tests**
- **Git / GitHub pour la gestion de version**

---

## Prérequis

- Java 17 ou supérieur
- Maven 3.8 ou supérieur
- PostgreSQL 15 ou supérieur
- Git

---

## Installation

1. Cloner le dépôt :

```bash
git clone https://github.com/fabrice78912/userservice.git
cd userservice
