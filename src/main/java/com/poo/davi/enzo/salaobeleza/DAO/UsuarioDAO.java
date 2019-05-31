/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.DAO;

import com.poo.davi.enzo.salaobeleza.Connection.conectaBanco;
import com.poo.davi.enzo.salaobeleza.Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enzo Amorim
 */
public class UsuarioDAO {

    public static boolean salvar(Cliente usuario) {
        try {

            Connection conexao = conectaBanco.conectaDB();

            PreparedStatement comando = conexao.prepareStatement("INSERT INTO "
                    + "`usuarios`" + "("
                    + "`nome`,"
                    + "`cpf`,"
                    + "`telefone`,"
                    + "`cidade`,"
                    + "`estado`)"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?)");

            comando.setString(1, usuario.getNome());
            comando.setInt(2, usuario.getCpf());
            comando.setInt(3, usuario.getTelefone());
            comando.setString(4, usuario.getCidade());
            comando.setString(5, usuario.getEstado());

            System.out.println(comando);

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Cliente> listaUsuarios() {
        ArrayList<Cliente> listaUsuarios;

        listaUsuarios = new ArrayList<Cliente>();
        try {

            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM usuarios");

            ResultSet rs = comando.executeQuery();
            System.out.println(comando);

            while (rs.next()) {

                Cliente cli = new Cliente(rs.getString("nome"), rs.getInt("cpf"),
                        rs.getInt("telefone"), rs.getString("cidade"), rs.getString("estado"));
                cli.setId(rs.getInt("id"));

                listaUsuarios.add(cli);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    }

    public static boolean atualizar(Cliente cliente) {
        try {

            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("UPDATE usuarios SET"
                    + " nome = ?,"
                    + " cpf = ?,"
                    + " telefone = ?,"
                    + " cidade = ?,"
                    + " estado = ?"
                    + " WHERE id = ?");

            comando.setString(1, cliente.getNome());
            comando.setInt(2, cliente.getCpf());
            comando.setInt(3, cliente.getTelefone());
            comando.setString(4, cliente.getCidade());
            comando.setString(5, cliente.getEstado());
            comando.setInt(6, cliente.getId());

            System.out.println("atualizar"+ comando);
            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static Cliente buscaPorId(int id) {
        Cliente cli = new Cliente();
        try {
            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM usuarios WHERE id=?");
            comando.setInt(1, id);

            ResultSet rs = comando.executeQuery();
            //System.out.println(comando);
            while (rs.next()) {

                cli = new Cliente(rs.getString("nome"), rs.getInt("cpf"), rs.getInt("telefone"),
                        rs.getString("cidade"), rs.getString("estado"));
                cli.setId(rs.getInt("id"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cli;
    }

}
