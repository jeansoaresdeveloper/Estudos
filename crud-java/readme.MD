Crud de filmes utilizando Java e Spring - Alura.

Base SQL:
    CREATE DATABASE screenmatch;
    use screenmatch;

    CREATE TABLE movies (
        id BIGINT NOT NULL AUTO_INCREMENT,
        name VARCHAR(100) NOT NULL,
        duration INT NOT NULL,
        year_release INT NOT NULL,
        movie_genre VARCHAR(100),
        PRIMARY KEY(id)
    );

Altere o arquivo src/main/resources/application.properties com as configurações do seu banco.
spring.datasource.url=jdbc:mysql://IP:PORTA/screenmatch?createDatabaseIfNotExist=true
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA