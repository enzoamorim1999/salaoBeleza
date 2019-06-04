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
@WebServlet(name = "editarCliente", urlPatterns = {"/editarCliente"})
public class editarCliente extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("cliente", UsuarioController.buscaPorId(Integer.parseInt(request.getParameter("id"))));
        System.out.println("olá COCO" + UsuarioController.buscaPorId(Integer.parseInt(request.getParameter("id"))));
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/editarCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cliente cliente = new Cliente(request.getParameter("nome"),
               (request.getParameter("cpf")),
                Integer.parseInt(request.getParameter("telefone")),
                request.getParameter("cidade"),
                request.getParameter("estado"));
        
        
        cliente.setId(Integer.parseInt(request.getParameter("id")));
        if (UsuarioController.atualizar(cliente)) {
            response.sendRedirect(request.getContextPath() + "/listaClientes?editado=true");
        } else {
            //response.sendRedirect(request.getContextPath() + "/editarUsuario?editado=false");
            request.setAttribute("salvo", "false");
            response.sendRedirect(request.getContextPath() + "/editarUsuario?id=" + cliente.getId() + "&editado=false");
        }
        

    }

}
