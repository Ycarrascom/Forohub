💬 ForoHub API

API REST desarrollada con Spring Boot para gestionar un foro de discusión.
Este proyecto permite crear, listar, actualizar y eliminar tópicos dentro de un sistema de foro.

Proyecto desarrollado como parte del challenge Back-End de Alura + Oracle ONE.

🚀 Tecnologías utilizadas

☕ Java 17+

🌱 Spring Boot

📦 Maven

🗄️ MySQL

🔐 Spring Security

📄 JPA / Hibernate

🔗 REST API

🧪 Postman / Insomnia para pruebas

📁 Estructura del proyecto
src/main/java/com/alura/forohub
│
├── controller
│   └── TopicoController.java
│
├── model
│   └── Topico.java
│
├── repository
│   └── TopicoRepository.java
│
├── dto
│
├── service
│
└── ForoHubApplication.java
⚙️ Configuración del proyecto
1️⃣ Clonar el repositorio
git clone https://github.com/Ycarrascom/Forohub.git
cd Forohub
2️⃣ Configurar la base de datos

Crear la base de datos en MySQL:

CREATE DATABASE forohub;
3️⃣ Configurar application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
4️⃣ Ejecutar el proyecto

Con Maven:

mvn spring-boot:run

O desde IntelliJ con Run.

El servidor iniciará en:

http://localhost:8080
📌 Endpoints principales
Crear tópico
POST /topicos

Body:

{
  "titulo": "Error en Spring Boot",
  "mensaje": "No puedo conectar con MySQL"
}
Listar tópicos
GET /topicos
Actualizar tópico
PUT /topicos/{id}
Eliminar tópico
DELETE /topicos/{id}
🧪 Pruebas

Se recomienda usar:

Postman

Insomnia

Para probar los endpoints REST.

📚 Objetivo del proyecto

El objetivo de este proyecto es practicar:

Desarrollo de API REST

Uso de Spring Boot

Persistencia con JPA / Hibernate

Buenas prácticas en arquitectura backend
