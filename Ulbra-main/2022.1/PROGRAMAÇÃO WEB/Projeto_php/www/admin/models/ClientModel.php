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

    function listClient($idClient){

        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $conn = $connectClass -> getConn();
        $sql = "SELECT * FROM clients where idClient={$idClient}";
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

    function updateClient($client){
        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $conn = $connectClass -> getConn();

        $sql = "
            UPDATE
                clients
            SET 
                name='{$client['name']}',
                email='{$client['email']}',
                phone='{$client['phone']}',
                address='{$client['address']}'
            WHERE
                idClient = {$client['idClient']}
        ";


        return $conn -> query($sql);
    }

    function deleteClient($idClient){
        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $conn = $connectClass -> getConn();

        $sql = "
            DELETE FROM 
                clients
            WHERE
                idClient={$idClient}
            ";
            return $conn -> query($sql);
        
    }

}

?>