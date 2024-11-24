**Product Category Catalog App**
A Spring Boot application for managing categories and products, providing RESTful APIs for performing CRUD operations with pagination and relational data handling.

**Features**
RESTful APIs for Category and Product management.
CRUD operations with database updates.
Pagination for efficient data retrieval.
Relational mapping between categories and products.
Easy-to-use API testing using Postman.

**Technologies Used**
Backend: Spring Boot
Database: MySQL
Build Tool: Apache Maven
Development Environment: Spring Tool Suite (STS)
API Testing: Postman


**Getting Started**
**Cloning the Repository**
Clone the project repository using the following command:
git clone https://github.com/gauravlagad96/ProductCategoryCatlogApp  

**Setting Up the Development Environment**
Install Java Development Kit (JDK) (version 17 or higher).
Set up Spring Tool Suite (STS) or any other preferred IDE.
Configure Apache Maven for dependency management.

**Database Configuration**
Install MySQL.
Create a database named category_product_manager_db using MySQL Workbench or any SQL client.
The required tables and relationships will be auto-created based on the entity definitions.

**Running the Application**
Navigate to the project directory and run the application using:
mvn spring-boot:run  
The backend server will start at http://localhost:8080.

**API Endpoints**

**Category Endpoints**
Method	Endpoint	Description
POST	/categories	Create a new category.
GET	/categories	Fetch all categories.
GET	/categories/{id}	Fetch a category by ID.
PUT	/categories/{id}	Update a category by ID.
DELETE	/categories/{id}	Delete a category by ID.

**Product Endpoints**
Method	Endpoint	Description
POST	/products	Create a new product.
GET	/products	Fetch all products (paginated).
GET	/products/{id}	Fetch a product by ID.
PUT	/products/{id}	Update a product by ID.
DELETE	/products/{id}	Delete a product by ID.

**Testing the APIs**
**Using Postman**
Import the Postman collection or manually create requests for the above endpoints.
Test the following:
Create: Add new categories and products.
Update: Modify existing records.
Retrieve: Fetch records with and without pagination.
Delete: Remove records and verify database updates.

**Database Verification**
Use MySQL Workbench to inspect the category_product_manager_db database and verify data consistency after API operations.

**Database Design**
The database consists of the following entities:

Category:
id (Primary Key)
name

Product:
id (Primary Key)
name
price
category_id (Foreign Key)


**Author**
Developed by Gaurav Lagad.
