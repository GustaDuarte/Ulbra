<?php

namespace App\Models;

use CodeIgniter\Model;

class UserModel extends Model{

    protected $table = 'users';
    protected $primaryKey = 'idUser';

    public function listUser($idUser = null){
        if($idUser == null){
            return $this -> findAll();
        }else{
            return $this -> find($idUser);
        }
    }

    public function getUser($userName){
        return $this -> asArray() -> where('user', $userName) -> first();
    }

}
?>