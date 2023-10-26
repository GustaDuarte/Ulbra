1--Criar todas as tabelas do esquema.

create table medicos
(
    codigo int auto_increment primary key,
    codigo_cidade int not null,
    nome varchar(100) not null,
    endereço varchar(100) not null,
    telefone int not null,
    crm int not null unique,
    cpf char(11) not null unique,
    constraint medicos_fk_cidade
        foreign key(codigo_cidade) references cidade(codigo)
        ON DELETE restrict
    	ON UPDATE cascade
);

create table pacientes
(
    codigo int auto_increment primary key,
    codigo_cidade int not null,
    nome varchar(100) not null,
    endereço varchar(100) not null,
    telefone int not null,
    constraint pacientes_fk_cidade
        foreign key(codigo_cidade) references cidade(codigo)
        ON DELETE restrict
    	ON UPDATE cascade
);

create table cidade
(
    codigo int auto_increment primary key,
    nome varchar(100) not null,
    UF char(2) not null
);

create table consultas
(
    codigo int auto_increment primary key,
    codigo_medico int not null,
    codigo_paciente int not null,
    data_consulta date not null,
    hora_consulta time not null,
    constraint consultas_fk_medico
        foreign key(codigo_medico) references medico(codigo)
        ON DELETE restrict
    	ON UPDATE cascade,
    constraint consultas_fk_paciente
        foreign key(codigo_paciente) references paciente(codigo)
        ON DELETE restrict
    	ON UPDATE cascade
);

create table prescricao
(
    codigo_consulta int not null,
    codigo_medicamento int not null,
    posologia varchar(200) not null,
    constraint prescricao_fk_consultas
        foreign key(codigo_consulta) references consultas(codigo),
        ON DELETE restrict
    	ON UPDATE cascade
    constraint prescricao_fk_medicamentos
        foreign key(codigo_medicamento) references medicamentos(codigo)
        ON DELETE restrict
    	ON UPDATE cascade
);

create table medicamentos
(
    codigo int auto_increment primary key,
    nome varchar(100) not null,
    composicao varchar(200) not null,
    preco float not null
);

2--popular as tabelas
INSERT INTO cidade(nome, uf)
VALUES('capao da canoa', 'rs');
    SELECT codigo, nome, uf
    FROM cidade 

INSERT INTO pacientes(codigo_cidade, nome, endereço, telefone)
VALUES(1, 'gustavo', 'honorio germano', '995686835');
    SELECT codigo_cidade, nome, endereço, telefone
    FROM pacientes 

INSERT INTO medicos(codigo_cidade, nome, endereço, telefone, crm, cpf)
VALUES(1, 'gusta', 'honorio germano', '995686835', '123456789', '04591268063');
    SELECT codigo_cidade, nome, endereço, telefone, crm, cpf
    FROM medicos 

INSERT INTO consultas(codigo_medico, codigo_paciente, data_consulta, hora_consulta)
VALUES(1, 1 , '2022/10/23', '14:55');
    SELECT codigo_medico, codigo_paciente, data_consulta, hora_consulta
    FROM consultas 

INSERT INTO medicamentos(nome, composicao, preco)
VALUES('Fluoxetina', 'Cada 22,36 mg de cloridrato de fluoxetina equivalem à 20 mg de fluoxetina base. Excipientes: amido, celulose microcristalina, hipromelose.', 15.49);
    SELECT nome, composicao, preco
    FROM medicamentos 

INSERT INTO prescricao(codigo_consulta, codigo_medicamento, posologia)
VALUES(2, 1, 'Cada 22,36 mg de cloridrato de fluoxetina equivalem à 20 mg de fluoxetina base.');
    SELECT codigo_consulta, codigo_medicamento, posologia
    FROM prescricao 

3 --Atualizar o preço do medicamento de código 1 em 20%.
--atualiza a coluna já existente fazendo o acrescimo do valor
UPDATE
  medicamentos
SET
  preco = (preco + (preco*0.1))
WHERE
  codigo = 1

--cria uma nova coluna com o acrescimo do valor 
SELECT *, preco + 10 as novo_preco,
(preco + (preco*0.1)) as preco
FROM medicamentos
WHERE
  codigo = 2

4 --Excluir a cidade cujo código é 3.
DELETE from cidade 
WHERE
  codigo = 4

5--Listar os nomes das cidades do estado RS. 
SELECT nome
FROM cidade 
WHERE uf = 'rs'

6--Listar todos os nomes de medicamentos e preço.
SELECT nome, preco
FROM medicamentos 

7--*Listar o nome e telefone dos médicos da cidade de ‘Torres’.
-- codigo_cidade igual a 1 significa que a cidade de Torres tem seu id = 1
SELECT nome, telefone
FROM medicos 
WHERE codigo_cidade = 1

8--*Listar todas os nomes dos medicamentos, juntamente com a posologia, prescritos na consulta de código 1.
