## Medical Management Application
## Spring Data, JPA, and Hibernate

This is a Spring Boot application that allows you to manage patients, appointments, consultations, and doctors in a medical office. 
This application uses Spring Data, JPA, and Hibernate to manage the database and handle the associations between entities.


## What is Spring Data?
Spring Data is a powerful tool that provides a unified way of working with data in Spring applications. It offers a set of abstractions and templates that simplify the task of working with different types of data stores, including relational databases, NoSQL databases, and in-memory data structures.

## What is JPA?
Java Persistence API (JPA) is a Java standard for mapping Java objects to relational databases. It provides a set of annotations and interfaces that allow developers to define the mapping between Java objects and database tables, and to perform database operations using object-oriented programming concepts.

## What is Hibernate?
Hibernate is an open-source Object-Relational Mapping (ORM) framework that provides a bridge between Java objects and relational databases. It maps Java classes to database tables and uses SQL under the hood to perform database operations.

Together, Spring Data, JPA, and Hibernate provide a powerful set of tools for managing data in Spring applications. In this application, we use these technologies to manage the database and handle the associations between the Patient, appointments, Consultation, and Medecin entities.

## Configuration

To use this application, you need to have a MySQL database and configure the connection settings in the application.properties file. Here's an example configuration:

```
spring.datasource.url=jdbc:mysql://localhost:3306/medical
spring.datasource.username=root
spring.datasource.password=secret
```

## Running the application

To run the application, you can use the following command:

```
./mvnw spring-boot:run
```
The application will be accessible at http://localhost:8086.



