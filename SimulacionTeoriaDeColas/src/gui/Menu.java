/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author megabit
 */
public class Menu extends JPanel {

    private JButton btnAceptar;
    private JButton btnCancelar;
    

    private JLabel lblTasaDellegada;
    private JLabel lblTasaDeServicio;

    private JTextField txtTasaDeLlegada;
    private JTextField txtTasaDeServicio;

    public Menu() {
        this.btnAceptar = new JButton("Aceptar");
        this.btnCancelar = new JButton("Cancelar");        
        this.lblTasaDellegada = new JLabel("Tasa de llegada: ");
        this.lblTasaDeServicio = new JLabel("Tasa de servicio: ");
        this.txtTasaDeLlegada = new JTextField(15);
        this.txtTasaDeServicio = new JTextField(15);

        //Matriz
        GridLayout gridLayout = new GridLayout(2, 3);
        gridLayout.setHgap(5);
        gridLayout.setVgap(5);
        this.setLayout(gridLayout);

        this.setBorder(new EmptyBorder(10, 30, 30, 30));

        super.add(lblTasaDellegada);
        super.add(lblTasaDeServicio);
        super.add(btnAceptar, BorderLayout.WEST);
        super.add(txtTasaDeLlegada);
        super.add(txtTasaDeServicio);
        super.add(btnCancelar, BorderLayout.EAST);

    }

}
