# Prácticas de Desarrollo Full Stack

## Instrucciones para el Practicante

1. **Clonar el Repositorio:**
   - Clona este repositorio en tu máquina local utilizando el siguiente comando:
     ```bash
     git clone <url-del-repositorio>
     ```

2. **Crear una Nueva Rama:**
   - Crea una nueva rama a partir de `main` con el siguiente nombre:
     ```bash
     git checkout -b practicante-usuario
     ```
     Reemplaza `usuario` con tu nombre. Por ejemplo, para un usuario llamado Pedro, el comando sería:
     ```bash
     git checkout -b practicante-pedro
     ```

3. **Organización de la Carpeta de Solución:**
   - Dentro del repositorio clonado, crea una carpeta llamada `solucion`. Dentro de esta carpeta, crea una subcarpeta para cada ejercicio y coloca la solución correspondiente en cada una. Por ejemplo:
     - `back-springboot/solucion/ejercicio-1`
     - `front-react-typescript/solucion/ejercicio-1`

4. **Commit y Push de las Soluciones:**
   - Una vez que completes un ejercicio, realiza un commit con un mensaje descriptivo y empuja los cambios a tu rama:
     ```bash
     git add .
     git commit -m "Solución del ejercicio X"
     git push origin practicante-usuario
     ```

## Resumen de Tareas Prácticas

A continuación se presenta un resumen de las tareas y objetivos a realizar durante las prácticas:

## 1. Prueba de Nivel Java

Antes de comenzar con las prácticas específicas, se realizará una **prueba de nivel** para evaluar las habilidades actuales del practicante. Esta prueba incluirá:

- **Refactorización de Código:** Mejorar la calidad y organización de un código existente.
- **Creación de Clases y Componentes:** Desarrollar clases en Java (Backend) y componentes en React (Frontend) siguiendo las mejores prácticas.
- **Testing:** Escribir y ejecutar pruebas unitarias e integración utilizando JUnit (Backend) y Jest (Frontend).
- **Uso de TypeScript:** Aplicar buenas prácticas en el uso de TypeScript, evitando el uso de `any` y `object`.

## 2. Backend: Desarrollo con Spring Boot

En la parte de **Backend**, los practicantes trabajarán con **Spring Boot** para desarrollar una API REST completa. Las actividades incluyen:

- **Configuración del Proyecto:** Creación de un proyecto base utilizando Spring Boot.
- **Desarrollo de Servicios REST:** Implementación de endpoints CRUD.
- **Persistencia de Datos:** Integración de una base de datos utilizando JPA.
- **Testing:** Escribir pruebas unitarias e integración con **JUnit** y **Mockito**.
- **Documentación:** Uso de **Swagger** para documentar la API.
- **Despliegue Local:** Realización de pruebas y despliegue local de la aplicación.

[Detalles completos del plan de Backend](./back-springboot/README.md)

## 3. Frontend: Desarrollo con React y TypeScript

En la parte de **Frontend**, los practicantes desarrollarán una aplicación utilizando **React** y **TypeScript**. Las actividades incluyen:

- **Configuración Inicial:** Creación de un proyecto base utilizando Vite.
- **Gestión de Rutas:** Implementación de rutas con **React Router**.
- **Estilización y UI:** Utilización de **Ant Design** y **Styled Components** para crear la interfaz de usuario.
- **Testing y Documentación:** Escribir pruebas unitarias con **Jest** y documentar componentes con **Storybook**.
- **Integración de API:** Uso de **OpenAPI** para generar un cliente TypeScript y consumir datos de un servicio externo.

[Detalles completos del plan de Frontend](./front-react-typescript/README.md)

## 4. Enlaces y Recursos de Interés

A continuación se incluyen enlaces a documentación y recursos adicionales que serán útiles durante las prácticas:

- [Documentación Oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Documentación de React](https://reactjs.org/docs/getting-started.html)
- [TypeScript Handbook](https://www.typescriptlang.org/docs/handbook/intro.html)
- [Guía de Prettier](https://prettier.io/docs/en/index.html)
- [Testing con JUnit](https://junit.org/junit5/docs/current/user-guide/)
- [Testing con Jest](https://jestjs.io/docs/getting-started)

## Conclusión

Este programa de prácticas está diseñado para proporcionar una experiencia integral en el desarrollo de aplicaciones Full Stack, permitiendo a los practicantes adquirir y consolidar conocimientos clave en tecnologías modernas de backend y frontend. ¡Buena suerte y disfruta del aprendizaje!


