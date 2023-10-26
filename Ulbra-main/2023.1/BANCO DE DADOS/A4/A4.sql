CREATE DATABASE orcamentos;

USE orcamentos;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor FLOAT NOT NULL,
    saldo INT NOT NULL -- QUANTIDADE EM ESTOQUE
);

INSERT INTO produtos (nome, valor, saldo) VALUES
    ('Tablet', 200.00, 50),
    ('Telefone', 400.00, 30),
    ('Computador', 700.00, 5);

CREATE TABLE orcamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_orc DATE NOT NULL,
    status ENUM('em orçamento', 'vendido', 'cancelado') NOT NULL
);

INSERT INTO orcamentos (data_orc, status) VALUES
    ('2023-03-15', 'em orçamento'),
    ('2014-09-16', 'vendido'),
    ('2014-09-17', 'cancelado');

CREATE TABLE orcamentos_itens (
    id_produto INT NOT NULL,
    id_orcamento INT NOT NULL,
    valor_unit FLOAT NOT NULL,
    quantidade INT NOT NULL,
    valor_total_item FLOAT NOT NULL,
    CONSTRAINT orcamentos_itens_fk_produtos
		FOREIGN KEY (id_produto) REFERENCES produtos(id),
	CONSTRAINT orcamentos_itens_fk_orcamentos	
		FOREIGN KEY (id_orcamento) REFERENCES orcamentos(id)
);

INSERT INTO orcamentos_itens (id_produto, id_orcamento, valor_unit, quantidade, valor_total_item) VALUES
    (1, 1, 200.00, 2, 400.00),
    (2, 1, 400.00, 1, 400.00),
    (3, 2, 700.00, 1, 700.00),
    (1, 2, 200.00, 3, 600.00),
    (2, 3, 400.00, 2, 800.00),
    (3, 3, 700.00, 1, 700.00);
    
/*Criar UMA view que dê condições de:
	-Lista de orçamentos por produto
	-Valor total de produtos orçados por período:	ex. valor total dos produtos orçados no mes de março de 2022
	-Produtos que tem “Computador” no nome e que tem quantidade em estoque.
	-Os 10 produtos mais orçados no mês de setembro de 2014 e que ainda tem saldo em estoque. Somente os produtos com o valor acima de R$ 500.00.*/
    
CREATE VIEW view_orcamentos AS
	SELECT 
		p.id AS id_produto,
		p.nome AS nome_produto, 
        p.saldo AS saldo_produto,
		o.id AS id_orcamento, 
		o.data_orc AS data_orcamento, 
		SUM(oi.quantidade) AS quantidade_total,
		SUM(oi.valor_total_item) AS valor_total
    FROM produtos p 
		JOIN orcamentos_itens oi
	ON oi.id_produto = p.id
		JOIN orcamentos o
	ON o.id = oi.id_orcamento
    WHERE (o.data_orc >= '2014-09-01' and o.data_orc <= '2014-09-30' AND p.saldo > 0 AND p.valor > 500.00) OR (p.nome LIKE '%Computador%' AND p.saldo > 0 AND p.valor > 500.00)
    ORDER BY quantidade_total DESC
    LIMIT 10;
    
/*Faça uma consulta utilizando a view para acrescentar 20% nos produtos que o saldo em estoque é menor ou igual a 5.
	-id, nome do produto, valor atual, valor_mais20*/

SELECT 
    id_produto,
    nome_produto, 
    valor_total AS valor_atual, 
    CASE 
        WHEN saldo_produto <= 5 THEN valor_total * 1.2 -- CASE WHEN", que verifica se o saldo em estoque do produto é menor ou igual a 5
        ELSE valor_total  -- Se não for, o valor total do produto é mantido sem alterações. 
    END AS valor_mais20
FROM 
    view_orcamentos;

-- Delete todos os produtos que não foram orçados.

DELETE FROM produtos
WHERE NOT EXISTS (
    SELECT 1 -- 'EXISTS em uma subconsulta.' Objetivo é verificar se existe pelo menos uma linha que atende a determinada condição(where).
    FROM orcamentos_itens oi
    WHERE oi.id_produto = produtos.id
);
-- Explique quando utilizar o GROUP BY, de um exemplo sql.
/*A cláusula GROUP BY é utilizada em SQL para agrupar os resultados de uma consulta baseada em uma ou mais colunas específicas. 
Essa cláusula é comumente utilizada com funções de agregação.*/
SELECT ID_Produto, SUM(Valor_Venda) as Total_Vendas
FROM Vendas
GROUP BY ID_Produto;

-- Explique quando utilizar o HAVING, de um exemplo sql.
/*A cláusula HAVING é usada em SQL junto com a cláusula GROUP BY para filtrar o resultado de uma consulta que usa funções de agregação, como SUM, AVG, COUNT, entre outras.*/
SELECT id_cliente, SUM(valor) AS total_vendas
FROM vendas
GROUP BY id_cliente;

-- Explique quando utilizar o UNION, de um exemplo sql.
/*A cláusula UNION é utilizada para combinar os resultados de duas ou mais consultas SQL em uma única tabela de resultados. 
É importante notar que as tabelas ou resultados das consultas unidas precisam ter a mesma estrutura, 
com o mesmo número de colunas e tipos de dados correspondentes.*/
SELECT nome, endereco
FROM clientes
UNION
SELECT nome, endereco
FROM fornecedores;

-- Explique quando utilizar o LEFT JOIN, de um exemplo sql.	
/*O LEFT JOIN é utilizado quando se deseja obter todos os registros da tabela à esquerda, mesmo que não existam correspondentes na tabela à direita.*/
SELECT c.nome, p.data_pedido, p.valor_total
FROM clientes c
LEFT JOIN pedidos p ON c.id_cliente = p.id_cliente;