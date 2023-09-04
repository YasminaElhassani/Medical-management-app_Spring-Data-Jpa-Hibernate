## Medical Management Application
## Spring Data, JPA, and Hibernate

This is a Spring Boot application that allows you to manage patients, appointments, consultations, and doctors in a medical office. 
This application uses Spring Data, JPA, and Hibernate to manage the database and handle the associations between entities.


## Configuration

To use this application, you need to have a MySQL database and configure the connection settings in the application.properties file. Here's an example configuration:

```
spring.datasource.url=jdbc:mysql://localhost:3306/medical
spring.datasource.username=root
spring.datasource.password=
```

## Running the application

To run the application, you can use the following command:

```
./mvnw spring-boot:run
```



