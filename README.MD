# 📘 Backend – Agenda de Contactos #

Este proyecto implementa una API REST desarrollada en Java + Spring Boot y un frontend simple en HTML/JS, permitiendo gestionar una agenda de contactos almacenada en una base de datos.

La aplicación permite realizar operaciones CRUD completas:

Crear contactos
Listar contactos
Buscar por ID
Buscar por nombre o apellido (LIKE)
Actualizar
Eliminar

📌 1. Base de Datos
Se creó una base de datos llamada:
restdb

Con una tabla agenda:

Campo	Tipo	Detalles
id	INT (autonumérico)	Clave primaria
nombre	VARCHAR	
apellido	VARCHAR	
telefono	INT	
email	VARCHAR	
domicilio	VARCHAR	

📌 2. Modelo ORM

Se creó la clase Agenda, mapeada con JPA:
@Entity
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

Atributos correspondientes a cada campo de la tabla
Esto permite que la clase represente directamente los registros de la base de datos.

📌 3. Operaciones JPQL requeridas

Se implementaron métodos para:

✔️ a) Listar todos los contactos
✔️ b) Obtener un contacto por ID
✔️ c) Buscar por nombre o apellido (operador LIKE)
✔️ d) Insertar un nuevo contacto
✔️ e) Actualizar un contacto
✔️ f) Eliminar un contacto

Estas consultas fueron implementadas en un repositorio JPA o mediante métodos personalizados.

📌 4. API REST implementada

La API expone los siguientes endpoints:

Método	Endpoint	Descripción
GET	/agenda	Obtener todos los contactos
GET	/agenda/{id}	Obtener contacto por ID
GET	/agenda/buscar/{texto}	Buscar por nombre o apellido (LIKE)
POST	/agenda	Crear contacto
PUT	/agenda	Actualizar contacto
DELETE	/agenda/{id}	Eliminar contacto

La API devuelve y recibe datos en formato JSON.

📌 5. Pruebas con Postman

Se probaron todas las funcionalidades utilizando Postman o herramientas similares:

✔️ Prueba de alta de contactos
✔️ Prueba de actualización
✔️ Prueba de eliminación
✔️ Prueba de búsqueda por LIKE
✔️ Verificación de códigos de estado (200 / 201 / 404 / 500)

📌 6. Frontend (HTML + JavaScript)

El proyecto incluye un frontend simple que esta en otro repositoriro.
link al front: https://github.com/Sofia-Raia/FrontAppWEB_TP6_JS
El cual permite:

Mostrar la tabla de contactos
Buscar contactos
Crear nuevos contactos
Editar contactos
Eliminar contactos

Archivos principales:

index.html
formulario.html
index.js
formulario.js
styles.css

El frontend se comunica con la API mediante fetch().

🚀 Ejecución del proyecto
1. Backend

Ejecutar Spring Boot:

mvn spring-boot:run


o desde el IDE (IntelliJ / Eclipse).

2. Frontend

Simplemente abrir:

index.html


(El frontend usa rutas fetch hacia el backend en localhost)

📁 Estructura del proyecto
/backend
   ├── src/main/java
   │   ├── controller
   │   ├── service
   │   ├── repository
   │   └── model (clase Agenda)
   ├── resources
   └── pom.xml

/frontend
   ├── index.html
   ├── formulario.html
   ├── index.js
   ├── formulario.js
   └── styles.css

👩‍💻 Autor

Sofía Raia
Tecnicatura Universitaria en Programación
Materia: Programación 3