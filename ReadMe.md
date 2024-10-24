# User Management Application

This is a simple Spring Boot application for managing users with dependency injection. It demonstrates three methods of injecting dependencies: field-based, constructor-based, and setter-based injection.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- Manage users with basic CRUD operations.
- Demonstrates three types of dependency injection:
  - Field-based injection
  - Constructor-based injection
  - Setter-based injection

## Technologies

- Java 11 or higher
- Spring Boot
- Spring Data JPA
- H2 Database (for in-memory database)
- Maven

## Project Structure

src
 └── main
     ├── java
     │    └── user.management.dependency_injection
     │         ├── entity
     │         │    └── User.java
     │         ├── repository
     │         │    └── UserRepository.java
     │         ├── service
     │         │    └── UserService.java
     │         └── DependencyInjectionApplication.java
     │         └── LoadDatabase.java
     └── resources
          └── application.properties



## Installation

1. Clone the repository:

   ```bash
    git clone https://github.com/sensamie1/user-management-di.git
    cd user-management


Make sure you have Maven installed. You can download it from Maven's official site.

2. Build the project:

   ```bash
    mvn clean install

3. Run the application:

   ```bash
    mvn spring-boot:run

The application will start on http://localhost:8080.

## Usage
You can interact with the application using tools like Postman or curl.

## API Endpoints
Get All Users
Field-based Injection:
GET /api/users/field

Constructor-based Injection:
GET /api/users/constructor

Setter-based Injection:
GET /api/users/setter

Get User by ID
Field-based Injection:
GET /api/users/field/{id}

Constructor-based Injection:
GET /api/users/constructor/{id}

Setter-based Injection:
GET /api/users/setter/{id}

Save User
Field-based Injection:
POST /api/users/field

Constructor-based Injection:
POST /api/users/constructor

Setter-based Injection:
POST /api/users/setter

Request Body: json
  {
    "name": "Alice Smith",
    "email": "alice.smith@example.com"
  }

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue to discuss improvements.

## License
This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.