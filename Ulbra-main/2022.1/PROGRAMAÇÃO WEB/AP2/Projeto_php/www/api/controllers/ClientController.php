<?php

class ClientController{

    var $ClientModel;

    function __construct(){
        require_once('models/ClientModel.php');
        $this -> ClientModel = new ClientModel();
    }

    function listClients(){
        $result = $this -> ClientModel -> listClients();
        $arrayClients = array();
        while($line = $result -> fetch_assoc()){
            array_push($arrayClients, $line);
        }
        header('Content-Type: application/json');
        echo json_encode($arrayClients);

    }

    function listClient($idClient){
        $result = $this -> ClientModel -> listClient($idClient);
        if($client = $result->fetch_assoc()){
            header('Content-Type: application/json');
            echo json_encode($client);
        }else{
            header('Content-Type: application/json');
            echo('{"error": 01 ,"message": "cliente não encontrado"}');
        }
    }

    function insertClient(){

        $client = json_decode(file_get_contents('php://input'));

        $arrayClient = array(
            'name' => $client -> name,
            'phone' => $client -> phone,
            'email' => $client -> email,
            'address' => $client -> address
        );
        $idClient = $this -> ClientModel -> insertClient($arrayClient);
        header('Content-Type: application/json');
        echo('{"cod": 01 ,"message": "cliente foi cadastrado"}');
    }

    function updateClient($idClient){

        $client = json_decode(file_get_contents('php://input'));

        $arrayClient = array(
            'idClient' => $idClient,
            'name' => $client -> name,
            'phone' => $client -> phone,
            'email' => $client -> email,
            'address' => $client -> address
        );

        $this -> ClientModel -> updateClient($arrayClient);

    }

    function deleteClient($idClient){
        $this -> ClientModel -> deleteClient($idClient);
    }

    function insetContact(){
        //inserir contatos pelo metodo post
        $contact = json_decode(file_get_contents('php://input'));

        $arrayContact = array(
            'name' => $contact -> name,
            'email' => $contact -> email,
            'message' => $contact -> message
        );
        $idContact = $this -> ClientModel -> insertContact($arrayContact);
        header('Content-Type: application/json');
        echo('{"message": "contato cadastrado com sucesso!"}');
    }

}

?>