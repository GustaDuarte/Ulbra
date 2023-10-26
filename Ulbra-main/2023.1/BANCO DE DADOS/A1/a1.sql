create database bd;
use bd;

/*ORDEM DE CRIACAO DAS TABELAS*/
/*cidades, filiais, empregados, produtos, vendas*/

create table cidades(
    codcid int auto_increment primary key,
    nome varchar(40) not null,
    uf char(2) not null
);

insert into cidades (codcid, nome, uf) values 
(1, "Torres", "rs"),
(2, "Capão da canoa", "rs");

create table filiais(
    codfilial int auto_increment primary key,
    codcid int not null,
    nome varchar(40) not null,
    endereco varchar(40) not null,
	uf char(2) not null,
    
    constraint filias_fk_cidades
        foreign key (codcid) references cidades(codcid)
);

insert into filiais (codfilial, codcid, nome, endereco, uf) values 
(1, 1, "f3", "rua 1", "rs"),
(2, 2, "emp", "rua 2", "rs");

create table empregados(
    codemp int auto_increment primary key,
    codcid int not null,
    codfilial int not null,
    nome varchar(40) not null,
    endereco varchar(40) not null,
    rg varchar(14) unique,
    cpf char(11) unique,
    salario float not null,
    
    constraint empregados_fk_cidades
        foreign key (codcid) references cidades(codcid),

    constraint empregados_fk_filiais
        foreign key (codfilial) references filiais(codfilial)
);

insert into empregados (codemp, codcid, codfilial, nome, endereco, rg, cpf, salario) values 
(1, 1, 1, "gustavo", "rua 1", "246539367", "48300897097", 2000),
(2, 2, 2, "joao", "rua 2", "111858252", "13848259087", 400);

create table produtos(
	codprod int auto_increment primary key,
    descricao varchar(100) not null,
	preco float not null,
    nomecategoria varchar(30) not null,
    descricaocategoria varchar(60) not null
    
);

insert into produtos (codprod, descricao, preco, nomecategoria, descricaocategoria) values 
(1, "refrigerante, cerveja...", 7.00, "bebidas", "bebidas enlatadas"),
(2, "sorvete de flocos", 20.00, "sorvete", "sobremesa ");

create table vendas(
	codprod int not null,
    codfilial int not null,
    
	constraint vendas_fk_produtos
        foreign key (codprod) references produtos(codprod),

    constraint vendas_fk_filiais
        foreign key (codfilial) references filiais(codfilial)
);

insert into vendas (codprod, codfilial) values 
(1, 1),
(2, 2);


 /*Listar o valor do produto mais caro.*/
select MAX(preco) as preco_max
FROM produtos; 

/*Obter a média dos preços dos produtos.*/
select AVG(preco) as media_preco_dos_produtos
FROM produtos;

/*Listar o nome dos produtos vendidos pela filial “f3”. (joins)*/
select p.codprod, p.nomecategoria, f.nome
from vendas v
	inner join produtos p
on p.codprod = v.codprod
	inner join filiais f
on f.codfilial = v.codfilial
where f.nome like '%f3';

/*Listar os nomes e números de RG dos funcionários que moram no Rio Grande do Sul e tem salário superior a R$ 500,00. (joins)*/

select e.nome, e.rg, e.salario
from empregados e
	inner join cidades c
on e.codcid = c.codcid
where c.uf like '%rs%' and e.salario > 500.00;

/*__________________________________________________________________________________________________________________________________________________________________________________*/

create database bd;
use bd;

create table cidades(
	codcid int auto_increment primary key,
	nome varchar(60) not null,
    uf char(2) not null
);

insert into cidades (codcid, nome, uf) values 
(1, "torres", "rs"),
(2, "capao da canoa", "rs");

create table clientes(
	codcliente int auto_increment primary key,
	codcid int not null,
    nome varchar(80) not null,
    endereco varchar(80) not null,
    
    constraint clientes_fk_cidades
        foreign key (codcid) references cidades(codcid)
);

insert into clientes (codcliente, codcid, nome, endereco) values 
(1, 1, "gustavo", "honorio germano"),
(2, 2, "joao", "rua 1");

create table autores(
	codautor int auto_increment primary key,
    codcid int not null,
	nome varchar(60) not null,
    
	constraint autores_fk_cidades
        foreign key (codcid) references cidades(codcid)
);

insert into autores (codautor, codcid, nome) values 
(1, 1, "Robert Cecil Martin"),
(2, 2, "Rick Riordan");

create table categorias(
	codcat int auto_increment primary key,
	nome varchar(60) not null,
    descricao varchar(100) not null
);

insert into categorias (codcat, nome, descricao) values 
(1, "banco de dados", "programacao"),
(2, "herois do olimpo", "aventura");

create table livros(
	codlivro int auto_increment primary key, 
    codautor int not null, 
    codcat int not null, 
    titulo varchar(80) not null, 
    nfolhas int not null, 
    editora varchar(80) not null, 
    valor float not null, 
    
	constraint livros_fk_autores
        foreign key (codautor) references autores(codautor),
		
    constraint livros_fk_categorias
        foreign key (codcat) references categorias(codcat)
        ON DELETE cascade
);

insert into livros (codlivro, codautor, codcat, titulo, nfolhas, editora, valor) values 
(1, "1", "1", "Banco de dados powerful", 456, "Alta Books", 301.00),
(2, "2", "2", "O herói perdido", 539 , "e-book", 46.90),
(3, "2", "2", "O filho de Netuno", 432  , "e-book", 46.90),
(4, "2", "2", "A Marca de Atena", 480  , "e-book", 39.90),
(5, "2", "2", "A Casa de Hades", 496  , "e-book", 29.90),
(6, "2", "2", "O Sangue do Olimpo", 432  , "e-book", 39.90);

create table vendas(
	codvenda int auto_increment primary key,
    codlivro int not null,
	codcliente int not null,
    quantidade int not null,
    data_venda date not null,
    
	constraint vendas_fk_livros
        foreign key (codlivro) references livros(codlivro),

    constraint vendas_fk_clientes
        foreign key (codcliente) references clientes(codcliente)
);

insert into vendas (codvenda, codlivro, codcliente, quantidade, data_venda) values 
(1, 1, 1, 3, '2021-03-20'),
(2, 1, 1, 3, '2021-01-20'),
(3, 2, 2, 5, '2022-01-20'),
(4, 3, 2, 5, '2022-01-21'),
(5, 4, 2, 5, '2022-01-22'),
(6, 5, 2, 5, '2022-01-23'),
(7, 6, 2, 5, '2022-01-23');

/*Mostrar o número total de vendas realizadas.*/
select max(codvenda) as total_de_vendas_realizadas
from vendas; 

/*Listar os títulos e valores dos livros da categoria “banco de Dados’. Mostra também o nome da categoria.*/
select l.titulo, l.valor, c.nome
from livros l
	inner join categorias c
on c.codcat = l.codcat
where c.nome like '%banco de dados%';

/*Listar os  títulos e nome dos autores dos livros que custam mais que R$ 300,00.Listar os nomes dos clientes juntamente com o nome da cidade onde moram e UF.*/
select l.titulo, a.nome, l.valor, c.nome, c.endereco, ci.uf, v.codvenda
from livros l
	inner join autores a
on a.codautor = l.codautor
	inner join vendas v
on v.codlivro = v.codlivro
	inner join clientes c
on c.codcliente = v.codcliente
	inner join cidades ci
on ci.codcid = c.codcid
where l.valor > 290.00 and v.codlivro = l.codlivro; /*NOTA: optei por exibir o id(codvenda) da venda para tirar a prova real das clausulas da questao*/

/*Listar os nomes dos clientes juntamente com os nomes de todos os livros comprados por ele.*/
select c.nome, l.titulo
from vendas v
	inner join livros l
on l.codlivro = v.codlivro
	inner join clientes c
on c.codcliente = v.codcliente /*NOTA: se colocar o where pode realizar a busca por nome do cliente, vulgo apenas relatando o obvio*/
/*where c.nome like '%gustavo%'*/;

/*Listar o código do livro, o tilulo, o nome do autor, dos livros que foram vendidos no mês de março de 2021. (join)*/
select l.codlivro, l.titulo, a.nome, v.data_venda
from livros l
	inner join autores a
on a.codautor = l.codautor
	inner join vendas v
on v.codlivro = l.codlivro
where v.data_venda between '2021-03-01' and '2021-03-31'
group by v.data_venda;

/*Listar o título e o autor dos 5 livros mais vendidos do mês de janeiro.*/
select l.titulo, a.nome, v.data_venda, v.quantidade
from livros l
	inner join autores a
on a.codautor = l.codautor
	inner join vendas v
on v.codlivro = l.codlivro
where v.data_venda between '2022-01-01' and '2022-01-31'
order by v.quantidade
limit 5;

/*Mostrar o nome do cliente que comprou o livro com o título ‘Banco de dados powerful’).*/
select v.codvenda, c.nome as comprador, l.titulo as livro
from livros l
	inner join vendas v
on v.codlivro = l.codlivro
	inner join clientes c
on c.codcliente = v.codcliente
where  l.titulo like '%Banco de dados powerful';