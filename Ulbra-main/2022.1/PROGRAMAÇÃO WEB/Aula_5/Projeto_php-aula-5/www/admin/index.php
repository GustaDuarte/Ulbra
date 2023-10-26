<?php
    session_start();
    ini_set('display_errors', 1);
    ini_set('display_startup_errors', 1);
    error_reporting(E_ALL);

    if(!isset($_GET['controller'])){
        require_once('controllers/MainController.php');
        $Main = new MainController();
        $Main -> index();
    }else{
        switch($_REQUEST['controller']){
            case 'main':
                require_once('controllers/MainController.php');
                $Main = new MainController();         
                if(!isset($_GET['action'])){
                   //setar uma ação base
                }else{
                    switch($_REQUEST['action']){
                        case 'index' :
                            $Main -> index();
                        break;

                        case 'login':
                        $Main -> login();
                        break;

                        case 'logout' :
                            $Main -> logout();
                        break;

                    }
                }
            break;

            case 'user':
                require_once('controllers/UserController.php');
                $User = new UserController();
                if(!isset($_GET['action'])){
                    //setar uma ação base
                 }else{
                     switch($_REQUEST['action']){
                         case 'validatelogin':
                            $User -> ValidateLogin();
                         break;
                     }
                 }
            break;

        }
    }

?>      

