# First REST API – Task 2

## Description
This project is a Spring Boot REST API created for Task 2 of the *Spring Framework Apps* course at Akademia Finansów i Biznesu Vistula. The application manages products and provides full CRUD functionality using REST principles.

## Technologies
Java, Spring Boot, Spring Web, Spring Data JPA, H2 Database, Swagger (OpenAPI), Maven

## Functionality
The API allows:
- creating a product (POST)
- retrieving a product by ID (GET)
- retrieving all products (GET)
- updating a product (PUT)
- deleting a product (DELETE)

## Running the Application
1. Open the project in IntelliJ IDEA
2. Reload Maven dependencies
3. Run `FirstRestApiApplication`
4. Application runs at `http://localhost:8080`

## Swagger UI
API documentation and testing available at:
`http://localhost:8080/swagger-ui/index.html`

## H2 Database Console
`http://localhost:8080/console`  
JDBC URL: `jdbc:h2:mem:testdb`

## Example Request
```json
POST /api/v1/products
{
  "name": "Laptop"
}
```
## Author
`Omar Twafa`

## ScreenShots 

![Description](screenshots/2.png)
![Description](screenshots/3.png)
![Description](screenshots/4.png)
![Description](screenshots/5.png)
