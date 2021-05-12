/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author megabit
 */
public class Conexion {
    
    
    private java.sql.Connection connection;
    private java.sql.Statement st;
    private ResultSet rs;


    public Conexion() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "321");
            this.st = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void mostrarElementos() throws SQLException {
        try {
            rs = this.st.executeQuery("select * from simulacion");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        while (rs.next()) {
            System.out.println(String.format("noCamion %d, ", rs.getInt(1)));
        }
    }
}
