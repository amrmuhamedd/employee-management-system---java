# Employee Management System - Java, Spring Boot, PostgreSQL

This is a fully functional **Employee Management System** built using **Java**, **Spring Boot**, and **PostgreSQL**. The system allows for basic CRUD operations (Create, Read, Update, Delete) on employee records. It is designed to manage employee data, including their names, emails, positions, and salaries. The application is built with RESTful APIs to perform the operations, and it uses **PostgreSQL** as the database to persist employee information.

## Key Features:
- **Create Employee**: Add new employee records with details such as name, email, position, and salary.
- **Read Employee**: Retrieve employee details by ID or fetch all employee records.
- **Update Employee**: Modify an existing employee's details by providing the employee ID.
- **Delete Employee**: Remove an employee record based on the provided ID.

## Technologies Used:
- **Java**: The primary programming language used for backend development.
- **Spring Boot**: A framework that simplifies the development of Java-based applications, enabling fast and efficient development of RESTful APIs.
- **PostgreSQL**: A relational database management system used to store and retrieve employee data.
- **JPA/Hibernate**: Java Persistence API (JPA) with Hibernate for object-relational mapping (ORM) to interact with the PostgreSQL database.
- **Spring Data JPA**: For easy integration with PostgreSQL and managing database operations.

## Postman Collection:
You can explore and test the API endpoints using the [Postman Collection](https://documenter.getpostman.com/view/15215271/2sAYJ1mNGT).

Installation & Setup:
1. Clone the repository:

```bash
git clone https://github.com/your-username/employee-management-system.git
```
2. Navigate into the project directory:

```bash
cd employee-management-system
```

3. Set up the PostgreSQL database and create a database named employee_management.

4. Modify the application.properties or application.yml file to set up the database connection:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_management
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

Run the Spring Boot application:

```bash
./mvnw spring-boot:run
```

The application will run on http://localhost:8080 by default.
