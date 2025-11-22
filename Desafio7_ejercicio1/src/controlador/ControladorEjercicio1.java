/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vista.frmConversor;
import modelo.Conversor;

/**
 *
 * @author Alumno
 */
public class ControladorEjercicio1 implements ActionListener {
    
    private frmConversor vista;
    private Conversor modelo;

    public ControladorEjercicio1(frmConversor vista, Conversor modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        // Asocia el controlador como el oyente de eventos del botón
        this.vista.getBtnConvertir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificar que el evento provenga del botón "Convertir"
        if (e.getSource() == vista.getBtnConvertir()) {
            realizarConversion();
        }
    }

    private void realizarConversion() {
        try {
            // 1. Obtener la entrada de la Vista
            String entradaTexto = vista.getTxtEntrada().getText();
            double valor = Double.parseDouble(entradaTexto);
            String tipoConversion = (String) vista.getCmbConversion().getSelectedItem();
            double resultado;

            // 2. Realizar el cálculo usando el Modelo
            if ("C a F".equals(tipoConversion)) {
                resultado = modelo.celsiusAFahrenheit(valor);
                // Mostrar un ejemplo de la fórmula
                System.out.println(valor + " Celsius a Fahrenheit: F = (" + valor + " * 9/5) + 32 = " + resultado);
            } else if ("F a C".equals(tipoConversion)) {
                resultado = modelo.fahrenheitACelsius(valor);
                // Mostrar un ejemplo de la fórmula
                System.out.println(valor + " Fahrenheit a Celsius: C = (" + valor + " - 32) * 5/9 = " + resultado);
            } else {
                return; // En caso de un error inesperado
            }

            // 3. Actualizar la salida en la Vista
            // Usamos String.format para limitar los decimales
            vista.getTxtSalida().setText(String.format("%.2f", resultado));

        } catch (NumberFormatException ex) {
            // Manejo de error si el usuario no ingresa un número válido
            JOptionPane.showMessageDialog(vista,
                    "Por favor, ingrese un valor numérico válido.",
                    "Error de Entrada",
                    JOptionPane.ERROR_MESSAGE);
            vista.getTxtEntrada().setText(""); // Limpiar el campo de entrada
            vista.getTxtSalida().setText("");
        }
    }
}
