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
@WebServlet(name = "cadastroUsuario", urlPatterns = {"/cadastroCliente"})
public class cadastroCliente extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/cadastroCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cliente cliente = new Cliente(request.getParameter("nome"),
                Integer.parseInt(request.getParameter("cpf")),
                Integer.parseInt(request.getParameter("telefone")),
                request.getParameter("cidade"),
                request.getParameter("estado"));
        
        
        
       if (UsuarioController.salvar(cliente)) {
            response.sendRedirect(request.getContextPath() + "/listaClientes?salvo=true");
        } else {
            request.setAttribute("salvo", "false");
            response.sendRedirect(request.getContextPath() + "/listaClientes?salvo=false");
        }
        
        
        
    }

}
