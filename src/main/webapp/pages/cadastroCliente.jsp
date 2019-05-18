<%-- 
    Document   : cadastroCliente
    Created on : 17/05/2019, 20:01:46
    Author     : DaviMarques
--%>

<!doctype html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Cadastrar Cliente</title>
  </head>
  <body>
    <div class="pos-f-t">
    <div class="collapse" id="navbarToggleExternalContent">
      <div class="bg-dark p-4">
        <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
          <li class="nav-item">
            <a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-home" role="tab" aria-controls="pills-home" aria-selected="true">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="pills-profile-tab" data-toggle="pill" href="#pills-profile" role="tab" aria-controls="pills-profile" aria-selected="false">Cadastrar Cliente</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact" role="tab" aria-controls="pills-contact" aria-selected="false">Agendar serviço</a>
          </li>
        </ul>
        <div class="tab-content" id="pills-tabContent">
          <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">...</div>
          <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">...</div>
          <div class="tab-pane fade" id="pills-contact" role="tabpanel" aria-labelledby="pills-contact-tab">...</div>
        </div>
      </div>
    </div>
    <nav class="navbar navbar-dark bg-dark">
      <button class="navbar-toggler justify-content-center" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </nav>
    </div>

<main>
  <div class="jumbotron">
    <div class="container">
      <h1 class="display-4">Cadastrar Cliente</h1>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <form>
      <div class="form-row">
        <div class="col-md-4 mb-3">
          <label for="validationServer01">Nome</label>
          <input type="text" class="form-control" id="validationServer01" placeholder="Primeiro nome" required>
          <div class="valid-feedback">
            Looks good!
          </div>
        </div>
        <div class="col-md-4 mb-3">
          <label for="validationServer02">Sobrenome</label>
          <input type="text" class="form-control" id="validationServer02" placeholder="Sobrenome" required>
          <div class="valid-feedback">
            Looks good!
          </div>
        </div>
        <div class="col-md-4 mb-3">
          <label for="validationServer02">Telefone</label>
          <input type="text" class="form-control" id="validationServer02" placeholder="00000000" required>
          <div class="valid-feedback">
            Looks good!
          </div>
        </div>
      </div>
      <div class="form-row">
        <div class="col-md-6 mb-3">
          <label for="validationServer03">Cidade</label>
          <input type="text" class="form-control" id="validationServer03" placeholder="Sampa" required>
          <div class="invalid-feedback">
            Please provide a valid city.
          </div>
        </div>
        <div class="col-md-3 mb-3">
          <label for="validationServer04">Estado</label>
          <input type="text" class="form-control" id="validationServer04" placeholder="SP" required>
          <div class="invalid-feedback">
            Please provide a valid state.
          </div>
        </div>
      </div>
      <button class="btn btn-primary" type="submit">Criar usuário</button>
      <button class="btn btn-primary" type="submit">Voltar</button>
    </form>
</div>
</div>
</main>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>