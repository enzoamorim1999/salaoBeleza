/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobelezaServelets;

import com.poo.davi.enzo.salaobeleza.Controllers.ServicoController;
import com.poo.davi.enzo.salaobeleza.Model.Servico;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "cadastroServico", urlPatterns = {"/cadastroServico"})
public class cadastroServico extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/cadastroServico.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Servico serv = new Servico(request.getParameter("nome"),
                Integer.parseInt(request.getParameter("preco")));
        
        
        
       if (ServicoController.salvar(serv)) {
            response.sendRedirect(request.getContextPath() + "/cadastroServico?salvo=true");
        } else {
            request.setAttribute("salvo", "false");
            response.sendRedirect(request.getContextPath() + "/cadastroServico?salvo=false");
        }

    }

}
