<?php

class CadastroController{

    function insertCadastro(){

        require_once('views/templates/header.php');
        require_once('views/cadastro/insertCadastro.php');
        require_once('views/templates/footer.php');
    }

    function insertCadastroAction(){

        $cadastro = array(

            'name' => $_POST['name'],
            'login' => $_POST['login'],
            'sexo' => $_POST['sexo'],
            'op' => $_POST['op'],
            'story' => $_POST['story'],
            'select' => $_POST['select'],
            'list' => $_POST['list']
        );

        require_once('views/templates/header.php');
        require_once('views/cadastro/insertCadastroAction.php');
        require_once('views/templates/footer.php');
    }
}

?>