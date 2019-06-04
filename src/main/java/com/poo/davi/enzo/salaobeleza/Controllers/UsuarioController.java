/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.Controllers;

import com.poo.davi.enzo.salaobeleza.DAO.UsuarioDAO;
import com.poo.davi.enzo.salaobeleza.Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class UsuarioController {

    public static boolean salvar(Cliente usuario) {

        return UsuarioDAO.salvar(usuario);

    }

    public static ArrayList<Cliente> listaUsuarios() {
        return UsuarioDAO.listaUsuarios();
    }

    public static boolean atualizar(Cliente cliente) {

        return UsuarioDAO.atualizar(cliente);

    }
    
    public static Cliente buscaPorId(int id) {
       
        return UsuarioDAO.buscaPorId(id);
        
    }
    
    public static boolean excluir(int id) {

        return UsuarioDAO.excluir(id);

    }
    
    public static Cliente buscaPorCpf(String cpf) {
       
        System.out.println("estou na controller" +cpf);
        
        return UsuarioDAO.buscaPorCpf(cpf);
        
    }

    

}
