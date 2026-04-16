# 🔐 Spring Boot Authentication Microservice (JWT + Spring Security)

A production-style **Authentication Microservice** built using **Spring Boot** and **Spring Security**.

This project was created to help developers move beyond hardcoded login systems and implement real-world authentication in their applications.

---

## 🚀 Features

- ✅ JWT-based stateless authentication  
- ✅ Role-based authorization (USER / ADMIN)  
- ✅ Custom UserDetailsService  
- ✅ BCrypt password hashing  
- ✅ Secure API endpoints using filters  
- ✅ Clean and scalable architecture  

---

## 🛠️ Tech Stack

- Java  
- Spring Boot  
- Spring Security  
- JWT (JSON Web Token)  
- Maven  

---

## 📦 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/springboot-auth-microservice.git
cd springboot-auth-microservice

2️⃣ Configure Database

Update your application.properties (or application.yml):

spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Application

Using Maven:

mvn spring-boot:run

Or run the main class from your IDE.

🔐 API Endpoints
🟢 Public Endpoints
Method	Endpoint	Description
POST	/auth/register	Register new user
POST	/auth/login	Authenticate user
🔒 Protected Endpoints
Method	Endpoint	Access Role
GET	/user/**	USER
GET	/admin/**	ADMIN

👉 These endpoints require a valid JWT token in the header:

Authorization: Bearer <your_token>
🧪 Example Request
Login Request
POST /auth/login

{
  "username": "testuser",
  "password": "password"
}
Response
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
🔄 How It Works
User registers or logs in
Server validates credentials
JWT token is generated
Client sends token in future requests
Filters validate token and authorize access
💡 Integration

This service can be easily integrated with:

React frontend
Angular / Vue apps
Other microservices
🧭 Future Enhancements
🔄 Refresh Tokens
📧 Email verification
🔐 OAuth2 / Social login
🧪 Unit & Integration tests
🚀 Docker support
🤝 Contributing

Contributions are welcome!

Fork the repo
Create your feature branch (git checkout -b feature-name)
Commit your changes
Push to the branch
Open a Pull Request
⭐ Support

If you found this useful, consider giving it a ⭐ on GitHub — it helps others discover it!

📬 Contact

Feel free to connect with me on LinkedIn or raise an issue for any queries.

📄 License

This project is open-source and available under the MIT License.


---
