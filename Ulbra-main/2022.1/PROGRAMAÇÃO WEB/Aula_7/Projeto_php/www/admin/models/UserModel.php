<?php
class UserModel{

    var $Connection;

    function __construct(){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $this -> Connection = $ConnectClass -> getConn();
    }

    function getUser($login){
        $sql = "
            SELECT * FROM users
            WHERE user='{$login}'
        ";

        return $this -> Connection -> query($sql);
    }
}
?>