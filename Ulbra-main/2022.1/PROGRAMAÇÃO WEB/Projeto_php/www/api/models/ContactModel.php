<?php
class ContactModel{

    var $Connection;

    function __construct(){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $this -> Connection = $ConnectClass -> getConn();
    }

    function insertContact($contact){
        $sql = "
            INSERT INTO
            contacts (name, email, message)
            VALUES (
                '{$contact['name']}', 
                '{$contact['email']}', 
                '{$contact['message']}' 
                )
        ";
        $this -> Connection -> query($sql);
        return $this -> Connection -> insert_id;
    }

    function listContacts(){
        $sql = 'SELECT * FROM contacts';
        return $this -> Connection -> query($sql);
    } 

    function listContact($idContact){
        $sql = "SELECT * FROM contacts where idContact={$idContact}";
        return $this -> Connection -> query($sql);
    } 

    /* function updateClient($client){
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
        $this -> Connection -> query($sql);
        return  $this -> Connection -> insert_id;
    } */

    /* function deleteClient($idClient){
        $sql = "
            DELETE FROM 
                clients
            WHERE
                idClient={$idClient}
            ";
            return $this -> Connection -> query($sql);
    } */
}
?>