/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobelezaServelets;

import com.poo.davi.enzo.salaobeleza.Controllers.UsuarioController;
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
 * @author Casa
 */
@WebServlet(name = "listaClientes", urlPatterns = {"/listaClientes"})
public class listaClientes extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Cliente> listaClientes = UsuarioController.listaUsuarios();
       request.setAttribute("clientes", listaClientes );
        
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/listaClientes.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
