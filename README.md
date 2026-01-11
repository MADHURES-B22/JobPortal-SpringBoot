# Job Portal REST API – Spring Boot
A backend Job Portal application built using Spring Boot that provides RESTful APIs to manage job postings. 
This project implements complete CRUD operations with a layered architecture and database integration using Spring Data JPA.

## Features

- RESTful API for managing job postings  
- Create, read, update, and delete job records  
- Layered architecture (Controller → Service → Repository)  
- Database persistence using Spring Data JPA  
- JSON-based request and response handling  
- API testing with Postman  

## Technologies Used

- Java  
- Spring Boot  
- Spring Web (REST API)  
- Spring Data JPA  
- MySQL / H2 Database  
- Maven  
- Postman  

## Project Structure

src/main/java/com/loga/spring_rest_project/
│
├── controller → Handles REST API endpoints
├── service → Business logic layer
├── repository → Database access layer
├── model → JobPost entity
└── SpringRestProjectApplication.java


## API Endpoints

| Method | Endpoint         | Description               |
|--------|------------------|---------------------------|
| POST   | /jobPost         | Add a new job post        |
| GET    | /jobPosts        | Get all job posts         |
| GET    | /jobPost/{id}    | Get job post by ID        |
| PUT    | /jobPost/{id}    | Update existing job post  |
| DELETE | /jobPost/{id}    | Delete job post           |

## Sample JSON Request

```json
{
  "postId": 1,
  "postProfile": "Java Developer",
  "postDesc": "Looking for Spring Boot developer",
  "reqExperience": 2
  "postTechStack" : Spring boot, Spring Data JPA, REST Api
}

How to Run
1)Clone the repository
2)Open the project in IntelliJ / Eclipse
3)Configure database in application.properties
	spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
	spring.datasource.username=your_username
	spring.datasource.password=your_password
4)Run the application
	mvn spring-boot:run
5)Test APIs using Postman at
	http://localhost:8080
