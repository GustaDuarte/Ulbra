<?php

class ClientController{

    var $ClientModel;

    function __construct(){
        if (!isset($_SESSION['user'])){
            header('Location: index.php?controller=main&action=login');
        }
        require_once('models/ClientModel.php');
        $this -> ClientModel = new ClientModel();
    }

    function listClients(){
        $result = $this -> ClientModel -> listClients();
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

        $result = $this -> ClientModel -> insertClient($client);
        header('Location: index.php?controller=client&action=listClients');
    }

    function updateClient($idClient){
        $result = $this -> ClientModel -> listClient($idClient);
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
        $this -> ClientModel -> updateClient($client);
       header('Location: index.php?controller=client&action=listClients');

    }

    function deleteClient($idClient){
        $this -> ClientModel -> deleteClient($idClient);
         header('Location: index.php?controller=client&action=listClients');
    }
}

?>