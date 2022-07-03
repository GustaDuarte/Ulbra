<h1>Inserindo Cliente</h1>
<form class="form" action="<?=base_url('/contactAction')?>" method="get">
    <div class="mb-3 mt-3">
        <label name="name" class="form-label">Nome</label>
        <input class="form-control" type="text">
    </div>
    <div class="mb-3 mt-3">
        <label name="email" class="form-label">Email</label>
        <input class="form-control" type="text">
    </div>
    <div class="mb-3 mt-3">
        <label name="message" class="form-label">Mensagem</label>
        <input class="form-control" type="text">
    </div>
 <input class="btn btn-primary" type="submit" value="Enviar">
</form>