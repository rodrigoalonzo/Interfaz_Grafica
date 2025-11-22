/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rodri
 */
public class Tarea {
    private String nombre;
    private boolean completado;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    // Método para mostrar la tarea en el JList
    @Override
    public String toString() {
        return (completado ? "[✓] " : "[ ] ") + nombre;
    }
}
