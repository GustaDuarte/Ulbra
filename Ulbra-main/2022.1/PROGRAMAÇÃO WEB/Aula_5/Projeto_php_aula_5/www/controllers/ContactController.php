<?php

class ContactController{

    function insertContact(){

        require_once('views/templates/header.php');
        require_once('views/contact/insertContact.php');
        require_once('views/templates/footer.php');
        
    }

    function insertContactAction(){

        $contact = array(

            'telefone' => $_POST['telefone'],

        );

        require_once('views/templates/header.php');
        require_once('views/contact/insertContactAction.php');
        require_once('views/templates/footer.php');
    }

}

?>