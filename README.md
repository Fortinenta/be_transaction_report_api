# Transaction Report API

This is the backend API for a transaction reporting system. It allows users to manage customers, products, taxes, and transactions.

## Features

*   User authentication and authorization with JWT
*   CRUD operations for customers, products, and taxes
*   Create and view transactions
*   Generate transaction reports

## Technologies

*   Java
*   Spring Boot
*   Spring Security
*   JPA (Hibernate)
*   PostgreSQL
*   Maven

## Setup

1.  **Clone the repository:**
    ```bash
    git clone https://your-repository-url.git
    ```
2.  **Configure the database:**
    *   Open `src/main/resources/application.properties`
    *   Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties to match your PostgreSQL configuration.
3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    The application will be available at `http://localhost:8080`.

## API Endpoints

The API endpoints are defined in the controllers:

*   `AuthController`: User authentication and registration.
*   `CustomerController`: Manage customers.
*   `ProductController`: Manage products.
*   `TaxController`: Manage taxes.
*   `TransactionController`: Manage transactions.
*   `ReportController`: Generate reports.

You can find the full OpenAPI specification in the `Postman Collection/openapi.json` file.

## Default Credentials

The system comes with two default users:

*   **Admin:**
    *   **Username:** `admin`
    *   **Password:** `adminpass`
*   **User:**
    *   **Username:** `user`
    *   **Password:** `userpass`
