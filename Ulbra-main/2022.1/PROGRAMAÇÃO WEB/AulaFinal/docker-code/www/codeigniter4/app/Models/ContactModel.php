<?php

namespace App\Models;

use CodeIgniter\Model;

class ContactModel extends Model{

    protected $table = 'contacts';
    protected $primaryKey = 'idContact';
    protected $allowedFields = [
        'name', 'email', 'message', 'status'
    ];

}