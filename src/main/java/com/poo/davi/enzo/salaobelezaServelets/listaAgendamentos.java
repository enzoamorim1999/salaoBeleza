/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobelezaServelets;

import com.poo.davi.enzo.salaobeleza.Controllers.AgendamentoController;
import com.poo.davi.enzo.salaobeleza.Controllers.UsuarioController;
import com.poo.davi.enzo.salaobeleza.Model.Agendamento;
import com.poo.davi.enzo.salaobeleza.Model.Cliente;
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
 * @author Davi Marques
 */
@WebServlet(name = "listaAgendamentos", urlPatterns = {"/listaAgendamentos"})
public class listaAgendamentos extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Agendamento> listaAgenda = AgendamentoController.listaAgenda();
       request.setAttribute("agenda", listaAgenda );
        
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/listaAgendamentos.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
