# Redis Cache Example - Spring Boot Project

This project demonstrates how to use **Redis cache** in a Spring Boot application to optimize database performance using caching.

##  Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Cache (Redis)
- Redis Server
- MySQL
- Lombok

---
---

##  Configuration - `application.properties`

```properties
spring.application.name=redishcash-1
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=root
spring.datasource.password=Mohan@12345
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.cache.type=redis
management.endpoints.web.exposure.include=*

===========================================================================================================================================

 API Endpoints
Method	Endpoint	Description
POST	/add	Add a new user
GET	/retrive/{id}	Get user by ID (cached)
PUT	/modify	Update user details
DELETE	/delete/{id}	Delete user by ID
===========================================================================================================================================

Redis Caching
@Cacheable: Used to cache the result of retrive() based on id.

@CachePut: Updates the cache after modifying user data.

@CacheEvict: Removes the cache entry when a user is deleted
