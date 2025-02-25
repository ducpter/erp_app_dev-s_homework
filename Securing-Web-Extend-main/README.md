# Securing a Web Application

Name: Phạm Văn Đức  
StudentID: 22024561

## Overview
This project demonstrates how to secure a web application using Spring Boot and Spring Security. It provides basic authentication and authorization features, utilizing a simple in-memory user store.

## Key Features
- User authentication and authorization
- Custom login page
- In-memory user store
- Thymeleaf templates for the user interface

## Installation Guide
1. Create a database name `securitydb`

2. Build the project using Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Usage Guide
- Access the application at `http://localhost:8080`
- Log in with the following credentials:
  - User:
      - Username: `user`
      - Password: `user123`
  - Admin:
      - Username: `admin`
      - Password: `admin123`
  - SuperAdmin: Role Admin and User
      - Username: `superadmin`
      - Password: `superadmin123`

## Extend Version
### Store data in DataBase and BCryptPasswordEncoder
![Database](src/main/resources/img/ERD.png)
![Database](src/main/resources/img/1.png)
![Database](src/main/resources/img/2.png)
![Database](src/main/resources/img/3.png)

### Authentication and Authorization
| Path        | Access Role    | Description                     |
|-------------|--------------|---------------------------------|
| `/` or `/home` | Everyone    | No authentication required      |
| `/admin`    | Only ADMIN    | Only ADMIN users can access     |
| `/user`     | Only USER     | Only USER users can access      |
| `/hello`    | USER & ADMIN  | Both ADMIN and USER can access  |
| Other paths | Authenticated users | Requires login to access |

### User
![Database](src/main/resources/img/hellouser.png)
![Database](src/main/resources/img/weluser.png)
![Database](src/main/resources/img/userEr.png)
### Admin 
![Database](src/main/resources/img/helloadmin.png)
![Database](src/main/resources/img/weladmin.png)
![Database](src/main/resources/img/adminEr.png)
### SuperAdmin
![Database](src/main/resources/img/sp.png)
![Database](src/main/resources/img/sp1.png)
![Database](src/main/resources/img/sp2.png)
