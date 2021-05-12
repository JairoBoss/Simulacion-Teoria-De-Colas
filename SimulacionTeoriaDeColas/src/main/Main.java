/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Sistema;
import gui.MainFrame;

/**
 *
 * @author megabit
 */
public class Main {
    public static void main(String[] args) {
        Sistema sist = new Sistema(20, 30);
//        sist.inicializar();
        new MainFrame();
    }
}
