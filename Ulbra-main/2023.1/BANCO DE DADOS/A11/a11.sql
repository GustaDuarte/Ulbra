CREATE DATABASE bd;
USE bd;

CREATE TABLE produtos
(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(80) NOT NULL, 
    produto_status VARCHAR(80), 
    produto_falta VARCHAR(100) NOT NULL,
    qtd_estoque INT DEFAULT 0
    
);

CREATE TABLE orcamentos
(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
    orcamento_data DATE NOT NULL, 
    status ENUM('em orçamento', 'vendido', 'cancelado') NOT NULL
);

CREATE TABLE orcamentos_produtos
(
    codigo_produto INT NOT NULL,
    codigo_orcamento INT NOT NULL,
    valor FLOAT,
    orp_status INT, 
    orp_qtd INT NOT NULL,
    
    CONSTRAINT orcamentos_produtos_fk_produtos
		FOREIGN KEY (codigo_produto) REFERENCES produtos(codigo)
        ON DELETE RESTRICT
                ON UPDATE CASCADE,
        
	CONSTRAINT orcamentos_produtos_fk_orcamentos	
		FOREIGN KEY (codigo_orcamento) REFERENCES orcamentos(codigo)
        ON DELETE RESTRICT
                ON UPDATE CASCADE
);

-- Faça um trigger para alterar o estoque de um produto quando ocorrer quaisquer alterações na tabela orçamentos_produtos. 
-- Também irá alterar o estoque, quando um ítem na tabela orçamentos_Produtos for cancelado. 
-- Isso ocorre quando o campo Orp_Status recebe o valor 2.

DELIMITER $$
CREATE TRIGGER tr_atualiza_estoque_produto AFTER INSERT ON orcamentos_produtos
FOR EACH ROW 
BEGIN
	IF NEW.orp_status = 2 THEN
		UPDATE produtos SET qtd_estoque = qtd_estoque + NEW.orp_qtd 
		WHERE codigo = NEW.codigo_produto;
	ELSE
		UPDATE produtos SET qtd_estoque = qtd_estoque - NEW.orp_qtd 
		WHERE codigo = NEW.codigo_produto;
	END IF;
END $$
DELIMITER ;

INSERT INTO produtos (descricao, produto_status, produto_falta, qtd_estoque) VALUES
('Produto 1', 'Ativo', 'Sem falta', 10),
('Produto 2', 'Ativo', 'Sem falta', 5);

INSERT INTO orcamentos (orcamento_data, status) VALUES
('2023-05-01', 'em orçamento'),
('2023-05-02', 'em orçamento');

-- insert pra testar a trigger
INSERT INTO orcamentos_produtos (codigo_produto, codigo_orcamento, valor, orp_status, orp_qtd) VALUES
(1, 1, 10.00, 1, 2),
(2, 2, 5.00, 1, 1);

SELECT * FROM produtos;

CREATE TABLE produtos_atualizados (
    prd_codigo INT NOT NULL,
    prd_qtd_anterior INT NOT NULL,
    prd_qtd_atualizada INT NOT NULL,
    prd_valor FLOAT,
    PRIMARY KEY (prd_codigo)
);

CREATE TABLE produtos_em_falta
(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(80) NOT NULL,
    produto_status VARCHAR(80),
    qtd_estoque INT NOT NULL DEFAULT 0
);

-- Faça um trigger para armazenar em uma tabela chamada produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada, prd_valor) 
-- quando ocorrer quaisquer alterações nos atributos da tabela produtos. 
-- No entanto, caso a alteração atribua o valor zero para o atributo prd_qtd_estoque, a tabela produtos_em_falta deverá ser alimentada com as mesmas informações da tabela produto, 
-- exceto o atributo prd_valor. 
-- Além disso, o atributo prd_status do produto atualizado deve ser modificado para NULL e o atributo orp_status de todos os orcamentos_produtos desse produto deverá ser modificado também para NULL. 
drop trigger tr_produtos_atualizados;

DELIMITER $$
CREATE TRIGGER tr_produtos_atualizados 
AFTER UPDATE ON produtos 
FOR EACH ROW 
BEGIN 
    DECLARE qtd_anterior INT;
    SET qtd_anterior = OLD.qtd_estoque;
    
    IF NEW.qtd_estoque = 0 THEN
        -- Insere informações na tabela produtos_em_falta
        INSERT INTO produtos_em_falta (codigo, descricao, produto_status, qtd_estoque)
        VALUES (OLD.codigo, OLD.descricao, OLD.produto_status, 0);

        -- Modifica o status do produto para NULL e atualiza a tabela produtos_atualizados
        UPDATE produtos SET produto_status = NULL, qtd_estoque = NEW.qtd_estoque 
        WHERE codigo = OLD.codigo;
        INSERT INTO produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada)
        VALUES (OLD.codigo, qtd_anterior, NEW.qtd_estoque);

        -- Modifica o status de todos os orcamentos_produtos desse produto para NULL
        UPDATE orcamentos_produtos 
        SET orp_status = NULL 
        WHERE codigo_produto = OLD.codigo;
    ELSE
        -- Atualiza a tabela produtos_atualizados sem inserir informações na produtos_em_falta
        UPDATE produtos 
        SET qtd_estoque = NEW.qtd_estoque 
        WHERE codigo = OLD.codigo;
        INSERT INTO produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada)
        VALUES (OLD.codigo, qtd_anterior, NEW.qtd_estoque);
    END IF;
END$$
DELIMITER ;










DELIMITER $$
CREATE TRIGGER tr_produtos_atualizados 
AFTER UPDATE ON produtos 
FOR EACH ROW 
BEGIN 
    DECLARE qtd_anterior INT;
    SET qtd_anterior = OLD.qtd_estoque;

    CASE
        WHEN NEW.qtd_estoque = 0 THEN
            -- Insere informações na tabela produtos_em_falta
            INSERT INTO produtos_em_falta (codigo, descricao, produto_status, qtd_estoque)
            VALUES (OLD.codigo, OLD.descricao, OLD.produto_status, 0);

            -- Modifica o status do produto para NULL e atualiza a tabela produtos_atualizados
            UPDATE produtos SET produto_status = NULL, qtd_estoque = NEW.qtd_estoque 
            WHERE codigo = OLD.codigo;
            INSERT INTO produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada)
            VALUES (OLD.codigo, qtd_anterior, NEW.qtd_estoque);

            -- Modifica o status de todos os orcamentos_produtos desse produto para NULL
            UPDATE orcamentos_produtos 
            SET orp_status = NULL 
            WHERE codigo_produto = OLD.codigo;

        ELSE
            -- Atualiza a tabela produtos_atualizados sem inserir informações na produtos_em_falta
            UPDATE produtos 
            SET qtd_estoque = NEW.qtd_estoque 
            WHERE codigo = OLD.codigo;
            INSERT INTO produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada)
            VALUES (OLD.codigo, qtd_anterior, NEW.qtd_estoque);

    END CASE;
END$$
DELIMITER ;

SELECT * FROM produtos;
SELECT * FROM produtos_atualizados;
SELECT * FROM produtos_em_falta;
UPDATE produtos SET qtd_estoque = 50 WHERE codigo = 1;
