<?php
namespace App\Controllers\Admin;

use CodeIgniter\Controller;
use App\Models\ClientModel;

class Client extends Controller{
    
    public function listClients(){
        $clientModel = new ClientModel();
        $data = [
            'client' => $clientModel -> listClients()
        ];

        echo view('admin/templates/header');
        echo view('admin/client/listClients', $data);
        echo view('admin/templates/footer');
    }

    public function detailsClient($idClient){
        $clientModel = new ClientModel();
        $data = [
            'client' => $clientModel -> listClients($idClient)
        ];

        echo view('templates/header');
        echo view('client/detailsClient', $data);
        echo view('templates/footer');
    }

    public function insertClient(){

        echo view('admin/templates/header');
        echo view('admin/client/insertClient', $data);
        echo view('admin/templates/footer');
    }

    public function insertClientAction(){
        
        $clientModel = new ClientModel();
        $data = [
            'name' => $this -> request -> getVar('name'),
            'email' => $this -> request -> getVar('email'),
            'phone' => $this -> request -> getVar('phone'),
            'address' => $this -> request -> getVar('address')
        ];
        $clientModel -> insert($data);
        return redirect()->to('admin/listClients');
    }
}

?>