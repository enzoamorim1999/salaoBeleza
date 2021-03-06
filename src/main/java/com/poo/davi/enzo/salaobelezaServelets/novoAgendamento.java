/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobelezaServelets;

import com.poo.davi.enzo.salaobeleza.Controllers.AgendamentoController;
import com.poo.davi.enzo.salaobeleza.Controllers.ServicoController;
import com.poo.davi.enzo.salaobeleza.Controllers.UsuarioController;
import com.poo.davi.enzo.salaobeleza.Model.Agendamento;
import com.poo.davi.enzo.salaobeleza.Model.Cliente;
import com.poo.davi.enzo.salaobeleza.Model.Servico;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Casa
 */
@WebServlet(name = "novoAgendamento", urlPatterns = {"/novoAgendamento"})
public class novoAgendamento extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/novoAgendamento.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("nomeCliente", UsuarioController.buscaPorCpf((request.getParameter("cpf"))));

        ArrayList<Servico> listaServico = ServicoController.listaServicos();
        request.setAttribute("servicos", listaServico);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/novoAgendamento.jsp");
        dispatcher.forward(request, response);

        Agendamento agenda = new Agendamento(request.getParameter("nome"),
                request.getParameter("servico"),
                request.getParameter("horario"),
                request.getParameter("data"));

        if (AgendamentoController.salvar(agenda) == true) {

            response.sendRedirect("pages/listaAgendamentos.jsp");
        }

    }

}
