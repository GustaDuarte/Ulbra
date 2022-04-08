<?php

class ClientController{

    function insertClient(){

        require_once('views/templates/header.php');
        require_once('views/client/insertClient.php');
        require_once('views/templates/footer.php');
    }

    function insertClientAction(){

        $client = array(

            'name' => $_POST['name'],
            'phone' => $_POST['phone'],
            'email' => $_POST['email'],
            'adress' => $_POST['adress']
        );

        require_once('views/templates/header.php');
        require_once('views/client/insertClientAction.php');
        require_once('views/templates/footer.php');
    }

    function listClients(){

        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $result = $clientModel -> listClients();

        $arrayClients = array();
        while($line = $result -> fetch_assoc()){
            array_push($arrayClients, $line);
        }

        require_once('views/templates/header.php');
        require_once('views/client/listClients.php');
        require_once('views/templates/footer.php');

    }
}

?>