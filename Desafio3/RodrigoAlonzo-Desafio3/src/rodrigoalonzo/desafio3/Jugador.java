/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigoalonzo.desafio3;

/**
 *
 * @author Alumno
 */
abstract class Jugador {
    private String nombre;
    private double dinero;
    private int partidasGanadas;

    public Jugador(String nombre, double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.partidasGanadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(double dinero) {
        if(dinero>=0){
            this.dinero = dinero;
        }
        else{
            this.dinero = 0;
        }
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }
    
    // Métodos comunes
    public void ganar(double cantidad) {
        setDinero(this.dinero + cantidad);
        this.partidasGanadas++;
    }

    public void perder(double cantidad) {
        setDinero(this.dinero - cantidad);
    }
    
    // Métodos abstractos
    public abstract double calcularApuesta();
    public abstract String obtenerTipoJugador();
}

// Subclase JugadorNovato
class JugadorNovato extends Jugador {
    private static final double APUESTA_FIJA = 50.0;

    public JugadorNovato(String nombre, double dinero) {
        super(nombre, dinero);
    }

    @Override
    public double calcularApuesta() {
        return APUESTA_FIJA;
    }

    @Override
    public String obtenerTipoJugador() {
        return "Novato";
    }
}