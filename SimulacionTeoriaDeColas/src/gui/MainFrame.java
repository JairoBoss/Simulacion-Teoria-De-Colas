/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Sistema;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author megabit
 */
public class MainFrame extends JFrame {

    private Menu menu;
    private Sistema control;
    private DatosTableModel datos;
    private JTable tblDatos;

    public MainFrame() {
        super("Simulacion");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(1200, 300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        menu = new Menu();
        menu.setListener(new MenuListener() {
            @Override
            public void cancelar() {
                System.exit(0);
            }

            @Override
            public void aceptar(Integer x, Integer y) {
                control = new Sistema(x, y);
                datos = new DatosTableModel(control);
                tblDatos = new JTable(datos);
                datos.fireTableDataChanged();

                MainFrame.this.setSize(1201, 301);

                MainFrame.this.add(new JScrollPane(tblDatos), BorderLayout.CENTER);

            }
        });

        super.add(menu, BorderLayout.NORTH);
        super.setVisible(true);
    }
}
