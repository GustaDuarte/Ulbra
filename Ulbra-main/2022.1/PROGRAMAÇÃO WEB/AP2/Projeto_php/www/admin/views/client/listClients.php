<h1>Lista de Clientes</h1>

<table class="table ">
    <tr>
        <th>ID Cliente</th>
        <th>Nome</th>
        <th>Telefone</th>
        <th>Email</th>
        <th>Endereço</th>
        <th>Imagem</th>
        <th colspan="2">Ações</th>
    </tr>

    <?php

        foreach($arrayClients as $client){
    ?>
        
            <tr>
            <td>
                <?=$client['idClient']?>
            </td>
            <td>
                <?=$client['name']?>
            </td>
            <td>
                <?=$client['phone']?>
            </td>
            <td>
                <?=$client['email']?>
            </td>
            <td>
                <?=$client['address']?>
            </td>
            <td>
                <?php
                    if(is_file("assets/img/clients/{$client['idClient']}.jpg")){ 
                        echo "
                            <img
                                src='assets/img/clients/{$client['idClient']}.jpg'
                                style='max-width:100px; max-heigth: 100px'
                        ";
                    }else{
                        echo 'Sem imagem';
                    }
                ?>
            </td>
            <td>
                <a href="?controller=client&action=updateClient&id=<?=$client['idClient']?>"  class="btn btn-warning">Alterar</a>
            </td>
            <td>
                <a href="?controller=client&action=deleteClient&id=<?=$client['idClient']?>" class="btn btn-danger">Excluir</a>
            </td>
            </tr>

    <?php
        }
    ?>
</table>