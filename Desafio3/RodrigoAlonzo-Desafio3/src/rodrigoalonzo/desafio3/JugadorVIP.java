/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigoalonzo.desafio3;

/**
 *
 * @author Alumno
 */
// Subclase JugadorVIP
class JugadorVIP extends Jugador {
    private static final double PORCENTAJE_APUESTA = 0.30;
    private boolean reRollUsado;

    public JugadorVIP(String nombre, double dinero) {
        super(nombre, dinero);
        this.reRollUsado = false;
    }
    
    public boolean puedeHacerReRoll() {
        return !reRollUsado;
    }
    
    public void usarReRoll() {
        this.reRollUsado = true;
    }

    @Override
    public double calcularApuesta() {
        return getDinero() * PORCENTAJE_APUESTA;
    }

    @Override
    public String obtenerTipoJugador() {
        return "VIP";
    }
}

