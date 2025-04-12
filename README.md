# Job Portal Web Application - Spring Boot 3

This project is a Job Portal web application built using Spring Boot 3.

## Overview

This application provides a platform for job seekers to find and apply for jobs, and for employers to post job openings and manage applications. Key features include:

* **Job Listings:** Browse and search for available job opportunities.
* **User Authentication and Authorization:** Secure user registration, login, and role-based access control (employers vs. job seekers).
* **Profile Management:** Job seekers can create and manage their profiles, including resumes and skills. Employers can manage their company profiles and job postings.
* **Application Management:** Job seekers can apply for jobs, and employers can review and manage applications.
* **Search and Filtering:** Robust search and filtering capabilities for job listings.
* **Responsive Design:** User-friendly interface accessible on various devices.

## Technologies Used

* **Spring Boot 3:** Core framework for building the application.
* **Spring MVC:** Model-View-Controller architecture for web development.
* **Thymeleaf:** Template engine for dynamic HTML rendering.
* **Spring Security:** Authentication and authorization.
* **Spring Data JPA:** Data access layer for interacting with the database.
* **Hibernate:** Object-Relational Mapping (ORM) framework.
* **MySQL:** Relational database management system.
* **HTML, CSS, JavaScript:** Front-end technologies.
* **Bootstrap (or similar):** CSS framework for responsive design.

## Features

* **Job Seeker Features:**
    * User registration and login.
    * Profile creation and management (resume, skills, etc.).
    * Job search and filtering.
    * Job application.
    * Application status tracking.
* **Employer Features:**
    * User registration and login.
    * Company profile management.
    * Job posting creation and management.
    * Application review and management.
    * Search applications based on keywords.
* **Admin Features (If implemented):**
    * User management.
    * Job posting management.
    * System configuration.

## Setup and Installation

1.  **Prerequisites:**
    * Java Development Kit (JDK) 17 or later.
    * MySQL database.
    * Maven or Gradle build tool.
    * An IDE like IntelliJ IDEA, Eclipse, or VS Code.
2.  **Clone the Repository:**
    ```bash
    git clone [your-repository-url]
    cd [your-repository-directory]
    ```
3.  **Configure Database:**
    * Create a MySQL database and update the `application.properties` (or `application.yml`) file with your database credentials.
    * Example application.properties:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        ```
4.  **Build the Application:**
    * Using Maven:
        ```bash
        mvn clean install
        ```
    * Using Gradle:
        ```bash
        gradle clean build
        ```

5.  **Run the Application:**
    * Using Maven:
        ```bash
        mvn spring-boot:run
        ```
    * Using Gradle:
        ```bash
        gradle bootRun
        ```
6.  **Access the Application:**
    * Open your web browser and navigate to `http://localhost:8080`.

## Project Structure

Markdown

# Job Portal Web Application - Spring Boot 3

This project is a Job Portal web application built using Spring Boot 3, following the structure and concepts taught in the Udemy course "Spring Boot 3 Project - Build a Job Portal Web Application" by Chad Darby and Ravi Kumar Singh.

## Overview

This application provides a platform for job seekers to find and apply for jobs, and for employers to post job openings and manage applications. Key features include:

* **Job Listings:** Browse and search for available job opportunities.
* **User Authentication and Authorization:** Secure user registration, login, and role-based access control (employers vs. job seekers).
* **Profile Management:** Job seekers can create and manage their profiles, including resumes and skills. Employers can manage their company profiles and job postings.
* **Application Management:** Job seekers can apply for jobs, and employers can review and manage applications.
* **Search and Filtering:** Robust search and filtering capabilities for job listings.
* **Responsive Design:** User-friendly interface accessible on various devices.

## Technologies Used

* **Spring Boot 3:** Core framework for building the application.
* **Spring MVC:** Model-View-Controller architecture for web development.
* **Thymeleaf:** Template engine for dynamic HTML rendering.
* **Spring Security:** Authentication and authorization.
* **Spring Data JPA:** Data access layer for interacting with the database.
* **Hibernate:** Object-Relational Mapping (ORM) framework.
* **MySQL:** Relational database management system.
* **HTML, CSS, JavaScript:** Front-end technologies.
* **Bootstrap (or similar):** CSS framework for responsive design.

## Features

* **Job Seeker Features:**
    * User registration and login.
    * Profile creation and management (resume, skills, etc.).
    * Job search and filtering.
    * Job application.
    * Application status tracking.
* **Employer Features:**
    * User registration and login.
    * Company profile management.
    * Job posting creation and management.
    * Application review and management.
    * Search applications based on keywords.
* **Admin Features (If implemented):**
    * User management.
    * Job posting management.
    * System configuration.

## Setup and Installation

1.  **Prerequisites:**
    * Java Development Kit (JDK) 17 or later.
    * MySQL database.
    * Maven or Gradle build tool.
    * An IDE like IntelliJ IDEA, Eclipse, or VS Code.
2.  **Clone the Repository:**
    ```bash
    git clone [your-repository-url]
    cd [your-repository-directory]
    ```
3.  **Configure Database:**
    * Create a MySQL database and update the `application.properties` (or `application.yml`) file with your database credentials.
    * Example application.properties:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        ```
4.  **Build the Application:**
    * Using Maven:
        ```bash
        mvn clean install
        ```
    * Using Gradle:
        ```bash
        gradle clean build
        ```

5.  **Run the Application:**
    * Using Maven:
        ```bash
        mvn spring-boot:run
        ```
    * Using Gradle:
        ```bash
        gradle bootRun
        ```
6.  **Access the Application:**
    * Open your web browser and navigate to `http://localhost:8080`.

## Project Structure

job-portal/
├── src/main/java/
│   ├── com/yourpackage/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── repository/
│   │   ├── service/
│   │   ├── config/
│   │   ├── security/
│   │   └── JobPortalApplication.java
├── src/main/resources/
│   ├── templates/
│   ├── static/
│   ├── application.properties (or application.yml)
├── pom.xml (or build.gradle)
└── README.md
