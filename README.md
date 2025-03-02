# 🎯 **Hope Donation Webapp-Backend Microservices Architecture with Spring Boot 🔰**

![Microservices](https://img.shields.io/badge/Microservices-Spring%20Boot-green) ![Java](https://img.shields.io/badge/Java-17-orange) ![Spring%20Cloud](https://img.shields.io/badge/Spring%20Cloud-Config%20%7C%20Gateway%20%7C%20Eureka-blue)

## 🚀 **Project Overview**

This project demonstrates a fully functional **microservices architecture** built with Spring Boot and Spring Cloud. It includes multiple services to handle various functionalities like user management, event handling, donations, and more. The project integrates **API Gateway**, **Service Discovery**, and **Centralized Configuration** for scalability and flexibility.

---

## 🛠️ **Key Features**

- 🔄 **Service-Oriented Architecture** with Spring Boot.
- 🎯 **API Gateway** for routing requests to respective microservices.
- 🔍 **Eureka Service Discovery** for dynamic service registration and discovery.
- 📜 **Centralized Configuration** using Spring Cloud Config.
- 🌱 **MongoDB** for data storage.
- ✨ **Lombok** for cleaner code and reducing boilerplate.

---

## 🧱 **Microservices**

| Service Name        | Description                                               | Endpoints                                     |
|---------------------|-----------------------------------------------------------|-----------------------------------------------|
| 🧑‍💼 **User Management** | Handles user registrations, logins, and retrieval.        | `/users`                                      |
| 📩 **Request Management** | Handles requests sent by users or admins.                 | `/requests`                                   |
| 🎉 **Event Management** | Manages events for users or organizations.                | `/events`                                     |
| 💰 **Donation Management** | Handles donations and tracks transactions.               | `/donations`                                  |
| 📁 **File Upload**  | Manages file uploads like event images or profile pics.   | `/files/upload`                               |
| ✅ **Validation**    | Validates user input and event details.                   | `/validate/email`, `/validate/event`          |

---

## 🗂️ **Project Structure**

```plaintext
project-root/
├── api-gateway/
├── config-service/
├── discovery-service/
├── donation-management/
├── event-management/
├── file-upload/
├── request-management/
├── user-management/
├── validation/
```

---

## 🛠️ **Tech Stack**

| **Technology**         | **Purpose**                                   |
|------------------------|-----------------------------------------------|
| 🖥️ **Spring Boot**      | Service creation and business logic.          |
| ☁️ **Spring Cloud**      | Gateway, Config, and Eureka integration.      |
| 🛢️ **MongoDB**           | NoSQL database for persistent storage.        |
| 🔒 **BCrypt**           | Password encryption for secure logins.       |
| 📜 **Lombok**           | Reduces boilerplate code for models.          |

---

## ⚙️ **Setup and Run**

### Prerequisites:
- ✅ Java 17
- ✅ Maven
- ✅ MongoDB
- ✅ Git

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/thenujad/hope-microservice-backend.git
   ```
2. Navigate to each microservice folder and update the MongoDB URI in `application.yml`.

3. Start the services in the following order:
    - `config-service`
    - `discovery-service`
    - `api-gateway`
    - Other microservices.

4. Access the services:
    - Eureka Dashboard: `http://localhost:8761`
    - API Gateway: `http://localhost:8080`

---

## 🖥️ **API Endpoints**

### 🎯 **User Management**
- **POST** `/users/register`: Register a new user.
- **POST** `/users/login`: Log in a user.
- **GET** `/users/{id}`: Retrieve user details by ID.

### 💰 **Donation Management**
- **POST** `/donations`: Create a new donation.
- **GET** `/donations/{id}`: Get donation details.
- **GET** `/donations/user/{userId}`: List donations by a user.

### 🎉 **Event Management**
- **POST** `/events`: Create a new event.
- **GET** `/events/{id}`: Get event details.
- **GET** `/events`: List all events.

### ✅ **Validation**
- **POST** `/validate/email`: Validate email format and availability.
- **POST** `/validate/event`: Validate event details before submission.

---

## 👥 **Contributors**

- **Thenuja Dulwana** | [GitHub](https://github.com/thenujad) | [LinkedIn](https://www.linkedin.com/in/thenujadulwana/)
- Add other contributors here!

---

## 📜 **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🤝 **Acknowledgments**

Special thanks to the Spring Boot and Spring Cloud communities for providing robust tools to build microservices.

---
