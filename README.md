# Task Management System

Backend API for managing tasks and workflows, built with Spring Boot.
Designed to demonstrate Layered Architecture, RESTful standards, and Exception Handling.

## Technologies Used
- **Java 17**
- **Spring Boot 3** (Spring Web, Spring Data JPA)
- **Database:** MySQL
- **Tools:** Maven, Lombok, Postman

## Features
- [x] CRUD Operations for Tasks
- [x] Update Task Status (PATCH)
- [x] Assign Task to User
- [x] Global Exception Handling (Standardized JSON error response)
- [ ] Filter Tasks by Status (Upcoming)

## How to Run
1. Clone the repository
2. Configure MySQL database in `application.properties`
3. Run `mvn spring-boot:run`