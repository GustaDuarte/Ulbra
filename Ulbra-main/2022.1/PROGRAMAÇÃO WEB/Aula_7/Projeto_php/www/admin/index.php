<?php
    session_start();
    ini_set('display_errors', 1);
    ini_set('display_startup_errors', 1);
    error_reporting(E_ALL);

    if(!isset($_GET['controller'])){
        require_once('controllers/MainController.php');
        $MainController = new MainController();
        $MainController -> index();
    }else{
        switch($_REQUEST['controller']){
            case 'main':
                require_once('controllers/MainController.php');
                $MainController = new MainController();         
                if(!isset($_GET['action'])){
                   //setar uma ação base
                }else{
                    switch($_REQUEST['action']){
                        case 'index' :
                            $MainController -> index();
                        break;

                        case 'login':
                        $MainController -> login();
                        break;

                        case 'logout' :
                            $MainController -> logout();
                        break;
                    }
                }
            break;

            case 'user':
                require_once('controllers/UserController.php');
                $UserController = new UserController();
                if(!isset($_GET['action'])){
                    //setar uma ação base
                 }else{
                     switch($_REQUEST['action']){
                         case 'validatelogin':
                            $UserController -> ValidateLogin();
                         break;
                     }
                 }
            break;

            case 'client':
                require_once('controllers/ClientController.php');
                $ClientController = new ClientController();
                if(!isset($_GET['action'])){
                    $ClientController -> insertClient();
                }else{
                    switch($_REQUEST['action']){

                        case 'listClients':
                            $ClientController -> listClients();
                        break;

                        case 'insertClient':
                            $ClientController -> insertClient();
                        break;

                        case 'insertClientAction':
                            $ClientController -> insertClientAction();
                        break;

                        case 'updateClient':
                            if(isset($_GET['id'])){
                                $ClientController -> updateClient($_GET['id']);
                            }
                        break;
                        case 'updateClientAction':
                            if(isset($_GET['id'])){
                                $ClientController -> updateClientAction($_GET['id']);
                            }
                        break;

                        case 'deleteClient':
                            if(isset($_GET['id'])){
                                $ClientController -> deleteClient($_GET['id']);
                            }
                        break;
                    }
                }
            break;

        }
    }

?>      

