create table socios(
    numero int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(100) not null,
    codigo_tipo_socio int not null,
    descricao_tipo_socio varchar(100) not null
);

create table servicos(
    codigo int auto_increment primary key,
    descricao varchar(100) not null,
    mes_referencia date not null,
    valor_pago float not null,
    numero_socio int not null,

    constraint servicos_fk_socios
        foreign key (numero_socio) references socios(numero)
        ON DELETE restrict
    	ON UPDATE cascade
);

insert into socios(nome, endereco, codigo_tipo_socio, descricao_tipo_socio)
values('gustavo', 'Rua Barão do Rio Branco', 77, 'socio administrativo'),
      ('joao', 'av. central', 10, 'socio proprietario');

insert into servicos(descricao, mes_referencia, valor_pago, numero_socio)
values('realizado um servico administrativo para controle de fim de mes', '2020-01-17', 1700.00, 1),
      ('realizado um servico de socio proprietario afim de controle', '2021-04-10', 400.00, 2);

SELECT *
from servicos
WHERE valor_pago>500

--O comando SQL BETWEEN é utilizado para selecionarmos um determinado range de registros em uma tabela, ou seja, definimos um ponto inicial e final para consulta
SELECT * FROM servicos
WHERE mes_referencia BETWEEN '2020-01-01' AND '2020-01-31';

--O operador LIKE é utilizado para buscar por uma determinada string dentro de um campo com valores textuais
SELECT * from socios
WHERE endereco like '%Barão do Rio Branco%';