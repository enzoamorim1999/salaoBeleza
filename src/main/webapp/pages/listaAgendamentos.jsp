<%--
    Document   : listaAgendamentos
    Created on : 23/05/2019, 13:02:45
    Author     : DaviMarques
--%>
<%@page import="com.poo.davi.enzo.salaobeleza.Model.Agendamento"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="ls-theme-blue ls-window-lg ls-screen-lg ls-browser-chrome">
    <head>
        <title>Lista de Agendamentos</title>
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
        <script>
            function confirme(id) {
                var txt;
                var r = confirm("Deseja realmente excluir o agendamento ?");
                if (r == true) {
                    console.log(id);
                    window.location.href = window.location.origin + "/salaoBeleza/excluirAgendamento?id=" + id;
                }
            }
        </script>
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
                        <a class="navbar-brand"  aria-haspopup="true" aria-expanded="false" href="<%= request.getContextPath() + "/listaServicos"%>">Serviços</a>
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
        </nav>
    </div>
    <div class="ls-box">
        <table class="ls-table">
            <h1 class="ls-title-intro ">Lista de Agendamentos</h1>
            
            <c:if test="${param.salvo == 'true'}">
                <div class="ls-alert-success"><strong>Agendamento feito com sucesso !</strong></div>
            </c:if>
            
            
            <thead>

                <%
                    ArrayList<Agendamento> agenda = (ArrayList<Agendamento>) request.getAttribute("agenda");
                %>
                <tr>

                    <th class="hidden-xs">Nome</th>
                    <th>Serviço</th>
                    <th class="hidden-xs">Data</th>
                    <th> Horario</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${agenda}" var="agenda">
                    <tr>

                        <th class="hidden-xs">${agenda.getNome()}</th>
                        <th>${agenda.getServico()}</th>
                        <th>${agenda.getData()}</th>
                        <th>${agenda.getHorario()}</th>
                        <td>

                            <div>

                                <a href="" onclick="confirme(${agenda.getId()})" class="btn btn-danger btn active" role="button" aria-pressed="true">Excluir</a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
                <tr>


                    </td>
                </tr>
            </tbody>
        </table>

        <div>
            <a href="<%= request.getContextPath() + "/novoAgendamento"%>" class="btn btn-dark">Novo Agendamento</a>
            <a href="<%= request.getContextPath() + "/listaAgendamentos"%>" class="btn btn-dark">Voltar</a>
        </div>

    </div>



    <script type="text/javascript" src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="http://assets.locaweb.com.br/locastyle/3.10.1/javascripts/locastyle.js" type="text/javascript"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
