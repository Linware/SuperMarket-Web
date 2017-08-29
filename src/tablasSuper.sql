
DROP DATABASE IF EXISTS supermercado;
CREATE DATABASE supermercado;
USE supermercado;

DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios(
 id INT, 
 usuario VARCHAR(30),
 contrasenya VARCHAR(20),
 PRIMARY KEY (id)
 )ENGINE=InnoDB;
 
 DROP TABLE IF EXISTS productos;
 CREATE TABLE productos(
 id INT,
 nombre VARCHAR(64),
 precio DOUBLE,
 PRIMARY KEY(id)
 )ENGINE=InnoDB;
 
 