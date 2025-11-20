/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigoalonzo.desafio3;

/**
 *
 * @author Alumno
 */
// Subclase JugadorExperto
class JugadorExperto extends Jugador {
    private static final double PORCENTAJE_APUESTA = 0.20;

    public JugadorExperto(String nombre, double dinero) {
        super(nombre, dinero);
    }

    @Override
    public double calcularApuesta() {
        return getDinero() * PORCENTAJE_APUESTA;
    }

    @Override
    public String obtenerTipoJugador() {
        return "Experto";
    }
}
