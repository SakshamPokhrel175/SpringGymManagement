
# Spring Gym Management

## Description
Spring Gym Management is a simple RESTful API application built using **Spring Boot**. It provides basic functionality to manage gym details, including adding, updating, retrieving, and deleting gyms. The application is designed to showcase REST API development using Spring Boot.

---

## Features
1. **CRUD Operations**:
   - **Create**: Add a new gym.
   - **Read**: View all gyms or a specific gym by its ID.
   - **Update**: Modify the details of an existing gym.
   - **Delete**: Remove a gym by its ID.
2. **In-memory storage**: Gyms are stored in a temporary in-memory list for demonstration purposes.

---

## Project Structure
### Packages
- **`com.spring.sharda.gym`**: Contains all the project files for the Gym Management system:
  - **Model**: `Gym.java` - Represents the gym entity with attributes like `gymId`, `gymName`, and `gymDescription`.
  - **Controller**: `GymController.java` - Defines the REST API endpoints for managing gyms.
  - **Service**: `GymService.java` - Contains the business logic and in-memory storage for gyms.



## REST API Endpoints

### **Base URL**
http://localhost:8080/gyms

### **Endpoints**

1. **Get all gyms**  
   **`GET /gyms`**  
   **Response**:
   ```json
   [
       {
           "gymId": "101",
           "gymName": "Fitness Gym",
           "gymDescription": "A place for all fitness enthusiasts"
       },
       {
           "gymId": "102",
           "gymName": "Power Gym",
           "gymDescription": "A power-packed gym with modern equipment"
       }
   ]
   ```

2. **Get a gym by ID**  
   **`GET /gyms/{id}`**  
   **Response**:
   ```json
   {
       "gymId": "101",
       "gymName": "Fitness Gym",
       "gymDescription": "A place for all fitness enthusiasts"
   }
   ```

3. **Add a new gym**  
   **`POST /gyms`**  
   **Request Body**:
   ```json
   {
       "gymId": "104",
       "gymName": "New Gym",
       "gymDescription": "Description of the new gym"
   }
   ```
   **Response**: `201 Created`

4. **Update a gym**  
   **`PUT /gyms/{id}`**  
   **Request Body**:
   ```json
   {
       "gymId": "104",
       "gymName": "Updated Gym",
       "gymDescription": "Updated description"
   }
   ```
   **Response**: `200 OK`

5. **Delete a gym**  
   **`DELETE /gyms/{id}`**  
   **Response**: `204 No Content`

---

## Running the Application

### Prerequisites
- Java Development Kit (JDK 8 or higher)
- Maven

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/SakshamPokhrel175/SpringGymManagement.git
   ```
2. Navigate to the project directory:
   ```bash
   cd SpringGymManagement
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

The application will start on **`http://localhost:8080`**.

---

## Future Enhancements
1. Integrate with a database (e.g., MySQL or PostgreSQL) for persistent data storage.
2. Add user authentication and authorization.
3. Expand the API to include additional features like memberships, trainers, and gym schedules.

---

## Technologies Used
- **Spring Boot** for REST API development
- **Java** as the programming language
- **Maven** for dependency management
- **Spring Web** for building web applications

---

## Author
Created by [Saksham Pokhrel](https://github.com/SakshamPokhrel175).
```

This version is formatted correctly and ready for you to copy and paste directly into your `README.md`. Let me know if you need any adjustments!
