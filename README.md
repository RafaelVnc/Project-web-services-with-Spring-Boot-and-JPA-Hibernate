# Web services with Spring Boot and JPA / Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Faelz77/Project-web-services-with-Spring-Boot-and-JPA-Hibernate/blob/main/LICENSE) 

# About the project

This is a web services project elaborated and created during my journey through the **course:**  [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/ "Course Link") (PT-BR).

Web services are applications or systems that communicate over the internet, allowing the exchange of data and functionalities between different devices and platforms.

Obs: I changed this application to currently work with the H2 database, however it is fully prepared to be launched on a hosting tool, such as Heroku, as the profiles for it are already developed.

# Objectives

- Create Spring Boot Java project
- Implement domain model
- Structure logical layers: resource, service, repository
- Configure test database (H2)
- Populate the database
- CRUD - Create, Retrieve, Update, Delete
- Exception handling

# Vantages of using Spring Boot and JPA/Hibernate:

By using Spring Boot and JPA to develop web services, you can create efficient, scalable, and easy-to-maintain applications with features such as dependency injection, automatic configurations, and simplified object-relational mapping.

## Domain Model
![Domain Model](https://github.com/Faelz77/assets/blob/main/WSSBJPA/DomainModel.png)

## Domain Instances
![Domain Instances](https://github.com/Faelz77/assets/blob/main/WSSBJPA/DomainInstances.png)

## Logical Layers
![Logical Layers](https://github.com/Faelz77/assets/blob/d1eb49ef97bc4209ffc062451d6d8a62c4da2b0c/WSSBJPA/Layers.png)

# Technologies involved

## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Production deployment
- H2 local memory database

# How to execute the project:

## Back end
Prerequisite: Java 17, Postman for test requests

```bash
# clone repository
git clone https://github.com/Faelz77/Project-web-services-with-Spring-Boot-and-JPA-Hibernate.git

# execute project
./mvnw spring-boot:run

# database url:
http://localhost:8080/
```

# Author

Rafael Oliveira Venancio

www.linkedin.com/in/rafaelvnc
