<?php

require_once("controllers/SiteController.php");
$site = new SiteController();

if(isset($_GET["page"])){

    if($_GET["page"]=="home"){
        $site -> home();
    }elseif($_GET["page"]=="about"){
        $site -> about();
    }elseif($_GET["page"]=="products"){
        $site -> products();
    }elseif($_GET["page"]=="contacts"){
        $site -> contacts();
    }   
}else{
    $site -> home();
}
?>         