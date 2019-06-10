<%-- 
    Document   : cadastroCliente
    Created on : 23/05/2019, 23/05/2019
    Author     : davi.msantos7
--%>

<!doctype html>
<html class="ls-theme-blue ls-window-lg ls-screen-lg ls-browser-chrome">
<head>
  <title>Cadastrar Clientes</title>
  <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/checkout/">
  <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="form-validation.css" rel="stylesheet">
  <meta charset="UTF-8">
  <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no, shrink-to-fit=no">
  <link href="http://assets.locaweb.com.br/locastyle/3.10.1/stylesheets/locastyle.css" rel="stylesheet" type="text/css">
  <link rel="icon" sizes="192x192" href="/locawebstyle/assets/images/ico-boilerplate.png">
  <link rel="apple-touch-icon" href="/locawebstyle/assets/images/ico-boilerplate.png">
</head>
    <div class="pos-f-t">
  <div class="collapse" id="navbarToggleExternalContent">
    <div class="bg-dark p-4">
      <ul class="nav justify-content-center">
        <li class="nav-item">
            <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="agendamentosDoDia">Home</a>
        </li>
        <li class="nav-item">
          <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaAgendamentos"%>">Agendamentos</a>
        </li>
        <li class="nav-item">
          <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaServiÁos" %>">Servi√ßos</a>
        </li>
        <li class="nav-item">
          <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaClientes" %>">Clientes</a>
        </li>
    </div>
  </div>
  <nav class="navbar navbar-dark bg-dark">
    <button class="navbar-toggler justify-content-center" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
  </nav>
  </div>
<main>
    <div class="ls-box">
    <table class="ls-table">
<h1 class="ls-title-intro ">Cadastrar Clientes</h1>
<form method="POST">
      <div class="form-row">
        <div class="col-md-3 mb-3">
          <label for="validationServer01">Nome</label>
          <input type="text" class="form-control" name="nome" id="validationServer01" placeholder="Primeiro nome" required>
        </div>
        <div class="col-md-2 mb-3">
          <label for="validationServer02">CPF</label>
          <input type="text" class="form-control"  name="cpf" id="validationServer02" placeholder="00000000" required>
        </div>
        <div class="col-md-2 mb-3">
          <label for="validationServer02">Telefone</label>
          <input type="text" class="form-control" name="telefone" id="validationServer02" placeholder="00000000" required>
        </div>
      </div>
      
      <div class="form-row">
        <div class="col-md-3 mb-3">
          <label for="validationServer03">Cidade</label>
          <input type="text" class="form-control" name="cidade" id="validationServer03" placeholder="Sampa" required>
        </div>
        <div class="col-md-1 mb-3">
          <label for="validationServer03">Estado</label>
          <input type="text" class="form-control" name="estado" id="validationServer03" placeholder="Sampa" required>
        </div>
      </div>
      <div>
        <button class="btn btn-dark" type="submit">Criar Usuario</button>
        <a href="<%= request.getContextPath() + "/listaClientes"%>" class="btn btn-dark">Voltar</a>
      </div>
    </form>  
</div>
</div>

</div>
</main>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
