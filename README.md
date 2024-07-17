# LITERALURA challenge

Proyecto de una librería utilizando Spring Boot, JPA y PostgreSQL.

## QUE USAMOS?
- Java 
- Maven
- PostgreSQL

## Configuración del proyecto en Intellij

### Configuración de la base de datos

1. Crea una base de datos llamada `libreria_db`:


2. Configura las credenciales de acceso a la base de datos en el archivo PROPORTIES:

    ```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/libreria_db
spring.datasource.username=libreria_user
spring.datasource.password=tu_contrasena
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

    ```

### Construcción y ejecución

### 1. Clonar el Repositorio

```bash
git clone https://github.com/tu_usuario/libreria.git
cd libreria
```
2. Construye el proyecto con Maven:

    ```bash
    mvn clean install
    ```

3. Ejecuta la aplicación:

    ```bash
mvn clean install
mvn spring-boot:run

    ```

### Uso de la API

### EndPoints 

#### Añadir un Libro

```bash
POST /api/books
Content-Type: application/json

{
    "title": "El Principito",
    "author": "Antoine de Saint-Exupéry",
    "language": "es",
    "year": 1943,
    "downloads": 0
}

 ```
#### Buscar Libros por Título

```bash
GET /api/books/search?title=Principito

 ```
#### Buscar Libros por Autor
```bash
GET /api/books/search/author?author=Exupéry
 ```
#### Obtener Libros por Año
```bash
GET /api/books/year?year=1943

```
#### Obtener Libros por Idioma
```bash
GET /api/books/language?language=es

```

#### TOP 10 DESCARGAS

```bash
GET /api/books/top10

```

#### BUSCAR EXTERNAMENTE EN LA API GUTENDEX

``bash
GET /api/books/search/external?query=Principito
```


