<?php

namespace App\Controllers;

use App\Models\ContactModel;
use CodeIgniter\Controller;

class Contact extends Controller{

    public function sendContact(){
        echo view('templates/header');
        echo view('contact/sendContact');
        echo view('templates/footer');
    }

    public function sendContactAction(){
        $contactModel = new ContactModel();
        $data = [
            'name' => $this -> request ->getVar('name'),
            'email' => $this -> request ->getVar('email'),
            'message' => $this -> request ->getVar('message'),
            'status' => '0'
        ];
        $contactModel -> insert($data);
        return redirect()->to('/contact');
    }


}