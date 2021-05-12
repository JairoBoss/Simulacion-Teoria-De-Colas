/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Sistema;
import javax.swing.table.AbstractTableModel;
import model.Camion;

/**
 *
 * @author megabit
 */
public class DatosTableModel extends AbstractTableModel {

    private Sistema oControl;

    public DatosTableModel(Sistema a) {
        oControl = a;
    }

    @Override
    public int getRowCount() {
        return oControl.tamaño();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }
//,,,,);

    @Override
    public Object getValueAt(int i, int i1) {
        Camion aux = oControl.getCamion(i);

        switch (i1) {
            case 0:
                return aux.getNoCamion();
            case 1:
                return aux.getAleatorio();
            case 2:
                return aux.getTiempoEntreLlegada();
            case 3:
                return aux.getTiempoDeLlegada();
            case 4:
                return aux.getTiempoDeinicioServicio();
            case 5:
                return aux.getTiempoDeEspera();
            case 6:
                return aux.getTiempoDeServicio();
            case 7:
                return aux.getTiempoDeTerminacionServicio();
            case 8:
                return aux.getTiempoEnElSistema();
            case 9:
                return aux.getTiempoOcio();

            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No camion";
            case 1:
                return "No aleatorio";
            case 2:
                return "Tiempo entre llegada";
            case 3:
                return "Tiempo de llegada";
            case 4:
                return "Tiempo de inicio servicio";
            case 5:
                return "Tiempo de espera";
            case 6:
                return "Tiempo de servicio";
            case 7:
                return "Tiempo de finalizacion de servicio";
            case 8:
                return "Tiempo en el sistema";
            case 9:
                return "Tiempo de ocio";
            default:
                throw new AssertionError();
        }
    }

}
