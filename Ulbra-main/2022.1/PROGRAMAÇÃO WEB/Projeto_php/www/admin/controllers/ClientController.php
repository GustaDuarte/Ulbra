<?php

class ClientController{

    function __construct(){

        if (!isset($_SESSION['user'])){
            header('Location: index.php?controller=main&action=login');
        }
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
            'address' => $_POST['address']
        );

        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $result = $clientModel -> insertClient($client);

        header('Location: index.php?controller=clients&action=listClients');
    }

    function updateClient($idClient){
        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $result = $clientModel -> listClient($idClient);

        if($client = $result -> fetch_assoc()){
            require_once('views/templates/header.php');
            require_once('views/client/updateClient.php');
            require_once('views/templates/footer.php');

        }


    }

    function updateClientAction($idClient){
        $client = array(
            'idClient' => $idClient,
            'name' => $_POST['name'],
            'phone' => $_POST['phone'],
            'email' => $_POST['email'],
            'address' => $_POST['address']
        );

        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $clientModel -> updateClient($client);

       header('Location: index.php?controller=clients&action=listClients');

    }

    function deleteClient($idClient){
        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $clientModel -> deleteClient($idClient);

         header('Location: index.php?controller=clients&action=listClients');
    }
}

?>