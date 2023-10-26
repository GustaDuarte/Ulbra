CREATE DATABASE bd;
USE bd;

-- Crie uma tabela Pessoas que contenha as colunas id, nome, sexo e data_nascimento.
CREATE TABLE Pessoas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL,
  sexo ENUM('M', 'F') NOT NULL,
  data_nascimento DATE NOT NULL
);

-- Crie uma Store Procedure onde sejam possíveis passar como parâmetro as informações para Nome, Sexo e Data_Nascimento. 
-- Esta Stored Procedure deverá consultar no banco de dados o último ID gerado na tabela de Pessoas, 
-- incrementar este ID e inserir um registro nesta tabela com os dados enviados por parâmetro.
DELIMITER $$
CREATE PROCEDURE insert_pessoa(IN p_nome VARCHAR(50), IN p_sexo ENUM('M', 'F'), IN p_data_nascimento DATE)
BEGIN
  DECLARE ultimo_id INT;
  SELECT MAX(id) INTO ultimo_id FROM Pessoas;
  INSERT INTO Pessoas (id, nome, sexo, data_nascimento) VALUES (ultimo_id + 1, p_nome, p_sexo, p_data_nascimento);
END $$
DELIMITER ;

CALL insert_pessoa("pessoa 1", "M", "2001-04-10");
DROP PROCEDURE insert_pessoa;

select *
from pessoas;

-- Crie uma Stored Procedure que mostre quantos Homens e quantas Mulheres têm cadastrados.
DELIMITER $$
CREATE PROCEDURE countHomensMulheres()
BEGIN
  SELECT sexo, COUNT(*) AS total FROM Pessoas GROUP BY sexo;
END $$
DELIMITER ;

CALL countHomensMulheres;
DROP PROCEDURE contaHomensMulheres;

-- Crie uma Stored Procedure que mostre quantos Homens são menores e maiores de idade, e quantas Mulheres são maiores e menores de idade.
DELIMITER $$
CREATE PROCEDURE count_idades()
BEGIN
  SELECT 
    SUM(CASE WHEN sexo = 'M' AND data_nascimento > DATE_SUB(NOW(), INTERVAL 18 YEAR) THEN 1 ELSE 0 END) AS homens_menores,
    SUM(CASE WHEN sexo = 'M' AND data_nascimento <= DATE_SUB(NOW(), INTERVAL 18 YEAR) THEN 1 ELSE 0 END) AS homens_maiores,
    SUM(CASE WHEN sexo = 'F' AND data_nascimento > DATE_SUB(NOW(), INTERVAL 18 YEAR) THEN 1 ELSE 0 END) AS mulheres_menores,
    SUM(CASE WHEN sexo = 'F' AND data_nascimento <= DATE_SUB(NOW(), INTERVAL 18 YEAR) THEN 1 ELSE 0 END) AS mulheres_maiores
  FROM Pessoas;
END $$
DELIMITER ;

CALL count_idades;
DROP PROCEDURE count_idades;

-- Crie uma Stored Procedure que receba dois Números. 
-- Esta Procedure ao ser executada deverá mostrar o retorno obtido se estes dois números fossem somados, diminuídos, multiplicados e divididos.
DELIMITER $$
CREATE PROCEDURE calc(IN p_numero1 INT, IN p_numero2 INT)
BEGIN
  SELECT 
    p_numero1 + p_numero2 AS soma,
    p_numero1 - p_numero2 AS subtracao,
    p_numero1 * p_numero2 AS multiplicacao,
    p_numero1 / p_numero2 AS divisao;
END $$
DELIMITER ;

CALL calc(5, 2);
DROP PROCEDURE calc;