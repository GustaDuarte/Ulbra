<?php

class UserController{

    var $UserModel;

    function __construct(){
        require_once('models/UserModel.php');
        $this -> UserModel = new UserModel();
    }

    function ValidateLogin(){
        $login = $_POST['login'];
        $password = $_POST['password'];
        $result = $this -> UserModel -> getUser($login);
        if ($user = $result -> fetch_assoc()) {
            if($user['password']==$password){
                $_SESSION['user'] = $user;
                header('Location:index.php?controller=main&action=index');
            }else{
                print("invalidate password!!!");
            }
        }else{
            print("User not existed!!!");
        }
    }
}

?>