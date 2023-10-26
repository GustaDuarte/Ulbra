 /*  MODELO ER
					+---------------+
					|   Categorias  |
					+---------------+
					| PK id         |
					|    nome       |
					+---------------+
                            |1
                            |
                            |
                            |N
                +---------------------------------+
                |   	Produtos                  |
                +---------------------------------+
                | PK id                           |
                | FK id_categoria (Categorias.id) |
                |    nome                         |
                |    data_validade                |
                +---------------------------------+
                      |1                          |1
                      |                           |
                      |                           |
                      |N                          |____________ N
		+------------------------------------+                 |_____+-----------------------------+
		|   Receitas                         |                        |    Lotes                    |
		+------------------------------------+                        +-----------------------------+
		| PK id                              |                        | PK id                       |
		| FK id_produto (Produtos.id)        |                        | FK id_produto (Produtos.id) |
		| FK id_ingrediente (Ingredientes.id)|                        | data_producao               |
		|    qtd_ingrediente                 |                        | qtd_produzida               |
		+------------------------------------+                        +-----------------------------+
                      |N                       
                      |                        
                      |                        
                      |1                      
                +---------------+                                +------------------------------------+
                | Ingredientes  | 1____________________________N |     Estoque                        |
                +---------------+            					 +------------------------------------+
                | PK id         |            					 | PK id                              |
                +---------------+             					 | FK id_ingrediente (Ingredientes.id)|
																 |    qdt_estoque                     |
																 +-------------------------------------+ 
 */



CREATE DATABASE bd;
USE bd;

CREATE TABLE categorias (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL
);

CREATE TABLE produtos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_categoria INT NOT NULL,
  nome VARCHAR(50) NOT NULL,
  data_validade DATE NOT NULL,
  CONSTRAINT produtos_fk_categorias
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE
);

CREATE TABLE ingredientes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL
);

CREATE TABLE receitas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_produto INT NOT NULL,
  id_ingrediente INT NOT NULL,
  qtd_ingrediente INT NOT NULL,
    CONSTRAINT receitas_fk_produtos
		FOREIGN KEY (id_produto) REFERENCES produtos(id)
        ON DELETE RESTRICT
                ON UPDATE CASCADE,
        
	CONSTRAINT receitas_fk_ingredientes	
		FOREIGN KEY (id_ingrediente) REFERENCES ingredientes(id)
        ON DELETE RESTRICT
                ON UPDATE CASCADE
);

CREATE TABLE estoque (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_ingrediente INT NOT NULL,
  qdt_estoque INT NOT NULL,
  CONSTRAINT estoque_fk_ingredientes	
		FOREIGN KEY (id_ingrediente) REFERENCES ingredientes(id)
        ON DELETE RESTRICT
                ON UPDATE CASCADE
);

CREATE TABLE lotes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_produto INT NOT NULL,
  data_producao DATE NOT NULL,
  qtd_produzida INT NOT NULL,
  CONSTRAINT lotes_fk_produtos
		FOREIGN KEY (id_produto) REFERENCES produtos(id)
        ON DELETE RESTRICT
                ON UPDATE CASCADE
);

INSERT INTO categorias (nome) VALUES
('Pães'),
('Bolos'),
('Tortas');

INSERT INTO produtos (id_categoria, nome, data_validade) VALUES
(1, 'Pão Francês', '2023-05-31'),
(2, 'Bolo de Chocolate', '2023-06-10'),  
(3, 'Torta de Limão', '2023-06-15');

INSERT INTO ingredientes (nome) VALUES
('Farinha de Trigo'),
('Água'),
('Sal'),
('Fermento'),
('Açúcar'),
('Ovos'),
('Leite Condensado'),
('Limão');

INSERT INTO receitas (id_produto, id_ingrediente, qtd_ingrediente) VALUES
(1, 1, 500),
(1, 2, 300),
(1, 3, 10),
(1, 4, 10),
(2, 1, 400),
(2, 5, 250),
(2, 4, 3),
(2, 6, 4),
(2, 7, 1),
(3, 1, 350),
(3, 5, 200),
(3, 8, 2);

INSERT INTO estoque (id_ingrediente, qdt_estoque) VALUES
(1, 20000),
(2, 10000),
(3, 500),
(4, 200),
(5, 8000),
(6, 500),
(7, 100),
(8, 1000);

INSERT INTO lotes (id_produto, data_producao, qtd_produzida) VALUES
(1, '2023-05-01', 500),
(2, '2023-05-02', 300),
(3, '2023-05-03', 200);

-- Exibir quantos produtos há para cada categoria:
SELECT c.nome AS categoria, COUNT(*) AS qtd_produtos
FROM categorias c
JOIN produtos p ON p.id_categoria = c.id
GROUP BY c.nome;

-- Exibir todos os produtos, quais ingredientes e em que quantidade são utilizados para produzi-lo:
SELECT p.nome AS produto, i.nome AS ingrediente, r.qtd_ingrediente
FROM produtos p
JOIN receitas r 
	ON r.id_produto = p.id
JOIN ingredientes i 
	ON i.id = r.id_ingrediente;
    
-- Exibir qual a quantidade produzida de cada produto dos últimos 30 dias:
SELECT p.nome AS produto, SUM(l.qtd_produzida) AS qtd_produzida
FROM produtos p
JOIN lotes l 
	ON l.id_produto = p.id
WHERE l.data_producao >= DATE_SUB(CURDATE(), INTERVAL 30 DAY)
GROUP BY p.nome;

-- Se for dobrada a produção para o próximo mês, quanto de ingrediente será necessario:
SELECT i.nome AS ingrediente, SUM((r.qtd_ingrediente * l.qtd_produzida) * 2) AS qtd_necessaria
FROM receitas r
JOIN ingredientes i 
	ON i.id = r.id_ingrediente
JOIN lotes l 
	ON l.id_produto = r.id_produto
WHERE l.data_producao >= DATE_SUB(CURDATE(), INTERVAL 30 DAY)
GROUP BY i.nome;

/* Mostrar os ingredientes que nunca foram utilizados: */ INSERT INTO ingredientes (nome) VALUES('teste');
SELECT i.nome as ingrediente
FROM ingredientes i
LEFT JOIN receitas r 
	ON r.id_ingrediente = i.id
WHERE r.id_ingrediente IS NULL;

-- Crie uma trigger para garantir o controle de estoque dos produtos fabricados. 
-- Quanto um produto for fabricado deve dar saída dos estoque dos ingredientes utilizados. 
-- Caso ocorra o estorno da fabricação, manter o estoque dos ingredientes atualizado também:

DELIMITER $$
CREATE TRIGGER tr_atualizar_estoque AFTER INSERT ON lotes 
FOR EACH ROW 
BEGIN 
	-- Atualizar estoque
    UPDATE estoque e
    JOIN ingredientes i ON e.id_ingrediente = i.id
    JOIN receitas r ON r.id_ingrediente = i.id
    SET e.qdt_estoque = e.qdt_estoque - (NEW.qtd_produzida * r.qtd_ingrediente)
    WHERE r.id_produto = NEW.id_produto;
END$$
DELIMITER ;

-- ________________________________________________________________________________________
-- TESTAR TRIGGER...
INSERT INTO lotes (id_produto, data_producao, qtd_produzida) VALUES
(1, '2023-05-10', 10);

SELECT i.nome, e.id_ingrediente, e.qdt_estoque
FROM estoque e
JOIN ingredientes i
	ON i.id = e.id_ingrediente;
-- _________________________________________________________________________________________

DELIMITER $$
CREATE TRIGGER tr_estornar_fabricacao AFTER DELETE ON lotes
FOR EACH ROW 
BEGIN 
    -- Atualizar estoque
    UPDATE estoque e
    JOIN ingredientes i ON e.id_ingrediente = i.id
    JOIN receitas r ON r.id_ingrediente = i.id
    SET e.qdt_estoque = e.qdt_estoque + (OLD.qtd_produzida * r.qtd_ingrediente)
    WHERE r.id_produto = OLD.id_produto;
END$$
DELIMITER ;
-- ________________________________________________________________________________________
-- TESTAR TRIGGER...
DELETE FROM lotes
WHERE id_produto = 1 AND data_producao = '2023-05-10' AND qtd_produzida = 10;

SELECT i.nome, e.id_ingrediente, e.qdt_estoque
FROM estoque e
JOIN ingredientes i
	ON i.id = e.id_ingrediente;
-- _________________________________________________________________________________________

-- Utilizando controle de transações, atualize as receitas para reduzir em 10% a  quantidade de fermento utilizada; 
SET autocommit=0;
START TRANSACTION;

UPDATE receitas
SET qtd_ingrediente = qtd_ingrediente * 0.9
WHERE id_ingrediente = (
    SELECT id
    FROM ingredientes
    WHERE nome = 'fermento'
);

SELECT r.id_produto AS produto, i.id AS ingrediente, i.nome, r.qtd_ingrediente
FROM receitas r
JOIN ingredientes i
	ON r.id_ingrediente = i.id
WHERE i.nome = 'fermento';

-- Confirme a transação do exercício anterior:
COMMIT;

-- Utilizando controle de transações, exclua todos os registros de produção do último mês:
START TRANSACTION;

DELETE FROM lotes
WHERE data_producao >= DATE_SUB(CURDATE(), INTERVAL 30 DAY);


-- Desfaça a transação realizada no exercício anterior:
ROLLBACK;