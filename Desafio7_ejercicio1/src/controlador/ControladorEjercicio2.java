/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.frmGestorTareas;
import modelo.Tarea;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class ControladorEjercicio2 {
    private final frmGestorTareas vistaGestor;
    
    public ControladorEjercicio2(frmGestorTareas vistaGestor){
        this.vistaGestor = vistaGestor;
        
        configurarListeners();
    }
    
    
    //Configura los escuchadores de eventos para los botones
    private void configurarListeners() {
        //Enlazar el botón 'Agregar Tarea' con el método agregarTarea()
        vistaGestor.getAddButton().addActionListener(e -> agregarTarea());
        
        //Enlazar el botón 'Marcar Completada' con el método completarTareaSeleccionada()
        vistaGestor.getCompleteButton().addActionListener(e -> completarTareaSeleccionada());
    }

    
    //Lógica para agregar una nueva tarea
    private void agregarTarea() {
        //Obtener la entrada del usuario desde el JTextField
        String nombreTarea = vistaGestor.getTaskInputField().getText().trim();
        
        if (!nombreTarea.isEmpty()) {
            //Crear un nuevo objeto Tarea
            Tarea nuevaTarea = new Tarea(nombreTarea);
            
            //Agregar el nuevo objeto Tarea al DefaultListModel
            vistaGestor.getListModel().addElement(nuevaTarea);
            
            //Limpiar el campo de texto
            vistaGestor.getTaskInputField().setText("");
            
            //Asegurar que la nueva tarea sea visible
            vistaGestor.getTaskList().ensureIndexIsVisible(vistaGestor.getListModel().size() - 1);
        } else {
            //Mostrar mensaje de error si el campo está vacío
            JOptionPane.showMessageDialog(vistaGestor, "El nombre de la tarea no puede estar vacío.", 
                                          "Error de Entrada", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Lógica para marca una tarea seleccionada como completada
    private void completarTareaSeleccionada() {
        //Obtener el índice de la tarea seleccionada en el JList
        int indiceSeleccionado = vistaGestor.getTaskList().getSelectedIndex();
        
        if (indiceSeleccionado != -1) {
            //Obtener el objeto Tarea de la posición seleccionada
            Tarea tareaSeleccionada = vistaGestor.getListModel().getElementAt(indiceSeleccionado);
            
            //Cambiar el estado de la tarea
            tareaSeleccionada.setCompletado(true);
            
            //Forzar al JList a repintar el elemento 
            //Es necesario para que se muestre el cambio del toString() de Tarea (ej. [✓]).
            vistaGestor.getListModel().setElementAt(tareaSeleccionada, indiceSeleccionado);
            
        } else {
            //Mostrar un mensaje si no hay tarea seleccionada
            JOptionPane.showMessageDialog(vistaGestor, "Por favor, selecciona una tarea para marcarla como completada.", 
                                          "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
