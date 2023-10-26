create database bd;
use bd;

create table categorias(
	id_categoria int auto_increment primary key,
    nome varchar(40) not null
);

insert into categorias (nome)
values ('Eletronicos'), ('Livros'), ('Alimentos'), ('Brinquedos');


create table produtos(
	id_produto int auto_increment primary key,
    id_categoria int not null,
    nome varchar(80) not null,
    preco_unit float not null,
    constraint produtos_fk_categorias
        foreign key (id_categoria) references categorias(id_categoria)
);

insert into produtos (nome, preco_unit, id_categoria)
values ('Notebook', 2500.00, 1), ('Livro de ficção', 30.00, 2), ('Arroz', 10.00, 3), ('Carrinho de corrida', 8.00, 4);

create table vendas (
  id_venda int auto_increment primary key,
  data_venda date not null,
  qtd int not null,
  valor_unit float not null,
  id_produto int not null,
  constraint vendas_fk_produtos
	foreign key (id_produto) references produtos(id_produto)
);

insert into vendas (data_venda, qtd, valor_unit, id_produto)
values  ('2022-02-28', 2, 2500.00, 1),  ('2022-02-27', 1, 29.90, 2),  ('2022-02-25', 3, 10.00, 3);

/*Uma empresa que vende produtos de diversas categorias está interessada em saber quais categorias de produtos tiveram o maior número de vendas no mês de fevereiro. 
Crie um relatório que liste o nome de cada categoria e o total de vendas realizadas para todos os produtos dessa categoria.*/

select c.nome, sum(v.qtd * v.valor_unit) as valor_total_vendas
from categorias c 
	inner join produtos p 
on p.id_categoria = c.id_categoria
	inner join vendas v
on v.id_produto = p.id_produto
where v.data_venda >= '2022-02-01' and v.data_venda <= '2022-02-28'
group by c.nome
having valor_total_vendas > 0; /*having seria para excluir as categorias que não tiveram vendas nesse periodo.*/

/*Uma empresa que vende produtos de diversas categorias está interessada em saber quais categorias de produtos tiveram o maior número de vendas no mês de fevereiro, 
incluindo as categorias que não tiveram vendas. Para isso, é necessário criar um relatório que liste o nome de cada categoria 
e o total de vendas realizadas para todos os produtos dessa categoria, mesmo que o total de vendas seja zero.*/

select c.nome, ifnull(sum(v.qtd * v.valor_unit), 0) as valor_total_vendas /*IFNULL() para substituir o valor NULL por 0 na coluna 'valor_total_vendas' quando não há vendas para uma determinada categoria*/
from categorias c 
	left join produtos p 
on p.id_categoria = c.id_categoria
	left join vendas v
on v.id_produto = p.id_produto and v.data_venda >= '2022-02-01' and v.data_venda <= '2022-02-28'
WHERE v.data_venda >= '2022-02-01' and v.data_venda <= '2022-02-28' OR v.data_venda IS NULL
group by c.id_categoria; /*LEFT JOIN para incluir todas as categorias, mesmo aquelas que não tiveram vendas no mês de fevereiro*/

/*Uma empresa que vende produtos de diversas categorias está interessada em saber quais categorias de produtos tiveram o maior número de vendas no no mês de fevereiro, 
incluindo as categorias que não possuem produtos vendidos. Para isso, é necessário criar um relatório que liste o nome de cada categoria 
e o total de vendas realizadas para todos os produtos dessa categoria, mesmo que não tenham sido realizadas vendas no mês de fevereiro.*/

select c.nome, ifnull(sum(v.qtd * v.valor_unit), 0) as valor_total_vendas 
from vendas v
	right join produtos p 
on p.id_produto = v.id_produto and v.data_venda >= '2022-02-01' and v.data_venda <= '2022-02-28'
	right join categorias c
on c.id_categoria = p.id_categoria /*RIGHT JOIN para incluir todas as categorias, mesmo aquelas que não tiveram vendas no mês de fevereiro*/
group by c.nome; /*a ordem das tabelas na cláusula FROM foi invertida em relação à consulta anterior, para usar RIGHT JOIN em vez de LEFT JOIN.*/

/*Porque não utilizar WHERE em vez de JOIN.
A diferença é que ao colocar essa condição no JOIN, você está limitando as linhas que serão combinadas entre as tabelas de produtos e vendas antes de executar a agregação com a função SUM(). 
Por outro lado, ao colocar essa condição no WHERE, você está limitando as linhas resultantes após a agregação.
Em geral, o uso da cláusula WHERE para filtrar os resultados é mais comum do que o uso de condições no JOIN. 
Mas, dependendo do caso, pode ser mais eficiente colocar a condição no JOIN, especialmente se a tabela de vendas for muito grande e a consulta precisar de desempenho.*/