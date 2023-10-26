<?php

class UserController{

    function ValidateLogin(){
        
        $login = $_POST['login'];
        $password = $_POST['password'];

        require_once('models/UserModel.php');
        $UserModel = new UserModel();
        $result = $UserModel -> getUser($login);

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