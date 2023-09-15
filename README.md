# User_Management_app

A User Management System implemented using the Spring framework. The system allows you to perform basic CRUD (Create, Read, Update, Delete) operations on user data.

## Requirements

- Java Development Kit (JDK) 8 or later
- Spring Boot
- Spring web 
- lombork
- Postman (for testing the API endpoints)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-username/user-management-system.git

# Build the Project
cd user-management-system
./mvnw clean install

#Run the Application
./mvnw spring-boot:run

The User Management System will be accessible at http://localhost:8080/users.

API Endpoints
POST /users/addUser - Add a new user. Request body should contain user details.
GET /users/getUser/{userId} - Get a user by their ID.
GET /users/getAllUser - Get all users.
PUT /users/updateUserInfo/{userId} - Update user information by their ID. Request body should contain updated user details.
DELETE /users/deleteUser/{userId} - Delete a user by their ID.

Example Usage
Add a User
Send a POST request to http://localhost:8080/users/addUser with the following JSON payload:
{
        "userId": 0,
        "userName": "John",
        "userAddress": "Varansi",
        "userContact": "9876543201",
        "userType": "ADMIN"
}

Get a User
Send a GET request to http://localhost:8080/users/getUser/{userId} with the user ID you want to retrieve.

Get All Users
Send a GET request to http://localhost:8080/users/getAllUser to retrieve all users.

Update User Information
Send a PUT request to http://localhost:8080/users/updateUserInfo/{userId} with the following JSON payload:
{
        "userId": 1,
        "userName": "rohit",
        "userAddress": "Bhadohi",
        "userContact": "9876527201",
        "userType": "CUSTOMER"
}
Delete a User
Send a DELETE request to http://localhost:8080/users/deleteUser/{userId} with the user ID you want to delete.

License
This project is licensed under the MIT License.
