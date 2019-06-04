/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poo.davi.enzo.salaobeleza.DAO;

import com.poo.davi.enzo.salaobeleza.Connection.conectaBanco;
import com.poo.davi.enzo.salaobeleza.Model.Agendamento;
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
public class AgendamentoDAO {

    public static boolean salvar(Agendamento agenda) {
        try {

            Connection conexao = conectaBanco.conectaDB();

            PreparedStatement comando = conexao.prepareStatement("INSERT INTO "
                    + "agendamento" + "("
                    + "`nome`,"
                    + "`servico`,"
                    + "`horario`,"
                    + "`data` )"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?,"
                    + "?)");

            comando.setString(1, agenda.getNome());
            comando.setString(2, agenda.getServico());
            comando.setString(3, agenda.getHorario());
            comando.setString(4, agenda.getData());

            System.out.println(comando);

            int linhasAfetadas = comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static ArrayList<Agendamento> listaAgenda() {
        ArrayList<Agendamento> listaAgenda;

        listaAgenda = new ArrayList<Agendamento>();
        try {

            Connection conexao = conectaBanco.conectaDB();
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM agendamento");

            ResultSet rs = comando.executeQuery();
            System.out.println(comando);

            while (rs.next()) {

                Agendamento agenda = new Agendamento(rs.getString("nome"), rs.getString("servico"),
                        rs.getString("horario"), rs.getString("data"));
                agenda.setId(rs.getInt("id"));

                listaAgenda.add(agenda);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAgenda;
    }

}
