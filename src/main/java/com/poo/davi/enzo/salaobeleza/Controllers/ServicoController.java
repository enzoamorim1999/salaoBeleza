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

}
