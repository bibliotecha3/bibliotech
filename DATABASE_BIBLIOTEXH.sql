# bibliotech
A3 2023/2
CREATE database users_bibliotech;
USE users_bibliotech;
-- DROP DATABASE users_bibliotech;
CREATE TABLE users_bibliotech(
	cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100),
	telefone VARCHAR(20),
	email VARCHAR(100),
    cidade VARCHAR(50)
    );
-- DROP TABLE users_bibliotech;
CREATE TABLE livros(
id_livros INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
autor INT(10),
genero VARCHAR(20),
paginas DECIMAL(1000,5)
);
