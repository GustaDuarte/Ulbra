<?php

namespace App\Controllers;

class Site extends BaseController{

    public function index(){
        $this -> view();
    }

    public function view($page = 'home'){
        echo view('templates/header');
        echo view('pages/'.$page);
        echo view('templates/footer');
    }

}