# 📚 Library Catalog API

A simple Java-based RESTful API built with Spring Boot for managing a library’s book catalog.  
This project demonstrates clean code structure, object-oriented design, REST principles, and API testing using Postman.

---

## 🚀 Features

- ✅ Add a new book to the catalog  
- ✅ Retrieve a list of all books  
- ✅ Fetch details of a book by ID  
- ✅ Delete a book by ID  
- ✅ Update book availability  
- ✅ Input validation using Jakarta Validation  
- ✅ API tested with Postman  

---

## 🛠️ Tech Stack

- Java 17  
- Spring Boot  
- Spring Web  
- Lombok  
- Jakarta Validation  
- Postman  
- In-memory data storage using `Map<Integer, Book>`

---

## 🗂️ Project Structure

```
com.example.demo
├── controller       # REST endpoints (BookController)
├── model            # Book class with validation
├── service          # Business logic (BookService)
├── repository       # In-memory simulation (optional)
└── LibraryCatalogApplication.java
```

---

## 📦 How to Run the Project

### ✅ Prerequisites:
- Java 17+ installed  
- Maven installed  
- IDE (like IntelliJ or VS Code)

### 🔧 Steps to Run:
```bash
git clone https://github.com/divyap27/Library-Catalog.git
cd "demo (1)/demo"
./mvnw spring-boot:run
```

📍 Application will run at:  
**http://localhost:8080**

---

## 🔗 API Endpoints

| Method   | Endpoint                                      | Description              |
|----------|-----------------------------------------------|--------------------------|
| `POST`   | `/api/books`                                  | Add a new book           |
| `GET`    | `/api/books`                                  | Get all books            |
| `GET`    | `/api/books/{id}`                             | Get book by ID           |
| `DELETE` | `/api/books/{id}`                             | Delete book by ID        |
| `PATCH`  | `/api/books/{id}/availability?available=true` | Update book availability |

---

## 📥 Postman Collection

This project has been tested using Postman.  
You can download and import the collection below:

🔽 [Download Postman Collection](LibraryCatalog.postman_collection.json)

---

## 🧠 Learning Highlights

- Hands-on practice with Spring Boot REST APIs  
- Used `@Valid`, `@NotBlank` for field validation  
- Built clean separation between controller, service, and model layers  
- Demonstrated how to simulate backend logic without a database  

---

## 👩‍💻 Author

**Divya Pawar**  


---
