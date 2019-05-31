package com.poo.davi.enzo.salaobeleza.Connection;

/**
 * @author EnzoAmorim
 */


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conectaBanco {

    private static String url = "";
    private static String SERVIDOR = "localhost";
    private static String BASEDADOS = "salaoservico";
    private static java.sql.Connection conexao;
    private static String bduser = "root";
    private static String bdpass = "";

    public static java.sql.Connection conectaDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://" + SERVIDOR + ":3306/" + BASEDADOS + "?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url, bduser, bdpass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexao;
    }
}
