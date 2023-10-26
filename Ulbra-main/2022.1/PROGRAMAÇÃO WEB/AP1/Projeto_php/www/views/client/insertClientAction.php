<h1>Dados do cliente</h1>
<table class="table table-striped">
   
    <tr>
        <th>
            Nome:
        </th>
        <td>
            <?= $client['name'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Email:
        </th>
        <td>
            <?= $client['email'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Telefone:
        </th>
        <td>
            <?= $client['phone'] ?>
        </td> 
    </tr>
    
    <tr>
        <th>
            Endereço:
        </th>
        <td>
            <?= $client['adress'] ?>
        </td> 
    </tr>
    
</table>