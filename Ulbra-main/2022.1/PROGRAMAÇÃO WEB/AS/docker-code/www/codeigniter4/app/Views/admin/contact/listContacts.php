<h1>Lista de Contatos</h1>

<table class="table">
    <tr>
        <th>IdContato</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Mensagem</th>
        <th>Status</th>
    </tr>

    <?php
        foreach($contacts as $contact){
    ?>
        
        <tr>
            <td><?=$contact['idContact']?>
            </td>
            <td><?=$contact['name']?>
            </td>
            <td><?=$contact['email']?>
            </td>
            <td><?=$contact['message']?>
            </td>
            <td>
                <?php
                if($contact['status'] == '0'){
                    echo '<span class="badge bg-warning">Aberto</span>';
                }else{
                    echo '<span class="badge bg-success">Fechado</span>';
                }
                ?>
            </td>
        <tr>

    <?php
   
        }
    ?>
</table>