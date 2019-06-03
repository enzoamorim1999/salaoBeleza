<%--
    Document   : listaAgendamentos
    Created on : 23/05/2019, 13:02:45
    Author     : DaviMarques
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.poo.davi.enzo.salaobeleza.Model.Cliente"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="ls-theme-blue ls-window-lg ls-screen-lg ls-browser-chrome">
    <head>
        <title>Novo Agendamento</title>
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
                        <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="index.html">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="listaAgendamentos.html">Agendamentos</a>
                    </li>
                    <li class="nav-item">
                        <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaServicos"%>">Servi�os</a>
                    </li>
                    <li class="nav-item">
                        <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaClientes"%>">Clientes</a>
                    </li>
                </ul>
            </div>
        </div>
        <nav class="navbar navbar-dark bg-dark">
            <button class="navbar-toggler justify-content-center" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div>
                <a href="cadastroCliente.html" class="btn btn-outline-secondary">Sair</a>
            </div>
        </nav>
    </div>
    <main>
        <div class="ls-box">
            <table class="ls-table">
                <%
                                    ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("clientes");
                %>
                <h1 class="ls-title-intro ">Agendamento</h1>

                
                <form method="post">
                    <div class="form-row">
                        <div class="col-md-3 mb-3">
                            <c:forEach items="${clientes}" var="clientes">
                                
                             <c:forEach>    
                            <label for="validationServer01">CPF</label>
                            <input type="number" class="form-control" value="${clientes.getCpf()}" name="cpf" id="validationServer01" placeholder="Apenas números" required>
                           
                            </div>
                            
                           
                        <div>
                            <form class="form-inline">
                                <button class="btn btn-outline-dark btn btn-outline-success my-sm-3"  type="submit">Buscar</button>
                            </form>
                        </div>
                    </div>
                    <div class="form-row">
                        
                        <div class="col-md-3 mb-3">
                            <label for="validationServer03">Nome</label>
                            <input type="text" class="form-control" id="validationServer03" placeholder="Sampa" required>
                            <div class="invalid-feedback">
                                Please provide a valid city.
                            </div>
                        </div>
                        <div class="col-md-3 mb-3">
                            <label for="validationServer03">Telefone</label>
                            <input type="text" class="form-control" id="validationServer03" placeholder="Sampa" required>
                            <div class="invalid-feedback">
                                Please provide a valid city.
                            </div>
                        </div>

                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-3 mb-3">
                            <label for="exampleFormControlSelect1">Serviço</label>
                            <select class="form-control" id="exampleFormControlSelect1">
                                <option>Batata</option>
                                <option>Atum</option>
                                <option>Olele</option>
                                <option>Olala</option>
                                <option>Heyyy</option>
                            </select>
                        </div>
                        <div class="form-group col-md-3 mb-3">
                            <label for="exampleFormControlSelect1">Data</label>
                            <select class="form-control" id="exampleFormControlSelect1">
                                <option>Batata</option>
                                <option>Atum</option>
                                <option>Olele</option>
                                <option>Olala</option>
                                <option>Heyyy</option>
                            </select>
                        </div>
                    </div>

                    <div>
                        <button class="btn btn-dark" type="submit">Agendar</button>
                        <a href="cadastroCliente.html" class="btn btn-dark">Novo Usuário</a>
                        <a href="index.html" class="btn btn-dark">Voltar</a>
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
