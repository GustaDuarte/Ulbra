<?php
namespace App\Controllers\Admin;

use CodeIgniter\Controller;
use App\Models\UserModel;

class User extends Controller{

    public function validateLogin(){
        $userName = $this -> request -> getVar('userName');
        $userPassword = $this -> request -> getVar('userPassword');

        $userModel = new UserModel();

        if($user = $userModel -> getUser($userName)){
            if($user['password'] == $userPassword){
                $session = \Config\Services::session();
                $session -> set('user', $user);
                return redirect()->to(base_url('admin'));
            }
        }

    }

}

?>