SELECT p.Nome AS Prooduto, p.Preco, v.Data_venda
FROM Produtos p, Vendas-itens vi, Vendas v
WHERE p.id = vi.id_Produto AND vi.id_Venda = v.id AND v.Data_venda >= '2022-10-01' AND v.Data_venda <= '2022-11-30'

SELECT SUM (QTD * Valor_unitario) AS TOTAL
FROM Vendas-itens
WHERE ID_Venda = 1001

SELECT p.id, p.nome, vi.Valor_unitario
FROM  Produtos P, Vendas-itens vi, Vendas V
WHERE p.id = vi.id_Produto AND vi.id = vi.id_Venda 
v.Data_venda >= '2022/10/01' AND v.Data_venda <= '2022/10/31' AND 
ORDER BY vi.Valor_unitario ASC