<?php

namespace App\Controllers;

use App\Models\ClientModel;
use CodeIgniter\Controller;

class Client extends Controller{

    public function listClients(){
        $clientModel = new ClientModel();
        $data = [
        'title' => 'Meu site PHP...',
        'clients' => $clientModel -> listClients()
        ];

        echo view('templates/header');
        echo view('client/listClients', $data);
        echo view('templates/footer');
        
    }

    public function listClientsApi(){
        $clientModel = new ClientModel();
        $data = [
        'clients' => $clientModel -> listClients()
        ];
        echo view('templates/header');
        header('Content-Type: application/json');
        echo json_encode($data);
        echo view('templates/footer');
        
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

}