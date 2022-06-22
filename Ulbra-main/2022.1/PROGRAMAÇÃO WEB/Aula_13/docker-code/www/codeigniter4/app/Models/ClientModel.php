<?php

namespace App\Models;

use CodeIgniter\Model;

class ClientModel extends Model{

    protected $table = 'clients';
    protected $primaryKey = 'idClient';
    protected $allowedFields = [
        'name', 'phone', 'email', 'address'
    ];

    public function listClients($idClient = null){
        if($idClient == null){
            return $this -> findAll();
        }else{
            return $this -> find($idClient);
        }
        
    }

}