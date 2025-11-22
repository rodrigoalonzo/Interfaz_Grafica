/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesPrincipales;

import javax.swing.SwingUtilities;
import vista.frmGestorTareas;
import controlador.ControladorEjercicio2;

/**
 *
 * @author rodri
 */
public class swingEjercicio2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            
            //Crear la Vista
            frmGestorTareas vistaGestor = new frmGestorTareas();
            
            //Crear el Controlador y le pasamos la Vista para que pueda manipularla
            new ControladorEjercicio2(vistaGestor); 
            
            //Hacer visible la ventana
            vistaGestor.setVisible(true);
        });
    }
}
