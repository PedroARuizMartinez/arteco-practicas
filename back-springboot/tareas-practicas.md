# Introducción a Spring Boot

## Objetivo General
Familiarizarse con el desarrollo de aplicaciones utilizando Spring Boot, desde la configuración inicial hasta la creación de un CRUD básico gestionado a través de una interfaz web con Thymeleaf.

## Ejercicio 1: Instalación y Configuración del Entorno
- **Objetivo:** Configurar el entorno de desarrollo necesario para trabajar con Spring Boot.
  - Instalar Java JDK (versión 8 o superior).
  - Instalar un IDE (IntelliJ IDEA).
  - Instalar Postman.
  - Instalar gestor de versiones (Git).
- **Tareas:**
  - Crear un proyecto básico de Spring Boot utilizando [Spring Initializr](https://start.spring.io).
  - Seleccionar dependencias esenciales: Spring Web.
  - Ejecutar la aplicación localmente y explorar la estructura del proyecto.
- **Lectura recomendada:**
  - [Guía de inicio rápido de Spring Boot](https://spring.io/quickstart)
  - [Documentación de Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)

## Ejercicio 2: Creación de Controladores y Rutas Básicas
- **Objetivo:** Entender los conceptos básicos de controladores y rutas en Spring Boot.
- **Tareas:**
  - Crear un controlador simple con una ruta que devuelva un mensaje de texto como "Hola, Mundo".
  - Añadir una segunda ruta que acepte un parámetro en la URL y devuelva un saludo personalizado.
- **Lectura recomendada:**
  - [Controladores en Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-controller)
  - [Tutorial de Spring MVC en Baeldung](https://www.baeldung.com/spring-mvc-tutorial)

## Ejercicio 3: Manejo de Plantillas con Thymeleaf
- **Objetivo:** Aprender a utilizar Thymeleaf para generar vistas dinámicas.
- **Tareas:**
  - Añadir la dependencia de Thymeleaf al proyecto.
  - Crear una página HTML básica que muestre un mensaje desde el backend.
  - Modificar la página para que muestre una lista de nombres generada en el controlador.
- **Lectura recomendada:**
  - [Introducción a Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
  - [Guía de Thymeleaf en Spring Boot](https://spring.io/guides/gs/serving-web-content/)

## Ejercicio 4: Integración con Bases de Datos usando Spring Data JPA
- **Objetivo:** Aprender a integrar una base de datos en la aplicación Spring Boot.
- **Tareas:**
  - Añadir una base de datos en memoria (H2) al proyecto.
  - Crear una entidad (por ejemplo, `Usuario`) y un repositorio para manejar los datos.
  - Implementar un controlador para crear y recuperar usuarios desde la base de datos.
- **Lectura recomendada:**
  - [Introducción a Spring Data JPA](https://spring.io/guides/gs/accessing-data-jpa/)
  - [Documentación de Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)

## Ejercicio 5: Implementación de un CRUD Completo
- **Objetivo:** Desarrollar un CRUD completo para la entidad `Usuario` utilizando Spring Boot y Thymeleaf.
- **Tareas:**
  - Crear los métodos necesarios en el controlador para manejar las operaciones de Crear, Leer, Actualizar y Eliminar usuarios.
  - Crear vistas Thymeleaf para listar todos los usuarios, crear un nuevo usuario, actualizar un usuario existente y eliminar un usuario.
- **Lectura recomendada:**
  - [Guía para crear un CRUD con Spring Boot y Thymeleaf](https://www.baeldung.com/spring-boot-crud-thymeleaf)

## Ejercicio 6: Validación de Entradas y Manejo de Errores
- **Objetivo:** Aprender a validar entradas de usuario y manejar errores de forma adecuada.
- **Tareas:**
  - Añadir validación básica a las entradas de usuario (por ejemplo, longitud mínima para nombres).
  - Crear una página de error personalizada que se muestre cuando se produzcan excepciones en la aplicación.
- **Lectura recomendada:**
  - [Validación en Spring Boot](https://spring.io/guides/gs/validating-form-input/)

## Ejercicio 7: Pruebas y Despliegue Local
- **Objetivo:** Realizar pruebas básicas de la aplicación y desplegarla localmente.
- **Tareas:**
  - Crear pruebas unitarias básicas para los controladores y servicios utilizando JUnit y Mockito.
  - Ejecutar las pruebas y corregir cualquier error encontrado.
  - Desplegar la aplicación localmente usando el plugin de Spring Boot Maven.
- **Lectura recomendada:**
  - [Guía de pruebas con Spring Boot](https://spring.io/guides/gs/testing-web/)
  - [Despliegue de aplicaciones Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html)



