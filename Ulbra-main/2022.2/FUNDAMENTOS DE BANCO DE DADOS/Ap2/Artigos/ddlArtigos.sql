create table pesquisadores(
    codigo int auto_increment primary key,
    nome varchar(100) not null
);

create table artigos(
    codigo int auto_increment primary key,
    titulo varchar(100) not null,
    pagina_inicial varchar(100) not null,
    pagina_final varchar(100) not null,
    codigo_periodico int not null,
    titulo_periodico varchar(100) not null,
    editora varchar(100) not null,
    codigo_pesquisador int not null,

    constraint artigo_fk_pesquisadores 
        foreign key (codigo_pesquisador) references pesquisadores(codigo)
        ON DELETE restrict
    	ON UPDATE cascade
);

insert into pesquisadores(nome)
values('joão'), ('gustavo');

insert into artigos(codigo,titulo,pagina_inicial,pagina_final,codigo_periodico,titulo_periodico,editora,codigo_pesquisador)
values(1234,'percy jackson e o ladrao de raios','1','360',0007,'ação e ficcao','saraiva',1),
      (3546,'instrumentos mortais','1','330',0006,'ação e ficcao','Cassandra Clare',2);

SELECT * from artigos
WHERE codigo=1234;

SELECT * from artigos
WHERE editora like '%saraiva%';

SELECT * from pesquisadores
WHERE nome like '%joão%';