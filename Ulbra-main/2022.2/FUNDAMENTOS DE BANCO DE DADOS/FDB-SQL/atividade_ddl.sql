
create table colaboradores
(
    id int auto_increment primary key,
    matricula varchar(20) not null unique,
    nome varchar(100) not null,
    id_coordenador int,
    constraint coordenadores_fk_colaboradores 
        foreign key(id_coordenador) references colaboradores(id)
);

create table projetos
(
    id int auto_increment primary key,
    nome varchar(100) not null,
    descricao varchar(200),
    duracao int not null
);

create table projetos_colaboradores
(
    id int auto_increment primary key,
    id_projeto int not null,
    id_colaborador int not null,
    constraint projetos_fk_projetos_tem_colaboradores
        foreign key(id_projeto) references projetos(id),
    constraint colaboradores_fk_projetos_tem_colaboradores
        foreign key(id_colaborador) references colaboradores(id)

);

create table projetos_comentarios
(
    id int not null auto_increment primary key,
    id_colaborador int not null,
    id_projeto int not null,
    data_hora datetime not null,
    constraint colaboradores_fk_projetos_comentarios
        foreign key(id_colaborador) references colaboradores(id),
    constraint projetos_fk_projetos_comentarios
        foreign key(id_projeto) references projetos(id)
);

create table departamentos
(
    id int auto_increment primary key,
    nome varchar(50) not null
);

create table projetos_melhoria_processos
(
    id int auto_increment primary key,
    resultados_esperados varchar(500) not null,
    id_projeto int not null,
  	id_departamento int not null,
    constraint projetos_fk_projetos_melhoria_processos
        foreign key(id_projeto) references projetos(id),
    constraint departamentos_fk_projetos_melhoria_processos
        foreign key(id_departamento) references departamentos(id)

);

create table projetos_sociais
(
    id int auto_increment primary key,
    id_projeto int not null,
    publico_beneficiario varchar(200) not null,
    constraint projetos_fk_projetos_sociais
        foreign key(id_projeto) references projetos(id)
);
