CREATE TABLE users (

	id SERIAL PRIMARY KEY,
	nome VARCHAR(100),
	email VARCHAR(100) unique,
	senha VARCHAR(100),
	data_insercao TIMESTAMP

)

SELECT * FROM users;
SELECT * FROM telephone;
SELECT * FROM address;

INSERT INTO users (nome, email, senha, data_insercao) VALUES ('TESTE', 'teste@email.com', 'senha123', CURRENT_DATE)
INSERT INTO users (nome, email, senha, data_insercao) VALUES ('TESTÃO', 'testÃO@email.com', '987senha', CURRENT_DATE)
INSERT INTO users (nome, email, senha, data_insercao) VALUES ('2TESTE', '2teste@email.com', 'senha123', CURRENT_DATE)

UPDATE users SET nome = 'testinho', email = 'testinho@email.com' WHERE id = 2

DELETE FROM users WHERE id = 1 

SELECT * FROM users ORDER BY email ASC

SELECT nome FROM users ORDER BY nome DESC
SELECT nome, email FROM users ORDER BY nome DESC

CREATE TABLE autores (
	id VARCHAR(20) PRIMARY KEY,
	nome VARCHAR(100)
)

CREATE TABLE livros(
	id SERIAL PRIMARY KEY,
	titulo VARCHAR(200),
	id_autor VARCHAR(20) REFERENCES autores(id)
)

SELECT * FROM autores INNER JOIN livros ON autores.id = livros.id_autor

INSERT INTO autores (id, nome) VALUES ('ASDF-AWER-ASDF', 'George Orwell'), ('LKJF-AWER-ASDF', 'J.K. Rowling')
INSERT INTO livros (titulo, id_autor) VALUES ('1984', 'ASDF-AWER-ASDF'), ('harry potter', 'LKJF-AWER-ASDF')

SELECT * FROM autores INNER JOIN livros ON autores.id = livros.id_autor WHERE nome = 'J.K. Rowling'


