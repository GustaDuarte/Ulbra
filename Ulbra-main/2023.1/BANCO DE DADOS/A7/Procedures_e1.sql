create database bd;
use bd;

CREATE TABLE autores (
  cpf VARCHAR(14) PRIMARY KEY,
  nome VARCHAR(50) NOT NULL
);

INSERT INTO autores (cpf, nome)
VALUES ('123.456.789-10', 'João da Silva'),
       ('987.654.321-00', 'Maria José');

CREATE TABLE livros (
  id INT PRIMARY KEY,
  titulo VARCHAR(100) NOT NULL,
  cpf_autor VARCHAR(14) NOT NULL,
  editora VARCHAR (50) NOT NULL,
  valor FLOAT NOT NULL,
  data_lancamento DATE,
  CONSTRAINT livros_autores
		FOREIGN KEY (cpf_autor) REFERENCES autores(cpf)
);

INSERT INTO livros (id, titulo, cpf_autor, editora, valor, data_lancamento)
VALUES (1, 'Aprendendo SQL', '123.456.789-10', "Editora A", "80.00", NULL),
       (2, 'Dominando SQL', '123.456.789-10', "Editora A", "80.00", NULL),
       (3, 'Introdução ao SQL', '987.654.321-00', "Editora B", "60.00", NULL),
       (4, 'SQL Avançado', '123.456.789-10', "Editora A", "80.00", NULL);

-- Escreva uma SP que receba, como parâmetro, o CPF de um autor e retorne a quantidade de livros escrito pelo mesmo.
DELIMITER $$
CREATE PROCEDURE quantidade_livros_por_cpf (IN p_cpf VARCHAR(14))
BEGIN
  SELECT COUNT(*) AS num_livros
  FROM livros
  WHERE cpf_autor = p_cpf;
END $$
DELIMITER ;

CALL quantidade_livros_por_cpf ('123.456.789-10');
DROP PROCEDURE quantidade_livros_por_cpf;

-- Crie uma SP que receba, como parâmetro, a data de publicação de um livro e seu código. 
-- O procedimento deve atualizar a tabela de livros, especificando a data de lançamento para o livro em questão.
DELIMITER $$
CREATE PROCEDURE atualiza_data_lancamento(IN p_id_livro INT, IN p_data_lancamento DATE)
BEGIN
  UPDATE livros
  SET data_lancamento = p_data_lancamento
  WHERE id = p_id_livro;
END $$
DELIMITER ;

CALL atualiza_data_lancamento(1, '2023-04-04');
DROP PROCEDURE atualiza_data_lancamento;

/*Em algumas situações, SPs são utilizados para a manutenção da segurança do banco de dados. 
Nestes casos, realizamos inclusões, alterações e exclusões de dados, através de SPs. 
Crie SPs que recebem os parâmetros adequados e realizam as seguintes operações:
a) Inserir uma linha na tabela de livros
b) Excluir uma linha da tabela de livros
c) Atualizar valores na tabela de livros */

-- a) Inserir uma linha na tabela de livros
DELIMITER $$
CREATE PROCEDURE insert_livro(IN p_id INT, IN p_titulo VARCHAR(100), IN p_cpf_autor VARCHAR(14), IN p_editora VARCHAR(50), IN p_valor FLOAT, IN p_data_lancamento DATE)
BEGIN
  INSERT INTO livros (id, titulo, cpf_autor, editora, valor, data_lancamento)
  VALUES (p_id, p_titulo, p_cpf_autor, p_editora, p_valor, p_data_lancamento);
END $$
DELIMITER ;

CALL insert_livro (5, "Código Limpo", "987.654.321-00", "Editora B", "60.00", "2008-06-01");
DROP PROCEDURE insert_livro;

-- b) Excluir uma linha da tabela de livros

DELIMITER $$
CREATE PROCEDURE delete_livro(IN p_id INT)
BEGIN
  DELETE FROM livros
  WHERE id = p_id;
END $$
DELIMITER ;

CALL delete_livro (5);
DROP PROCEDURE delete_livro;

-- c) Atualizar valores na tabela de livros
DELIMITER $$
CREATE PROCEDURE update_livro(IN p_id INT, IN p_titulo VARCHAR(100), IN p_cpf_autor VARCHAR(14), IN p_editora VARCHAR(50), IN p_valor FLOAT, IN p_data_lancamento DATE)
BEGIN
  UPDATE livros
  SET titulo = p_titulo, cpf_autor = p_cpf_autor, editora = p_editora, valor = p_valor, data_lancamento = p_data_lancamento
  WHERE id = p_id;
END $$
DELIMITER ;

CALL update_livro (1, "Scrum", "987.654.321-00", "Editora B", "60.00", "2009-07-07");
DROP PROCEDURE update_livro;

-- Crie uma SP que aumente ou diminua o valor dos preços dos livros de uma editora específica. 
-- O aumento pode ser em percentual ou em valor.

DELIMITER $$
CREATE PROCEDURE atualiza_preco_editora(IN p_editora VARCHAR(50), IN p_valor FLOAT)
BEGIN
  DECLARE preco_atual FLOAT;
  
  SELECT valor INTO preco_atual
  FROM livros
  WHERE editora = p_editora;
  
  UPDATE livros
  SET valor = preco_atual + p_valor
  WHERE editora = p_editora;
END $$
DELIMITER ;

CALL atualiza_preco_editora("Editora B", 10.00);
DROP PROCEDURE atualiza_preco_editora;