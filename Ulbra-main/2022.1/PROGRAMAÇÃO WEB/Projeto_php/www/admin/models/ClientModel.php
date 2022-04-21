<?php

class ClientModel{

    function listClients(){

        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $conn = $connectClass -> getConn();
        $sql = 'SELECT * FROM clients';
        return $conn -> query($sql);
    }

    function insertClient($client){

        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $conn = $connectClass -> getConn();

        $sql = "
            INSERT INTO
            clients (name, phone, email, address)
            VALUES (
                '{$client['name']}', 
                '{$client['phone']}', 
                '{$client['email']}', 
                '{$client['address']}'
                )
        ";
        
        return $conn -> query($sql);

    }

}

?>