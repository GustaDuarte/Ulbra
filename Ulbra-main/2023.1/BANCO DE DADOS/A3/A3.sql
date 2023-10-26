create database bd;
use bd;

/*Escreva uma consulta que retorne o nome do cliente, a soma do valor total das compras e o número total de pedidos feitos por cada cliente, apenas para aqueles que fizeram pelo menos três pedidos. 
Use um inner join entre as tabelas "clientes" e "pedidos" e agrupe os resultados pelo nome do cliente.*/

CREATE TABLE clientes (
  id_cliente int auto_increment primary key,
  nome varchar(50) not null
);

insert into clientes (nome)
values ('Gustavo'), ('joao'), ('José'), ('Ana'), ('Pedro'), ('Lucas');

CREATE TABLE pedidos (
  id_pedido int auto_increment primary key,
  id_cliente int not null,
  valor_total float not null,
   constraint pedidos_fk_clientes
        foreign key (id_cliente) references clientes(id_cliente)
);

insert into pedidos (id_cliente, valor_total) 
values (1, 100.00), (2, 200.00), (2, 50.00), (1, 150.00), (3, 300.00), (4, 75.00), (1, 200.00), (3, 250.00), (4, 100.00), (5, 150.00), (6, 50.00), (1, 300.00), (3, 100.00);

select c.nome, sum(p.valor_total) as total_compras, count(p.id_pedido) as total_pedidos
from clientes c 
	join pedidos p
on c.id_cliente = p.id_cliente
group by c.nome
having total_pedidos >= 3;

/*Escreva uma consulta que retorne o nome do produto, a média do preço de venda e a soma total de unidades vendidas por categoria de produto. 
Use um left join entre as tabelas "produtos" e "vendas" e agrupe os resultados pela categoria do produto*/

CREATE TABLE produtos (
  id_produto int auto_increment primary key,
  nome varchar(50) not null,
  categoria varchar(50) not null
);

insert into produtos (nome, categoria) 
values ('Notebook', 'Eletrônicos'), ('Smartphone', 'Eletrônicos'), ('Camiseta', 'Vestuário'), ('Calça', 'Vestuário'), ('Tênis', 'Calçados'), ('Sapato', 'Calçados');

CREATE TABLE vendas (
  id_venda int auto_increment primary key,
  id_produto int not null,
  preco_venda float not null,
  qtd_vendida int not null,
  constraint vendas_fk_produtos
        foreign key (id_produto) references produtos(id_produto)
);

insert into vendas (id_produto, preco_venda, qtd_vendida) 
values (1, 2500.00, 10), (2, 1500.00, 20), (3, 50.00, 100), (4, 80.00, 50), (5, 200.00, 30), 
(6, 150.00, 40), (1, 2700.00, 5), (2, 1600.00, 15), (4, 85.00, 25), (5, 220.00, 20), (6, 180.00, 35), (3, 60.00, 80);

select p.categoria, p.nome, avg(v.preco_venda) as media_preco_venda, sum(v.qtd_vendida) as total_unidades_vendidas
from produtos p
	left join vendas v /*Como estamos usando um left join, todos os registros da tabela "produtos" serão incluídos no resultado, mesmo que não existam vendas registradas para um determinado produto.*/
on p.id_produto = v.id_produto
group by p.categoria, p.nome;


/*Escreva uma consulta que retorne o nome do fornecedor, o nome do produto e o número total de unidades compradas por fornecedor e por produto, apenas para aqueles com mais de 100 unidades compradas. 
Use um inner join entre as tabelas "fornecedores", "produtos" e "compras" e agrupe os resultados pelo nome do fornecedor e pelo nome do produto.*/

CREATE TABLE fornecedores (
  id_fornecedor int auto_increment primary key,
  nome varchar(50)
);

insert into fornecedores (nome) 
values ('Fornecedor A'), ('Fornecedor B'), ('Fornecedor C');

CREATE TABLE produtos (
  id_produto int auto_increment primary key,
  nome varchar(50)
);

insert into produtos (nome) values ('Produto 1'), ('Produto 2'), ('Produto 3');

CREATE TABLE compras (
  id int auto_increment primary key,
  id_fornecedor int not null,
  id_produto int not null,
constraint compras_fk_fornecedores
	foreign key (id_fornecedor) references fornecedores(id_fornecedor),
constraint compras_fk_produtos
	foreign key (id_produto) references produtos(id_produto)
);

insert into compras (id_fornecedor, id_produto) 
values (1, 1), (1, 2), (2, 1), (2, 2), (3, 2), (3, 3);
 
create table compras_produtos (
	id int auto_increment primary key,
    id_compra int not null,
    id_produto int not null,
    qtd int not null,
constraint compras_produtos_fk_compras
	foreign key (id_compra) references compras(id_compra),
constraint compras_produtos_fk_produtos
	foreign key (id_produto) references produtos(id_produto)
);
select f.nome as nome_fornecedor, p.nome as nome_produto, sum(cp.qtd) as total_unidades_compradas
from fornecedores f
	join compras c
on c.id_fornecedor = f.id_fornecedor 
	join produtos p
on p.id_produto = c.id_produto
	join compras_produtos cp
on cp.id_produto = p.id_produto
group by f.nome, p.nome
having total_unidades_compradas > 100;

/*Escreva uma consulta que retorne o nome do departamento, o nome do funcionário e a média do salário dos funcionários em cada departamento, 
apenas para aqueles com uma média de salário superior a R$ 5000. 
Use um left join entre as tabelas "funcionarios" e "departamentos" e agrupe os resultados pelo nome 
do departamento e pelo nome do funcionário.*/

CREATE TABLE departamentos (
  id_departamento int auto_increment primary key,
  nome varchar(50)
);

insert into departamentos values (1, 'Vendas'), (2, 'Marketing'), (3, 'Financeiro');

CREATE TABLE funcionarios (
  id_funcionario int auto_increment primary key,
  id_departamento int not null,
  nome varchar(50),
  salario float,
 constraint funcionarios_fk_departamentos
	foreign key (id_departamento) references departamentos(id_departamento)
);

insert into funcionarios (id_funcionario, nome, salario, id_departamento) 
values (1, 'João', 6000, 1), (2, 'Maria', 4500, 1), (3, 'Pedro', 7000, 2), (4, 'Ana', 8000, 2), 
(5, 'Carlos', 4000, 3), (6, 'Lucas', 6000, 3), (7, 'Sandra', 5500, 3), (8, 'Fernanda', 9000, 3);

select d.nome as nome_departamento, f.nome as nome_funcionario, avg(f.salario) as media_salario
from departamentos d
	left join funcionarios f 
on d.id_departamento = f.id_departamento
group by d.nome, f.nome
having avg(f.salario) > 5000;

/*Escreva uma consulta que retorne o nome do cliente, o nome do produto e a soma do valor total das compras feitas por cada cliente para cada produto. 
Use um right join entre as tabelas "clientes" e "compras" e um inner join entre as tabelas "produtos" e "compras" e agrupe os resultados pelo nome do cliente e pelo nome do produto.*/

CREATE TABLE clientes (
  id_cliente int auto_increment primary key,
  nome varchar(50) not null
);

insert into clientes (nome) 
values ('João'), ('Maria'), ('Pedro');

CREATE TABLE produtos (
  id_produto int auto_increment primary key,
  nome varchar(50) not null,
  preco float not null
);

insert into produtos (nome, preco) values ('Camiseta', 29.99), ('Calça', 59.99), ('Tênis', 89.99);

CREATE TABLE compras (
  id int auto_increment primary key,
  id_cliente int not null,
  id_produto int not null,
  qtd int not null,
  valor_total float not null,
  data_compra date not null,
constraint compras_fk_clientes
	foreign key (id_cliente) references clientes(id_cliente),
constraint compras_fk_produtos
	foreign key (id_produto) references produtos(id_produto)

);

insert into compras (id_cliente, id_produto, qtd, valor_total, data_compra) 
values (1, 1, 2, 59.98, '2022-01-01'), (1, 2, 1, 59.99, '2022-01-15'), (2, 1, 3, 89.97, '2022-02-01'),
(2, 3, 2, 179.98, '2022-02-15'), (3, 2, 1, 59.99, '2022-03-01'), (3, 3, 1, 89.99, '2022-03-15');

select c.nome as nome_cliente, p.nome as nome_produto, SUM(co.valor_total) as total_compras
from clientes c
	right join compras co 
on c.id_cliente = co.id_cliente
	join produtos p
on p.id_produto = co.id_produto
group by c.nome, p.nome;