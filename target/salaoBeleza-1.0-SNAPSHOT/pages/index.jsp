<%--
    Document   : cadastroServico
    Created on : 23/05/2019,13:00:15
    Author     : davi.msantos7
--%>
<!doctype html>
<html class="ls-theme-blue ls-window-lg ls-screen-lg ls-browser-chrome">
<head>
  <title>Home</title>
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
            <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaAgendamentos"%>">Agendamentos</a>
        </li>
        <li class="nav-item">
          <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaServicos" %>">Serviços</a>
        </li>
        <li class="nav-item">
          <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaClientes" %>">Clientes</a>
        </li>
      </ul>
    </div>
  </div>
  <nav class="navbar navbar-dark bg-dark">
    <button class="navbar-toggler justify-content-center" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
  </nav>
  </div>
  <main role="main">
  <div class="jumbotron">
    <div class="container">
      <h1 class="display-4">Bem vindo</h1>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="ls-box">
    <table class="ls-table">
      <div class="col-md-5 mb-3">
        <h1 class="ls-title-intro ">Agendamentos do Dia</h1>
      </div>
      <div>
      <form class="form-inline col-md-4 mb-3">
        <input type="text" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-dark" type="submit">Buscar</button>
      </form>
    </div>
  <thead>
    <tr>
      <th>Nome</th>
      <th class="hidden-xs">CPF</th>
      <th>Serviço</th>
      <th class="hidden-xs">Horário</th>
      <th> Valor</th>
      <th class="hidden-xs">Telefone</th>
      <th>Status</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Carla Santos</td>
      <td class="hidden-xs">12345678900</td>
      <td>Progressiva</td>
      <td class="hidden-xs">08:00</td>
      <td>R$ 130,00</td>
      <td class="hidden-xs">11 95151-5252</td>
      <td>Efetuado</td>
    </tr>
    <tr>
      <td>Giulia Valentina</td>
      <td class="hidden-xs">98765432100</td>
      <td>Chapinha</td>
      <td class="hidden-xs">15:00</td>
      <td>R$ 30,00</td>
      <td class="hidden-xs">12 95353-5454</td>
      <td>Cancelado</td
    </tr>
  </tbody>
</table>
      <div>
        <a href="<%= request.getContextPath() + "/novoAgendamento"%>" class="btn btn-dark">Novo Agendamento</a>
        </div>
    </div>
    </div>
    <hr>
  </div> <!-- /container -->
  </main>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
