/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.Controllers;

import com.poo.davi.enzo.salaobeleza.DAO.AgendamentoDAO;
import com.poo.davi.enzo.salaobeleza.Model.Agendamento;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class AgendamentoController {

    public static boolean salvar(Agendamento agenda) {

        return AgendamentoDAO.salvar(agenda);

    }

    public static ArrayList<Agendamento> listaAgenda() {
        return AgendamentoDAO.listaAgenda();
    }
    
    public static ArrayList<Agendamento> listaAgendaPorData(String data) {
        System.out.println("estou na lista DATA "+data);
        return AgendamentoDAO.listaAgendaPorData(data);
    }
    
    public static boolean excluir(int id) {

        return AgendamentoDAO.excluir(id);

    }


}
