/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.DAO;

import com.poo.davi.enzo.salaobeleza.Connection.DbManager;
import com.poo.davi.enzo.salaobeleza.Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enzo Amorim
 */
public class UsuarioDAO {

    public static boolean salvar(Usuario usuario) {
        try {

            Connection conexao = DbManager.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO "
                    + "`usuarios`" + "("
                    + "`nome`,"
                    + "`cargo`,"
                    + "`login`,"
                    + "`senha`,"
                    + "`excluido`)"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    +"0");
            

            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getCargo());
            comando.setString(3, usuario.getLogin());
            comando.setString(4, usuario.getSenha());
            
            
            System.out.println(comando);

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
