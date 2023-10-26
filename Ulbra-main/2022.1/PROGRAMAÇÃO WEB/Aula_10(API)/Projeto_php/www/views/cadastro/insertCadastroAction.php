<h1>Dados do cliente</h1>
<table class="table table-striped">
   
    <tr>
        <th>
            Nome:
        </th>
        <td>
            <?= $cadastro['name'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Login:
        </th>
        <td>
            <?= $cadastro['login'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Sexo:
        </th>
        <td>
            <?= $cadastro['sexo']?>
        </td> 
    </tr>

    <tr>
        <th>
            Opções:
        </th>
        <td>
            <?= $cadastro['op'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Comentarios:
        </th>
        <td>
            <?= $cadastro['story'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Valores:
        </th>
        <td>
            <?= $cadastro['select'] ?>
        </td> 
    </tr>

    <tr>
        <th>
            Cores:
        </th>
        <td>
            <?= $cadastro['list'] ?>
        </td> 
    </tr>
    
</table>