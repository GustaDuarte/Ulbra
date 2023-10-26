CREATE TABLE clientes(
    id int auto_increment primary key,
    nome varchar(100) not null,
    endereço varchar(100) not null,
    telefone varchar(50) not null,
    cpf char(15) not null unique,
    cidade varchar(100)
);

CREATE TABLE carros(
    id int auto_increment primary key,
    placa varchar(100) not null, 
    modelo varchar(100) not null, 
    cod_marca varchar(100) not null, 
    marca varchar(100) not null, 
    ano varchar(50) not null
);

CREATE TABLE alugueis(
    registro int auto_increment primary key,
    data_aluguel date not null,
    data_devolução date not null, 
    valor double not null,
    id_cliente int not null,
    id_carro Int not null,

    constraint alugueis_fk_clientes
        foreign key (id_cliente) references clientes(id)
            ON DELETE restrict
            ON UPDATE cascade,

    constraint alugueis_fk_carros
        foreign key (id_carro) references carros(id)
            ON DELETE restrict
            ON UPDATE cascade
);


INSERT into clientes(nome,endereço,telefone,cpf,cidade)
VALUES('joão silva', 'rua seis, 7483', '51995686835', '04591268063', 'torres'),
      ('eduarda silveira', 'av. central, 7234', '5197394144', '55789998089', 'capao da canoa');

INSERT into carros(placa,modelo,cod_marca,marca,ano)
VALUES('LQR8074', 'hb20', '1227', 'hyundai', '2015'),
      ('IAP8666', 'audi r8', '0007', 'audi', '2017');

insert into alugueis(data_aluguel,data_devolução,valor,id_cliente,id_carro)
values('2021-09-17', '2021-10-23', 65.00,1,2),
        ('2021-12-31', '2022-01-26', 700.00,2,1);


--O comando SQL BETWEEN é utilizado para selecionarmos um determinado range de registros em uma tabela, ou seja, definimos um ponto inicial e final para consulta
SELECT * FROM alugueis
WHERE data_aluguel BETWEEN '2021-09-01' AND '2021-09-30';

--O operador LIKE é utilizado para buscar por uma determinada string dentro de um campo com valores textuais
SELECT * from clientes
WHERE nome like '%silva%';

select * , valor+((valor*20)/100) as valor_com_acrescimo_20
from alugueis;

--ou para atualizar na coluna já existente usar o update
UPDATE
  alugueis
SET
  valor = (valor + (valor*0.20))
WHERE
  registro = 1