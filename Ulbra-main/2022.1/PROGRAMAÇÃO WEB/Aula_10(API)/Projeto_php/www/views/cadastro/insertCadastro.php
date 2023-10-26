<h1>Inserindo cliente</h1>
<form class="form" action="?controller=cadastro&action=insertCadastroAction" method="post">

    <div class "mb-3 mt-3">
        <label for="name">Nome:</label>
        <input name="name" class="form-control" type="text">
    </div> <br>

    <div class "mb-3 mt-3">
        <label for="pass">Login: (Minímo 8 caracteres)</label>
        <input name="login" class="form-control" type="password" minlength="8" required>
    </div> <br>

    <div>
        Selecione o sexo: (Exemplo RADIO)
        <br>
        <label class="form-label" for="genero"></label>
        <input type="radio" id="MASCULINO" name="sexo" value="MASCULINO">
        <label for="MASCULINO">MASCULINO</label><br>
        <input type="radio" id="FEMININO" name="sexo" value="FEMININO">
        <label for="FEMININO">FEMININO</label><br>
    </div> <br>

    <div>
        Exemplo seleção checkbox:
        <br>
        <label class="form-label" for="options"></label>
        <input type="checkbox" id="Opção 1" name="op" value="Opção 1">
        <label for="Opção 1">Opção 1</label><br>
        <input type="checkbox" id="Opção 2" name="op" value="Opção 2">
        <label for="Opção 2">Opção 2</label><br>
        <input type="checkbox" id="Opção 3" name="op" value="Opção 3">
        <label for="Opção 3">Opção 3</label>
    </div><br>

  
        Exemplo Textarea
    <div>
        <textarea id="story" name="story"
            rows="5" cols="33">
        </textarea>
    </div> <br>

    <div>
        Exemplo select (drop-down list)
        <br>
        <!-- O primeiro valor estará selecionado inicialmente -->
        <select name="select">
        <option  value="Valor 1"selected>Valor 1</option>
        <option  value="Valor 2" >Valor 2</option>
        <option  value="Valor 3">Valor 3</option>
        </select>
    </div> <br>

    <div>
        Exemplo select visível (estendido) <br>
        <label for="list">Selecione uma cor:</label><br>
        <select name="list" multiple="multiple" style= "width:100px" required> 
            <option value="Azul">Azul</option> 
            <option value="Amarelo">Amarelo</option> 
            <option value="Verde">Verde</option> 
            <option value="Rosa">Rosa</option> 
            <option value="Branco">Branco</option> 
        </select>  
    </div> <br>

<input class="btn btn-primary" type="submit" value="Enviar">

</form>