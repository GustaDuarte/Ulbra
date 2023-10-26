<?php

class ContactController{

    var $ContactModel;

    function __construct(){
        require_once('models/ContactModel.php');
        $this -> ContactModel = new ContactModel();
    }

    function insertContact(){

        $contact = json_decode(file_get_contents('php://input'));

        $arrayContact = array(
            'name' => $contact -> name,
            'email' => $contact -> email,
            'message' => $contact -> message
        );
        $idContact = $this -> ContactModel -> insertContact($arrayContact);
        header('Content-Type: application/json');
        echo('{"message": "contato cadastrado com sucesso!"}');
    }

    function listContacts(){
        $result = $this -> ContactModel -> listContacts();
        $arrayContacts = array();
        while($line = $result -> fetch_assoc()){
            array_push($arrayContacts, $line);
        }
        header('Content-Type: application/json');
        echo json_encode($arrayContacts);

    } 

     function listContact($idContact){
        $result = $this -> ContactModel -> listContact($idContact);
        if($contact = $result->fetch_assoc()){
            header('Content-Type: application/json');
            echo json_encode($contact);
        }else{
            header('Content-Type: application/json');
            echo('{"error": 01 ,"message": "contato não encontrado"}');
        }
    }  


   /*  function updateClient($idClient){

        $client = json_decode(file_get_contents('php://input'));

        $arrayClient = array(
            'idClient' => $idClient,
            'name' => $client -> name,
            'phone' => $client -> phone,
            'email' => $client -> email,
            'address' => $client -> address
        );

        $this -> ClientModel -> updateClient($arrayClient);

    } */

  /*   function deleteClient($idClient){
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
    } */

}

?>