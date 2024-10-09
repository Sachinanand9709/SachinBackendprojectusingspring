Project Setup Instructions:
Clone the Repository:
Clone the project to your local machine using the command:

git clone <repository-url>
Prerequisites:
Ensure you have Java (JDK 11+), Maven, and Spring Boot installed.


Build the Project:
Navigate to the project directory and run the following command to build the project:

mvn clean install
Run the Application:
Start the Spring Boot application by running:


mvn spring-boot:run
Testing API Endpoints:
Use Postman or curl to interact with the API.

Retrieve all courses: GET /courses
Add a course: POST /courses
Update a course: PUT /courses
Delete a course: DELETE /courses/{courseId}
