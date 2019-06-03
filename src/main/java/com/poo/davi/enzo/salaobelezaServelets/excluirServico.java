/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobelezaServelets;

import com.poo.davi.enzo.salaobeleza.Controllers.ServicoController;
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
@WebServlet(name = "excluirServico", urlPatterns = {"/excluirServico"})
public class excluirServico extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         request.setAttribute("excluido", ServicoController.excluir(Integer.parseInt(request.getParameter("id"))));
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/listaServicos");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
