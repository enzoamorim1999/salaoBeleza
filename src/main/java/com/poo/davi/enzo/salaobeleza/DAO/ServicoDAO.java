/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.DAO;

import com.poo.davi.enzo.salaobeleza.Connection.conectaBanco;
import com.poo.davi.enzo.salaobeleza.Model.Cliente;
import com.poo.davi.enzo.salaobeleza.Model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Casa
 */
public class ServicoDAO {

    public static boolean salvar(Servico servico) {
        try {

            Connection conexao = conectaBanco.conectaDB();

            PreparedStatement comando = conexao.prepareStatement("INSERT INTO "
                    + "`servicos`" + "("
                    + "`nome`,"
                    + "`preco`)"
                    + "VALUES ("
                    + "?,"
                    + "?)");

            comando.setString(1, servico.getNome());
            comando.setInt(2, servico.getPreco());

            System.out.println(comando);

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Servico> listaServicos() {
        ArrayList<Servico> listaServicos;

        listaServicos = new ArrayList<Servico>();
        try {

            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM servicos");

            ResultSet rs = comando.executeQuery();
            System.out.println(comando);

            while (rs.next()) {

                Servico serv = new Servico(rs.getString("nome"), rs.getInt("preco"));
                serv.setId(rs.getInt("id"));

                listaServicos.add(serv);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaServicos;
    }

    public static Servico buscaPorId(int id) {
        Servico serv = new Servico();
        try {
            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM servicos WHERE id=?");
            comando.setInt(1, id);

            ResultSet rs = comando.executeQuery();
            //System.out.println(comando);
            while (rs.next()) {

                serv = new Servico(rs.getString("nome"), rs.getInt("preco"));
                serv.setId(rs.getInt("id"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return serv;
    }
    
    public static boolean excluir(int id) {
        try {

            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("DELETE FROM servicos WHERE id = ?");

            comando.setInt(1, id);
            
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean atualizar(Servico servico) {
        try {

            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("UPDATE servicos SET"
                    + " nome = ?,"
                    + " preco = ?"
                    + " WHERE id = ?");

            comando.setString(1, servico.getNome());
            comando.setInt(2, servico.getPreco());
            comando.setInt(3, servico.getId());
            

            System.out.println("atualizar" + comando);
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
