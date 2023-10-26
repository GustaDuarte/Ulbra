
-- padroes de nomes?? no SQL é como?
-- snake_case mais utilizado em SQL

/*
SQL não é uma LP.

MASSSSS

PL/SQL

*/

-- temos um modelo lógico

-- 1 cliente tem endereços e um endereço pertence a um cliente

clientes(id int primary key, nome char(100));
endereços(id, logradouro, numero, bairro, cidade, estado, id_cliente FK);

-- OBS: nome de tabelas sempre no plural.
-- nome de atributos sempre no singular.

--CREATE TABLE

/*
create table <nome_da_tabela>(
    atributo | dominio | restrição de vazio | chave
);
*/

create table clientes
(
    id int not null primary key,
    nome varchar(100) not null,
    CPF varchar(14) unique,
    limite_credito float default 0
);

create table enderecos
(
    id int not null primary key,
    logradouro varchar(100) not null,
    numero int default 0,
    bairro varchar(100),
    cidade varchar(100),
    estado char(2),
    id_cliente int not null,
    constraint clientes_tem_enderecos
    foreign key(id_cliente) references clientes(id)
);

create table professores
(
    id int not null primary key,
    nome varchar(100) not null,
    cpf char(14) unique
);

create table disciplinas
(
    id int not null auto_increment primary key,
    nome varchar(100) not null,
    id_professor int not null,
    constraint professores_tem_disciplinas
    foreign key(id_professor) references professores(id)

);

create table softwares
(
    id int not null auto_increment primary key,
    nome varchar(100) not null,
    fabricante varchar(50)
);

create table disciplina_softwares
(
    id_disciplina int not null,
    id_software int not null,
    constraint fk_disciplinas_inseridas_no_software
    foreign key(id_disciplina) references disciplinas(id),
    constraint fk_softwares_tem_disciplinas
    foreign key(id_software) references softwares(id)
);

/*
aluno(id, nome)
departamento (id, nome)
curso(id, nome, id_depto)
  id_depto referencia departamento (id)
professor(id, nome)
disciplina(id, nome, id_prof)
   id_prof referencia professor(id)
matricula(id_disciplina, id_aluno, data_matr)
    id_disciplina referencia disciplina(id) 
   id_aluno referencia aluno(id);
*/

create table alunos
(
    id int not null auto_increment primary key,
    nome varchar(100) not null
);

create table departamentos
(
    id int not null auto_increment primary key,
    nome varchar(100) not null
);

create table cursos
(
    id int not null auto_increment primary key,
    nome varchar(100) not null,
    id_departamento int not null,
    constraint fk_cursos_possuem_departamentos
    foreign key(id_departamento) references departamentos(id)
);

create table professores
(
    id int not null auto_increment primary key,
    nome varchar(100) not null
);

create table disciplinas
(
    id int not null auto_increment primary key,
    nome varchar(100) not null,
    id_professor int not null,
    constraint professores_tem_disciplinas
    foreign key(id_professor) references professores(id)

);

create table matriculas
(   
    data_matricula date,
    id_disciplina int not null,
    id_aluno int not null,
    constraint fk_disciplina_possue_matricula
    foreign key(id_disciplina) references disciplinas(id),
    constraint fk_aluno_possue_matricula
    foreign key(id_aluno) references alunos(id)
);
