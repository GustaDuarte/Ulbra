<?php

class SiteController{

    function home(){
        require_once("views/templates/header.php");
        require_once("views/pages/home.php");
        require_once("views/templates/footer.php");
    }

    function about(){
        require_once("views/templates/header.php");
        require_once("views/pages/about.php");
        require_once("views/templates/footer.php");
    }

    function products(){
        require_once("views/templates/header.php");
        require_once("views/pages/products.php");
        require_once("views/templates/footer.php");
    }

    function contacts(){
        require_once("views/templates/header.php");
        require_once("views/pages/contacts.php");
        require_once("views/templates/footer.php");
    }
}

?>