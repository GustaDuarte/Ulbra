--Monte um comando para excluir da tabela livros aqueles que possuem o código maior ou igual a 2, que possuem o preço maior que R$ 50,00 e que já foram lançados.
DELETE
from livros
where id>=2 and preco>50.00 and lancamento < current_date and lancamento is not null;

--Escreva o comando que seleciona as colunas NOME, CPF e ENDERECO, da tabela AUTOR, para aqueles que possuem a palavra ‘joão’ no nome.
SELECT nome, cpf, endereco 
from autores
WHERE nome like '%neymar%';

--Excluir o livro cujo título é ‘BANCO DE DADOS DISTRIBUÍDO’ ou ‘BANCOS DE DADOS DISTRIBUÍDOS’. Somente essas duas opções devem ser consideradas.
DELETE
from livros
where titulo like 'banco_de dado_distribuido_';

--Selecione o nome e o CPF de todos os autores que nasceram após 01 de janeiro de 1990.
select nome, cpf
from autores
where data_nascimento > '1990-01-01';

--Selecione a matrícula e o nome dos autores que possuem RIO DE JANEIRO no seu endereço.
select matricula, nome
from autores
where endereco like '%rio de janeiro%';

--Atualize para zero o preço de todos os livros onde a data de lançamento for nula ou onde seu preço atual for inferior a R$ 55,00.
update livros
set preco = 00.00
where preco < 55.00 or lancamento is null;

--Exclua todos os livros onde o assunto for diferente de ‘S’, ‘P’, ou ‘B’.
DELETE
from livros
where id_assunto <> 's' and id_assunto <> 'p' and id_assunto <> 'b';

--Exclua todos os livros onde o assunto for ‘S’, ‘P’, ou ‘B’.
DELETE
from livros
where id_assunto in('p', 'b');

--Escreva o comando para contar quantos são os autores cadastrados na tabela AUTORES.
select count(matricula)
from autores;

--Escreva o comando que apresenta qual o número médio de autores de cada livro. Você deve utilizar, novamente, a tabela AUTOR_LIVRO. 
select avg(matricula)
from autores_livros;

--quantos autores tem por livro
select * avg(quantos) from(
select livro_id, count(autor_id) as quantos
from autores_livros
group by liivro_id
) as minhaTabela

--Apresente o comando SQL para gerar uma listagem dos códigos dos livros que possuem ao menos dois autores.
select id_livro, count(id_autor) as quantos
from autores_livros
group by id_livro
having quantos >= 2;

--Escreva o comando para apresentar o preço médio dos livros por código de editora. Considere somente aqueles que custam mais de R$ 45,00.
select id_editora as codigo_editora, avg(preco)
from livros 
where preco > 45.00
group by id_editora;

--Apresente o preço máximo, o preço mínimo e o preço médio dos livros cujos assuntos são ‘S’ ou ‘P’ ou ‘B’, para cada código de editora.
select id_editora, MAX(preco) as preco_max, min(preco) as preco_min, AVG(l.preco) as preco_medio
FROM livros 
WHERE l.id_assunto in('s','p','b')
group by id_editora;

--Altere o comando do exercício anterior para só considerar os livros que já foram lançados (data de lançamento inferior a data atual) e cujo o preço máximo é inferior a R$ 100,00.
select id_editora, MAX(preco) as preco_max, min(preco) as preco_min, AVG(l.preco) as preco_medio
FROM livros 
WHERE l.id_assunto in('s','p','b') and lancamento <= current_date
group by id_editora
having preco_max < 5;

--JOINS__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

--Estão sendo estudados aumentos nos preços dos livros. Escreva o comando SQL que retorna uma listagem contendo o titulo dos livros, e mais três colunas: uma contendo os preços dos livros acrescidos de 10% (deve ser chamada de ‘Opção_1’), a segunda contendo os preços acrescidos de 15% (deve ser chamada de ‘Opção_2’) e a terceira contendo os preços dos livros acrescidos de 20% (deve ser chamada de ‘Opção_3’). Somente devem ser considerados livros que já tenham sido lançados.
select titulo, (preco+(preco*0.10)) as opcao1, (preco+(preco*0.15)) as opcao2, (preco+(preco*0.20)) as opcao3
from livros
where lancamento is not null;

--Escreva o comando SQL que apresenta uma listagem contendo o código da editora, o nome da editora, a sigla do assunto e o titulo dos livros que já foram lançados. Os dados devem estar em ordem decrescente de preço, e ascendente de código da editora e de título do livro.
select e.id, e.nome, id_assunto, l.lancamento, l.preco
from livros l
	inner join editoras e
on l.id_editora = e.id
where l.lancamento <= current_date
order by l.preco desc, e.id asc, l.titulo asc;

--Escreva o comando que apresente uma listagem dos nomes dos autores e do seu ano e mês de nascimento, para os autores brasileiros e que tem livros ainda não lançados. A listagem deve estar ordenada em ordem crescente de nome.
select distinct a.nome, (day)a.data_nascimento as dia ,(month)a.data_nascimento as mes, (year)a.data_nascimento as ano
from autores a
	inner join autores_livros al
on al.matricula_autores = a.matricula
	inner join livros l
on l.id = al.id_livro
where nacionalidade like '%brasileiro%' and l.lancamento is null or l.lancamento <= current_date
order by a.nome asc;

--Escreva o comando que retorna o nome dos autores e o título dos livros de sua autoria. A listagem deve estar ordenada pelo nome do autor, mostrar somente os livros já lançados.
select a.nome, l.titulo
from autores_livros al 
	inner join livros l
on l.id = al.id_livro
	inner join autores a
on a.matricula = al.id_livro
where l.lancamento is not null
order by a.nome;

--Monte a consulta SQL que retorna as editoras que publicaram livros escritos pela autora 'Ana da Silva'
select e.nome, l.titulo
from autores a
	inner join livros l
on l.id = al.id_livro
	inner join autores a
on a.matricula = al.matricula_autores
where a.nome like '%Ana da Silva%';
PAREI AQUI

--FUS (faça um SQL) que apresente o título do livro e o nome da editora que o publica para todos os livros que custam menos que 50 reais.
select l.titulo, e.nome 
from livros l
	inner join editora e  
on e.id = l.id_editora
where l.preco < 50.00;

--FUS que apresente o CPF, nome do autor e o preço máximo dos livros de sua autoria. Apresente somente as informações para os autores cujo preço máximo for superior a 50.
select a.cpf, a.nome, max(l.preco) as preco_max
from autores_livros al
	inner join livros l
on l.id = al.id_livro
	inner join autores a
on a.matricula = al.matricula_autores
where l.preco >50.00; 