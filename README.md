# REST API Endpoints Assignment

## Project Description
This project is a RESTful API developed using the **Spring Boot** framework and **Spring JPA**. The API provides functionality to manage product data with full **CRUD (Create, Read, Update, Delete)** operations.

## Features
- **POST**: Add new products  
  `POST http://localhost:8080/api/products`

- **GET**: Retrieve all products  
  `GET http://localhost:8080/api/products`

- **GET by ID**: Fetch a specific product by its ID  
  `GET http://localhost:8080/api/products/{id}`  
  Example: `GET http://localhost:8080/api/products/2`

- **PUT**: Update an existing product by its ID  
  `PUT http://localhost:8080/api/products/{id}`  
  Example: `PUT http://localhost:8080/api/products/3`

- **DELETE**: Remove a product by its ID  
  `DELETE http://localhost:8080/api/products/{id}`  
  Example: `DELETE http://localhost:8080/api/products/3`

## Tools Used
- **Spring Boot**: For building and running the REST API.
- **Spring JPA**: For database interaction.
- **Insomnia**: For testing API endpoints.

## How to Run
1. Clone the project repository.
2. Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the main application class (e.g., `Application.java`).
4. Access the API via `http://localhost:8080`.
5. Use tools like **Insomnia** or **Postman** to test the endpoints.

## Example Usage
### POST Request Body:
```json
{
  "name": "Valorant",
  "price": 39.99,
}

