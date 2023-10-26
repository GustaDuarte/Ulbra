--Liste todos os produtos cadastrados e ordene por ordem alfabética de descrição.

select *
from produtos
order by descricao asc

--Lista os produtos que foram pedidos e o nome do fornecedor de cada pedido.

select f.nome, pd.descricao, pd.qtd, pd.valor, f.nome
from fornecedores f
        inner join pedidos p 
            on p.id_forn = f.id
        inner join pedidos_itens pi 
            on pi.id_pedido = p.id
        inner join produtos pd
            on pd.id = pi.id_produto

--Mostre os produtos que já foram pedidos e o nome da categoria a que ele pertence.

select pd.id pd.descricao, c.nome as categoria
from   pedidos_itens pi         
        inner join
            on pi.id_pedido = p.id
        inner join produtos pd
            on pd.id = pi.id_produto
        inner join categorias c
            on c.id = pd.id_categoria

--Mostre o nome do fornecedor, a data do último pedido e a descrição do produto que ele pediu.

select f.nome as fornecedor, pd.id, pd.descricao, max(p.data) as ultimo_pedido_feito
from fornecedores f
        inner join pedidos p 
            on p.id_forn = f.id
        inner join pedidos_itens pi 
            on pi.id_pedido = p.id
        inner join produtos pd
            on pd.id = pi.id_produto
group by f.nome, pd.id, pd.descricao
