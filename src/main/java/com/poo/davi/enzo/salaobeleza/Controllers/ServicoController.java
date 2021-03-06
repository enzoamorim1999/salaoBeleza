/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.Controllers;

import com.poo.davi.enzo.salaobeleza.DAO.ServicoDAO;
import com.poo.davi.enzo.salaobeleza.Model.Servico;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ServicoController {

    public static boolean salvar(Servico servico) {

        return ServicoDAO.salvar(servico);

    }

    public static ArrayList<Servico> listaServicos() {
        return ServicoDAO.listaServicos();
    }
    
    public static Servico buscaPorId(int id) {
       
        return ServicoDAO.buscaPorId(id);
        
    }
    
    public static boolean atualizar(Servico servico) {

        return ServicoDAO.atualizar(servico);

    }
    
    public static boolean excluir(int id) {

        return ServicoDAO.excluir(id);

    }

}
