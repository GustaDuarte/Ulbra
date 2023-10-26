<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page PHP</title>

    <!-- Latest compiled and minified Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script src="assets/js/script.js"></script>

</head>
<body class="bg-light text-dark">
    
    <header class="p-5 rounded text-center bg-secondary text-white">
    <h1>Minha Área Administrativa</h1>
    <p>Exemplo de estrutura admin...</p>
    <a href="<?=base_url('admin/logout')?>">Logout</a>
    </header>

    <section class="row">
        <nav class="col-md-4">

                <h3>Menu</h3>
            <ul class="nav flex-column">
                <li class="nav-item">
                    <a id="home" class="nav-link" href="">Home</a>
                </li>
                <h3>Clientes</h3>
                <li class="nav-item">
                    <a id="list" class="nav-link" href="<?=base_url('admin/client/listClients')?>">Lista Clientes</a>
                </li>
                <li class="nav-item">
                    <a id="insert" class="nav-link" href="<?=base_url('admin/client/insertClient')?>"> -> Novo Clientes</a>
                </li>
        </nav>
        <article class="col-md-8">