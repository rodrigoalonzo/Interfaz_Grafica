/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrigoalonzo.desafio3;

import java.util.*;

/**
 *
 * @author Alumno
 */
// Clase Casino
class Casino {
    private List<Jugador> jugadores;
    private JuegoDados juego;

    public Casino() {
        this.jugadores = new ArrayList<>();
    }

    public Jugador crearJugador(String nombre, int tipo) {
        switch (tipo) {
            case 1:
                return new JugadorNovato(nombre, 500);
            case 2:
                return new JugadorExperto(nombre, 500);
            case 3:
                return new JugadorVIP(nombre, 500);
            default:
                throw new IllegalArgumentException("Tipo de jugador invalido.");
        }
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void jugar() {
        this.juego = new JuegoDados(jugadores);
        int ronda = 1;
        
        while (ronda <= 3 && jugadores.size() > 1) {
            System.out.println("\n\n=============== RONDA " + ronda + " ===============");
            juego.apostar();
            juego.jugarRonda();
            
            // Verificar si queda solo un jugador o si todos se quedaron sin dinero
            if (jugadores.size() <= 1) {
                System.out.println("\nLa partida ha terminado porque solo queda un jugador o ninguno tiene dinero para seguir.");
                break;
            }
            
            ronda++;
        }

        System.out.println("\n\n=============== FIN DEL JUEGO ===============");
        System.out.println("--- Resultados Finales ---");
        for (Jugador jugador : jugadores) {
            System.out.printf("  %s (%s): Dinero final = $%.2f, Partidas ganadas = %d\n", jugador.getNombre(), jugador.obtenerTipoJugador(), jugador.getDinero(), jugador.getPartidasGanadas());
        }

        if (jugadores.size() > 0) {
            jugadores.sort(Comparator.comparing(Jugador::getDinero).reversed());
            System.out.printf("\nEl jugador con mas dinero es: %s\n", jugadores.get(0).getNombre());
        }
    }
}
