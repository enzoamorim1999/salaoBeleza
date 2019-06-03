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
@WebServlet(name = "editarServico", urlPatterns = {"/editarServico"})
public class editarServico extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         request.setAttribute("servicos", ServicoController.buscaPorId(Integer.parseInt(request.getParameter("id"))));
        
         RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/editarServico.jsp");
        dispatcher.forward(request, response);
        
        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Servico cliente = new Servico(request.getParameter("nome"),
                Integer.parseInt(request.getParameter("preco")));
        
        
        cliente.setId(Integer.parseInt(request.getParameter("id")));
        if (ServicoController.atualizar(cliente)) {
            response.sendRedirect(request.getContextPath() + "/listaServicos?editado=true");
        } else {
            //response.sendRedirect(request.getContextPath() + "/editarUsuario?editado=false");
            request.setAttribute("salvo", "false");
            response.sendRedirect(request.getContextPath() + "/editarServico?id=" + cliente.getId() + "&editado=false");
        }

    }

}
