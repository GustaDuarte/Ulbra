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

    <link rel="stylesheet" href=<?=base_url("assets\css\style.css")?>>
    <script src="assets/js/script.js"></script>

    <!-- FONTE RETIRADA DO GOOGLE FONTS E ENSINADO POR ARTHUR-->
    <link href="https://fonts.googleapis.com/css2?family=Smooch+Sans&display=swap" rel="stylesheet">

</head>
<body class="bg-light text-dark">
    
    <header class="p-5 rounded text-center bg-dark text-white">
    <h1>Header</h1>
    </header>

    <section class="row">
        <nav class="col-md-4">

                <h3>Nav</h3>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Itaque, natus!</p>
            <ul class="nav flex-column">
                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('home');?>">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('about');?>">Sobre</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('products');?>">Produtos</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('insertContact');?>">Contato</a>
                </li>

                    <h3>Clientes</h3>
                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('insertClient');?>">Clients</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('insertCadastro');?>">Cadastro</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="<?=base_url('listClients');?>">Listar Clientes</a>
                </li>
            </ul>

        </nav>
        <article class="col-md-8">