/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigoalonzo.desafio3;

/**
 *
 * @author Alumno
 */
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
