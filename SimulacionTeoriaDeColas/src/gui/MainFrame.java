/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author megabit
 */
public class MainFrame extends JFrame {
    private Menu menu;
    
    public MainFrame() {
        super("Simulacion");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(1200, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        
        menu = new Menu();
        super.add(menu, BorderLayout.NORTH);
        super.setVisible(true);
    }
}
