create database bd;
use bd;

CREATE TABLE clientes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(60) NOT NULL
);

INSERT INTO clientes (id, nome) VALUES 
(1, 'João da Silva'),
(2, 'Maria dos Santos'),
(3, 'Pedro Souza');

CREATE TABLE livros (
  id INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(100) NOT NULL,
  valor_unit FLOAT NOT NULL
);

INSERT INTO livros (id, titulo, valor_unit) VALUES 
(1, 'Dom Casmurro', 25.90),
(2, 'Memórias Póstumas de Brás Cubas', 19.99),
(3, 'Grande Sertão: Veredas', 39.90);

CREATE TABLE autores (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL
);

INSERT INTO autores (id, nome) VALUES 
(1, 'Machado de Assis'),
(2, 'Guimarães Rosa'),
(3, 'Clarice Lispector');

CREATE TABLE autores_livros (
  id_autor INT NOT NULL,
  id_livro INT NOT NULL,
  CONSTRAINT autores_livros_fk_autores
		FOREIGN KEY (id_autor) REFERENCES autores(id),
  CONSTRAINT autores_livros_fk_livros
		FOREIGN KEY (id_livro) REFERENCES livros(id)
);

INSERT INTO autores_livros (id_autor, id_livro) VALUES 
(1, 1),
(1, 2),
(2, 3);

CREATE TABLE vendas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_cliente INT NOT NULL,
  data_venda DATE NOT NULL,
  CONSTRAINT vendas_fk_clientes
		FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);

INSERT INTO vendas (id, data_venda, id_cliente) VALUES 
(1, '2022-01-05', 1),
(2, '2022-02-15', 2),
(3, '2022-03-20', 3);

CREATE TABLE vendas_livros (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_livro INT NOT NULL,
  qtd INT NOT NULL,
  valor_unit FLOAT NOT NULL,
  CONSTRAINT vendas_livros_fk_livros
		FOREIGN KEY (id_livro) REFERENCES livros(id)
);

INSERT INTO vendas_livros (id, id_livro, qtd, valor_unit) VALUES 
(1, 1, 2, 25.90),
(2, 2, 3, 19.99),
(3, 3, 1, 39.90);

-- Crie uma view chamada "livros_mais_vendidos" que exiba o título, autor, preço e a quantidade de vezes que cada livro foi vendido.

CREATE VIEW livros_mais_vendidos AS
	SELECT l.titulo, a.nome, SUM(vl.valor_unit * vl.qtd) AS preco, SUM(vl.qtd) AS qtd_vendida
    FROM livros l
		JOIN autores_livros al
			ON al.id_livro = l.id
		JOIN autores a 
			ON a.id = al.id_autor
		JOIN vendas_livros vl 
			ON vl.id_livro = l.id
	GROUP BY l.id
	ORDER BY qtd_vendida DESC;
    
SELECT * FROM livros_mais_vendidos;
    
-- Crie uma view que lista os autores que nunca venderam livros.

CREATE VIEW autores_sem_vendas AS
	SELECT a.id, a.nome
	FROM autores a
	WHERE a.id NOT IN (SELECT al.id_autor FROM autores_livros al);
    
SELECT * FROM autores_sem_vendas;
    
-- Use a sua criatividade e crie uma view que se aplique nessa modelagem.
	-- View que exibe informações sobre as vendas de cada cliente
    
CREATE VIEW vendas_clientes AS
	SELECT c.nome, v.data_venda,  vl.qtd, SUM(vl.valor_unit * vl.qtd) AS valor_total, GROUP_CONCAT(l.titulo SEPARATOR ', ') AS livros_comprados
	FROM clientes c
		JOIN vendas v
			ON v.id_cliente = c.id
		JOIN vendas_livros vl
			ON vl.id = v.id
		JOIN livros l
			ON l.id = vl.id_livro
	GROUP BY v.id;
    
SELECT * FROM vendas_clientes;
