<?php
    ini_set('display_errors', 1);
    ini_set('display_startup_errors', 1);
    error_reporting(E_ALL);

    if(!isset($_GET['controller'])){
        require_once('controllers/SiteController.php');
        $site = new SiteController();
        $site -> home();
    }else{
        switch($_REQUEST['controller']){
            case 'site':
                require_once('controllers/SiteController.php');
                $site = new SiteController();
                if(!isset($_GET['action'])){
                    $site -> home();
                }else{
                    switch($_REQUEST['action']){
                        case 'home':
                            $site -> home();
                        break;
                        case 'about':
                            $site -> about();
                        break;
                        case 'products':
                            $site -> products();
                        break;
                    }
                }
            break;

            case 'contact':
                require_once('controllers/ContactController.php');
                $contact = new ContactController();
                if(!isset($_GET['action'])){
                    $contact -> insertContact();
                }else{
                    switch($_REQUEST['action']){
                        case 'insertContact':
                            $contact -> insertContact();
                        break;

                        case 'insertContactAction':
                            $contact -> insertContactAction();
                        break;
                    }
                }

            break;

            case 'client':
                require_once('controllers/ClientController.php');
                $client = new ClientController();
                if(!isset($_GET['action'])){
                    $client -> insertClient();
                }else{
                    switch($_REQUEST['action']){
                        case 'insertClient':
                            $client -> insertClient();
                        break;

                        case 'insertClientAction':
                            $client -> insertClientAction();
                        break;

                        case 'listClients':
                            $client -> listClients();
                        break;
                    }
                }
                
            break;

            case 'cadastro':
                require_once('controllers/CadastroController.php');
                $cadastro = new CadastroController();
                if(!isset($_GET['action'])){
                    $cadastro -> insertCadastro();
                }else{
                    switch($_REQUEST['action']){
                        case 'insertCadastro':
                            $cadastro -> insertCadastro();
                        break;

                        case 'insertCadastroAction':
                            $cadastro -> insertCadastroAction();
                    }
                }

            break;

        }
    }




?>      

