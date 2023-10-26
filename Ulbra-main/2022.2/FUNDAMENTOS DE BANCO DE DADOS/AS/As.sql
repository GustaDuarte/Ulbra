--1. Atente as tabelas abaixo.
--Pode-se afirmar que os relacionamentos entre as tabelas Cliente e Pedido e entre as tabelas Pedido e Item são, respectivamente:
--Marque a resposta certa e explique por que as outras estão erradas.

B. 1:N e 1:N

/*As outras alternativas estão erradas porque a tabela cliente pode realizar um ou muitos pedidos e a tabela pedido pode ser realizada por um e somente um cliente, já a tabela
pedidos pode ser registrada por um e somente um item e a tabela itens pode ter registrada nela um ou muitos pedidos.*/

___________________________________________________________________________________________________________________________________________________

--2. Com base no esquema “Acadêmico“, analise as seguintes afirmações;

B.  II
____________________________________________________________________________________________________________________________________________________

--3. Marque a sentença que permite listar todos os nomes dos alunos juntamente com o nome da cidade onde moram, ordenado pelo nome do aluno.
E. (_X_) Select aluno.nome, cidade.nome from cidade, aluno where cidade.idcid=aluno.idcid order by aluno.nome
_____________________________________________________________________________________________________________________________________________________

--4. (_X_) Select aluno.nome, cidade.nome from cidade, aluno where cidade.idcid=aluno.idcid order by aluno.nome
--Mostre o SQL que consulta também, antes de atualizar os dados.
SELECT valor_credito * (1.1)  AS valor_acrescido
FROM curso 
WHERE nome LIKE "%ads%"

UPDATE CURSO
SET valor_credito = valor_credito * 1.1
WHERE nome LIKE "%ads%"

--5. Marque a sentença que permite listar os códigos(id) das turmas com o nome da disciplina e a sala.
--refatore a resposta escolhida como certa, para utilizar JOINS.
 
A. (_X_)  Select idturma, nome, sala from turma, turdisc, disciplina where turma.idturma=turdisc.idturma and disciplina.iddisc=turdisc.iddisc
SELECT t.idturma, d.nome, t.sala
FROM turma t
INNER JOIN Turdisc td
	ON t.idturma = td.idturma
INNER JOIN disciplina d
	ON d.iddisc = td.iddisc  

--6. Defina o comando SQL para listar o nome do curso e valor do crédito para o curso que tem o valor mais baixo de crédito(valorcredito).
--refatore a resposta escolhida como certa, para utilizar JOINS.
B. (_X_) Select nomecurso, valorcredito from curso where valorcredito=(select min(valorcredito) from curso)

SELECT c1.nomecurso, min(c1.valorcredito) AS curso_com_valor_mais_baixo
FROM curso c1
LEFT JOIN curso c2
    ON c1.idcurso = c2.idcurso
GROUP BY c1.idcurso
ORDER BY curso_com_valor_mais_baixo ASC
LIMIT 1;

--7. Explique o conceito Integridade Referencial. De um exemplo SQL DDL para ilustrar melhor a sua explicação, usando a modelagem relacional (“Academico”).
Integridade referencial é um conceito relacionado à chaves estrangeiras. O valor que é chave estrangeira em uma tabela destino, 
deve ser chave primária de algum registro na tabela origem. Quando essa regra é desrespeitada, então temos o caso em que a integridade referencial é violada. 
Por exemplo, se fossemos inserir uma turma, com o id_curso 5, tendo em vista que o último registro do id_curso é 4, se o banco de dados permitir essa inclusão, 
ocorrerá uma violação da integridade referencial, pois estará sendo feita uma referência a uma entidade inexistente.

cidade(idcid, nome, UF)
insert into academico(nome, email, idcid)
values(1, 'torres', 'rs')
values(2, 'tramandai', 'rs')
values(3, 'capao da canoa', 'rs')
values(4, 'arroio do sal', 'rs')

academico(idacad, nome, email, idcid)
idcid referencia cidade(idcid)

insert into academico(nome, email, idcid)
values('joao', 'joao@rede.ulbra.br', 5)


--8. Faça um SQL para adicionar a coluna data_entrada na tabela matricula.
ALTER TABLE matricula
ADD column data_entrada DATE NOT NULL;

--9. Faça um SQL para selecionar os alunos que não moram na cidade onde estudam. Considerando que a cidade onde estudam é Torres. Exibir o código, o nome do aluno e a cidade onde ele mora.
SELECT a.idaluno, a.nome, c.nome
FROM aluno a
INNER JOIN cidade c
	ON c.idcid = a.idcid
WHERE c.nome != "torres";

--10. Faça um SQL para exibir o nome do aluno, o código do curso, o nome do curso e o nome do professor da turma e a data que ele se matriculou. Apresentar somente para alunos que tenham se matriculado entre semestre 1 de 2022, considere que as matrículas iniciam em janeiro.
SELECT a.nome as nome_aluno, c.idcurso, c.nomecurso, p.nome as nome_professor, m.data_entrada
FROM matricula m
INNER JOIN aluno a
	ON a.idaluno = m.idaluno
INNER JOIN turma t
	ON t.idturma = m.idturma
INNER JOIN curso c
	ON c.idcurso = t.idcurso
inner join professor p 
	on p.idprof = t.idprof
WHERE data_entrada BETWEEN '2022-01-01' AND '2022-06-30';

--11. Faça um SQL que liste os 2 professores que mais turmas já atenderam. Importante mostrar o nome do professor.
SELECT max(p.idprof) as id_prof, p.nome
FROM professor p
INNER JOIN turma t
	ON p.idprof = t.idprof
group by p.idprof 
order by id_prof asc
LIMIT 2;