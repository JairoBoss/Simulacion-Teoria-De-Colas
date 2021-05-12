/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Conexion;
import controller.Sistema;
import gui.MainFrame;
import java.sql.SQLException;

/**
 *
 * @author megabit
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        //Sistema sist = new Sistema(20, 30);
//        sist.inicializar();
        new MainFrame();
        Conexion a = new Conexion();
        a.mostrarElementos();
    }
}
