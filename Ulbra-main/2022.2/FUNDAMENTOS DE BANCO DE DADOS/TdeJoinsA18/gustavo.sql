/*Faça uma modelagem com 3 tabelas que de condições de extrair os dados usando:
----
- função de agregação (minimo 2. ex. Sum, count)
- joins
- group by
- having

Pode fazer em grupo mas todos entregam a sua versão.
 
Vamos compartilhar a tela e mostrar em aula.

Enviar arquivo da atividade*/

create table vendedores(
id int auto_increment primary key,
nome varchar(50) not null
);

create table categorias(
    id int auto_increment primary key,
    nome varchar(80) not null
);

create table produtos(
    id int auto_increment primary key,
    id_categoria int, 
    valor double not null,
    descricao varchar(80) not null,

    constraint produtos_fk_categorias
        foreign key (id_categoria) references categorias(id)
            ON DELETE restrict
            ON UPDATE cascade
   
);

create table vendas_produtos(
    id_venda int not null,
    id_produto int not null,
    qtd int not null,
    valor_unit float not null,

    constraint vendas_produtos_fk_vendas
        foreign key (id_venda) references vendas(id)
        ON DELETE restrict
        ON UPDATE cascade,
    constraint vendas_produtos_fk_produtos
        foreign key (id_produto) references produtos(id)
        ON DELETE restrict
        ON UPDATE cascade
);

create table vendas(
    id int auto_increment primary key,
    id_vendedor int not null,
    data_venda date,

    constraint vendas_fk_vendedores
        foreign key (id_vendedor) references vendedores(id)
            ON DELETE restrict
            ON UPDATE cascade
);


insert into vendedores (id, nome) values 
(1, "Neymar"),
(2, "Vini jr" ),
(3, "Caze"),
(4, "Richarlison");

insert into categorias (id, nome) values
(1, 'mataerial escolar'),
(2, 'utensilios'),
(3, 'ferramentas'),
(4, 'brinquedos');

insert into produtos (id, valor, descricao, id_categoria) values
(1, 3.00, 'caneta', 1),
(2, 20.00, 'panela', 2),
(3, 14.00, 'martelo', 3),
(4, 37.00, 'lego', 4);


insert into vendas (id, id_vendedor, data_venda) values 
(1, 4, '2022-11-07'),
(2, 3, '2022-09-01'),
(3, 2, '2022-07-22'),
(4, 1, '2022-10-09'),
(5, 2, '2022-10-15'),
(6, 1, '2022-10-04'),
(7, 2, '2022-09-20'),
(8, 1, '2022-10-20'),
(9, 1, '2022-11-20'),
(10, 1, '2022-11-20');

insert into vendas_produtos (id_venda, id_produto, qtd, valor_unit) values
(1, 2, 1, 20.00),
(2, 1, 3, 3.00),
(3, 4, 2, 14.00),
(4, 3, 1, 37.00);

--------------------------------------------------------------------

/*Ex - Função de agregação (minimo 2. ex. Sum, count)*/

/* Comando para contar quantos são os vendedores cadastrados na tabela vendedores*/

select count(id) as quantos
from vendedores 


/*Qual vendedor tem mais vendas*/

select vd.nome as nome_vendedor, vd.id as id_vendedor, count(vd.id) as quantidade_vendas
from vendas v inner join vendedores vd 
    on vd.id = v.id_vendedor
group by vd.id 
order by quantidade_vendas desc
limit 1;

--Apresente o comando SQL para gerar uma listagem dos produtos que possuem ao menos duas vendas.
select id_produto, count(id_venda) as quantos
from vendas_produtos
group by id_produto
having quantos >= 2;