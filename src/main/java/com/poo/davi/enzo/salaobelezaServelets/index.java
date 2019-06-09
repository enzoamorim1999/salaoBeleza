/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.poo.davi.enzo.salaobeleza.Controllers.AgendamentoController;
import com.poo.davi.enzo.salaobeleza.Model.Agendamento;
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
@WebServlet(urlPatterns = {"/index"})
public class index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         ArrayList<Agendamento> listaAgendaPorData = AgendamentoController.listaAgendaPorData(request.getParameter("data"));
        request.setAttribute("agenda", listaAgendaPorData);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Agendamento> listaAgendaPorData = AgendamentoController.listaAgendaPorData(request.getParameter("data"));
        request.setAttribute("agenda", listaAgendaPorData);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);

    }

}
