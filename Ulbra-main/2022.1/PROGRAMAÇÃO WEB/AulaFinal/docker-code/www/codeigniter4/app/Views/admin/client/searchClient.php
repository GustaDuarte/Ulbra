<h1>Buscar Cliente</h1>
<form  method="POST" action="<?=base_url("admin/client/search-action")?>">
  <div class="row">
    <div class="col">
        <input type="text" class="form-control" placeholder="Busca..." name="pesquisa">
    </div>
    <div class="col">
        <button class="btn btn-success" href="">Pesquisar</button>
    </div>
  </div>
</form>