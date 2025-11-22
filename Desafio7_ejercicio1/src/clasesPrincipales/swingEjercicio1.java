/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesPrincipales;

import vista.frmConversor;
import controlador.ControladorEjercicio1;
import modelo.Conversor;

import javax.swing.SwingUtilities;

/**
 *
 * @author Alumno
 */
public class swingEjercicio1 {
    
    public static void main(String[] args) {
    // Tu código de ejecución principal va aquí
    // Ejecución en el hilo de eventos de Swing (buenas prácticas)
        SwingUtilities.invokeLater(() -> {
            // 1. Crear el Modelo
            Conversor modelo = new Conversor();
            
            // 2. Crear la Vista
            frmConversor vista = new frmConversor();
            
            // 3. Crear el Controlador y conectarlo al Modelo y la Vista
            ControladorEjercicio1 controlador = new ControladorEjercicio1(vista, modelo);
            
            vista.setVisible(true);
        });
    }
}
