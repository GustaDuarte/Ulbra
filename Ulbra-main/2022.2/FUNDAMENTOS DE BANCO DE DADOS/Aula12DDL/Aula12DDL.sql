create table categorias
(
    id int auto_increment primary key,
    nome varchar(100) not null
);

create table produtos
(
    id int auto_increment primary key,
    data_cadastro date not null,
    valor_unitario float not null,
    descricao varchar(200),
    id_categoria int,
    constraint produtos_fk_categorias
        foreign key(id_categoria) references categorias(id)
);

create table fornecedor
(
    id int auto_increment primary key,
    nome varchar(100) not null
);

create table venda_produto
(
    id int auto_increment primary key,
    nome varchar(100) not null,
    quantidade int not null,
    valor_unitario float not null,
    data_venda datetime,
    id_produto int not null,
    id_fornecedor int not null,
    constraint venda_produto_fk_produtos
        foreign key(id_produto) references produtos(id),
    constraint venda_produto_fk_fornecedor
        foreign key(id_fornecedor) references fornecedor(id)
);

