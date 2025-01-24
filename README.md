# Microservices-Based System

This project implements a microservices architecture to handle various functionalities like user management, event management, donation management, request management, file uploads, and validation. The system integrates key components like API Gateway, Service Discovery, and Centralized Configuration for effective communication and scalability.

---

## 🛠️ Features
- **User Management Service**: Handles user registration, login, and user details.
- **Request Management Service**: Manages requests sent by users or administrators.
- **Event Management Service**: Manages event creation and retrieval.
- **Donation Management Service**: Handles donations and associated transactions.
- **File Upload Service**: Handles file uploads for various purposes.
- **Validation Service**: Provides validation for user input and fields.

---

## 🗂️ Architecture
- **API Gateway**: A single entry point for routing requests to microservices.
- **Service Discovery (Eureka)**: Dynamically registers and discovers services.
- **Centralized Configuration (Config Server)**: Centralized management of microservices configurations.

---

## 📂 Project Structure
```plaintext
project-root/
├── api-gateway/             # API Gateway Microservice
├── config-server/           # Centralized Configuration Server
├── eureka-server/           # Service Discovery Server
├── user-management-service/ # Manages user-related functionalities
├── request-management-service/ # Manages requests
├── event-management-service/ # Manages events
├── donation-management-service/ # Manages donations
├── file-upload-service/     # Handles file uploads
├── validation-service/      # Provides validation
```

## 🚀 How to Run

### Prerequisites
- Java 17+
- Maven 3.6+
- MongoDB instance (cloud or local)
- Git

### Step 1: Clone the Repository
```bash
   git clone https://github.com/your-repo/microservices-based-system.git
   cd microservices-based-system
```

### Step 2: Start the Services
1. Start the **Config Server**:
   ```bash
   cd config-server
   mvn spring-boot:run
   ```
2. Start the **Eureka Server**:
   ```bash
   cd eureka-server
   mvn spring-boot:run
   ```
3. Start the **API Gateway**:
   ```bash
   cd api-gateway
   mvn spring-boot:run
   ```
4. Start each microservice:
   ```bash
   cd user-management-service
   mvn spring-boot:run
   ```
   Repeat the above step for all other microservices.

---

## 🛡️ Dependencies
- **Spring Boot**: Framework for building microservices.
- **Spring Cloud**: Components for gateway, Eureka, and config server.
- **MongoDB**: Database for persisting data.
- **Lombok**: Simplifies Java model creation.

---

## 🛠️ Endpoints
### User Management Service
- **POST /users/register**: Register a new user.
- **POST /users/login**: Login with user credentials.
- **GET /users/{id}**: Retrieve user details.

### Request Management Service
- **POST /requests**: Create a new request.
- **GET /requests/{id}**: Retrieve request details.
- **PUT /requests/{id}**: Update request status.

### Event Management Service
- **POST /events**: Create a new event.
- **GET /events/{id}**: Retrieve event details.
- **GET /events**: List all events.

### Donation Management Service
- **POST /donations**: Create a new donation.
- **GET /donations/{id}**: Retrieve donation details.
- **GET /donations/user/{userId}**: List donations by a specific user.

### File Upload Service
- **POST /files/upload**: Upload a file.
- **GET /files/{fileId}**: Retrieve a file.

### Validation Service
- **POST /validate/email**: Validate email format and availability.
- **POST /validate/event**: Validate event details before submission.

---

## 🛠️ Configuration
### Centralized Configuration
- The **Config Server** retrieves properties from a remote Git repository.
- Sample `application.yml` for a microservice:
  ```yaml
  spring:
    application:
      name: user-management-service
    config:
      import: optional:configserver:http://localhost:8888
  ```

### MongoDB
- Ensure MongoDB is running or use a cloud instance.
- Update the connection URI in the respective configuration files.

---

## 📦 Technologies Used
- **Spring Boot**: Microservices framework.
- **Spring Cloud Gateway**: API Gateway for routing.
- **Spring Cloud Netflix Eureka**: Service Discovery.
- **Spring Cloud Config**: Centralized configuration management.
- **MongoDB**: NoSQL database.
- **Lombok**: Java boilerplate reduction.

---

## 📚 Documentation
For detailed explanations of each service, visit the [Wiki](https://github.com/your-repo/microservices-based-system/wiki).

---

## 🖇️ Contribution
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit changes (`git commit -m "Add feature"`).
4. Push the branch (`git push origin feature-name`).
5. Create a pull request.

---

## 📝 License
This project is licensed under the [MIT License](LICENSE).

---

## ✨ Acknowledgements
Thanks to all contributors who made this project possible!
