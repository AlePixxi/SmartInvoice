# 🧾 SmartInvoice – Microservizi per Fatturazione e Pagamenti

SmartInvoice è una piattaforma backend-oriented per la gestione di fatture, clienti e pagamenti. Pensata per freelancer e piccole aziende, è progettata in architettura a **microservizi** con focus su **scalabilità, resilienza e clean architecture**.

---

## 🧱 Architettura

- Architettura a microservizi
- Comunicazione sincrona (REST) + asincrona (RabbitMQ)
- Database poliglotta (PostgreSQL + MongoDB)
- Autenticazione centralizzata con JWT
- Gestione file (PDF) su Amazon S3
- CI/CD e deploy su AWS (ECS o EKS)

### 🔩 Microservizi principali:

| Microservizio           | Descrizione                                 | DB             |
|-------------------------|---------------------------------------------|----------------|
| **User Service**         | Registrazione, login, JWT auth              | PostgreSQL     |
| **Client Service**       | CRUD clienti per utente                     | PostgreSQL     |
| **Invoice Service**      | Gestione fatture, numerazione, stato       | PostgreSQL     |
| **Payment Service**      | Registrazione pagamenti, eventi             | MongoDB        |
| **Notification Service** | Email/SMS su eventi                         | RabbitMQ + S3  |
| **PDF Service**          | Generazione PDF delle fatture               | - (file → S3)  |
| **API Gateway**          | Entry-point unico, routing, auth forwarding | -              |

---

## 📦 Stack Tecnologico

### Backend
- Java 21, Spring Boot 3
- Spring Cloud (Eureka, Gateway, Config)
- Spring Security + JWT
- Spring Data JPA + PostgreSQL
- Spring Data MongoDB
- Spring Cloud Stream + RabbitMQ
- OpenFeign per comunicazione tra microservizi
- Lombok, MapStruct

### DevOps / Cloud
- Docker + Docker Compose (dev)
- GitHub Actions (CI)
- AWS: ECS Fargate, RDS, S3, CloudWatch Logs
- Terraform (opzionale)

---

## 🧪 Come avviare in locale

> Richiede: Java 21, Docker, Docker Compose

```bash
# Clona il progetto
git clone https://github.com/tuo-utente/smartinvoice.git
cd smartinvoice

# Avvia tutti i servizi (local dev)
docker-compose up --build
