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

}

?>