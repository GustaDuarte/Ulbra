<?php

namespace App\Controllers\Admin;
use CodeIgniter\Controller;

class Admin extends Controller{

    public function index(){

        $session = \Config\Services::session();
        if($session -> has('user')){

            echo view('admin/templates/header');
            echo view('admin/main/home');
            echo view('admin/templates/footer');

        }else{
            return redirect()->to(base_url('admin/login'));
        }

    }

    public function login(){
        echo view('admin/main/login');
    }

    public function logout(){
        $session = \Config\Services::session();
        $session -> destroy();
        return redirect()->to(base_url('admin/login'));
    }

    public function home(){
        echo view('admin/templates/header');
        echo view('admin/main/home');
        echo view('admin/templates/footer');
    }

}

?>