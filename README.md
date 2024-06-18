# Spring Boot User Registration API

curl: 
  register-endpoint: 

  curl -X POST http://localhost:8080/api/user/register -H "Content-Type: application/json" -d '{
  "username": "testuser",
  "email": "test@example.com",
  "password": "password"
}'

  fetch-endpoint:

  curl -X GET "http://localhost:8080/api/user/fetch?username=testuser"

Tests are written in the src/test/java/com/example/demo/service/UserServiceTest.java
  

This is a simple Spring Boot application that provides user registration and user details fetching functionality.

## Prerequisites

- Java 17
- Maven
- Git

## Running the Application

1. Clone the repository:

    ```bash
    git clone https://github.com/RAJinaJAR/spring-boot-user-registration.git
    cd TO-THE-PROJECT-REPO
    ```

2. Build and run the application:

    ```bash
    mvn spring-boot:run
    ```

3. Access the application:

    - Register a user: `POST http://localhost:8080/api/user/register`
    - Fetch user details: `GET http://localhost:8080/api/user/fetch?username=USERNAME`

## API Endpoints

### Register a User

- **URL:** `/api/user/register`
- **Method:** `POST`
- **Request Body:**

    ```json
    {
        "username": "john_doe",
        "email": "john@example.com",
        "password": "password123"
    }
    ```

- **Success Response:**

    - **Code:** `201 Created`
    - **Content:** `"User registered successfully"`

- **Error Response:**

    - **Code:** `409 Conflict`
    - **Content:** `"User already exists"`

### Fetch User Details

- **URL:** `/api/user/fetch`
- **Method:** `GET`
- **Query Parameter:** `username`
- **Success Response:**

    - **Code:** `200 OK`
    - **Content:** 

    ```json
    {
        "username": "john_doe",
        "email": "john@example.com"
    }
    ```

- **Error Response:**

    - **Code:** `404 Not Found`
    - **Content:** `"User not found"`
