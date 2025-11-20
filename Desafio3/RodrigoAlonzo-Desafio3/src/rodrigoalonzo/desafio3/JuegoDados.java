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
// Clase JuegoDados
class JuegoDados {
    private List<Jugador> jugadores;
    private Dado dado1;
    private Dado dado2;
    private double pozo;

    public JuegoDados(List<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.pozo = 0;
    }

    public void apostar() {
        pozo = 0;
        System.out.println("\n--- Fase de Apuestas ---");
        for (Jugador jugador : jugadores) {
            double apuesta = jugador.calcularApuesta();
            if (jugador.getDinero() >= apuesta) {
                jugador.perder(apuesta);
                pozo += apuesta;
                System.out.printf("%s (%s) apuesta $%.2f. Dinero restante: $%.2f\n", jugador.getNombre(), jugador.obtenerTipoJugador(), apuesta, jugador.getDinero());
            } else {
                System.out.printf("%s (%s) no tiene suficiente dinero para apostar y queda fuera de la ronda.\n", jugador.getNombre(), jugador.obtenerTipoJugador());
                jugador.perder(jugador.getDinero());
            }
        }
    }

    public void jugarRonda() {
        System.out.println("\n--- Ronda de Juego ---");
        Map<Jugador, Integer> resultados = new HashMap<>();
        
        // Tirar dados
        for (Jugador jugador : jugadores) {
            if (jugador.getDinero() > 0) {
                int tirada1 = dado1.tirar();
                int tirada2 = dado2.tirar();
                int suma = tirada1 + tirada2;

                // Lógica de re-roll para VIP
                if (jugador instanceof JugadorVIP && ((JugadorVIP) jugador).puedeHacerReRoll()) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.printf("%s (VIP) ha tirado %d y %d (Suma: %d). Desea hacer un re-roll? (s/n): ", jugador.getNombre(), tirada1, tirada2, suma);
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        ((JugadorVIP) jugador).usarReRoll();
                        int nuevaTirada1 = dado1.tirar();
                        int nuevaTirada2 = dado2.tirar();
                        int nuevaSuma = nuevaTirada1 + nuevaTirada2;
                        System.out.printf("  %s ha hecho un re-roll! Nueva tirada: %d y %d (Suma: %d)\n", jugador.getNombre(), nuevaTirada1, nuevaTirada2, nuevaSuma);
                        suma = nuevaSuma;
                    }
                }
                
                System.out.printf("  %s (%s) ha tirado %d y %d. Suma total: %d\n", jugador.getNombre(), jugador.obtenerTipoJugador(), tirada1, tirada2, suma);
                resultados.put(jugador, suma);
            }
        }
        
        // Determinar ganador
        int maxSuma = 0;
        for (int suma : resultados.values()) {
            if (suma > maxSuma) {
                maxSuma = suma;
            }
        }

        List<Jugador> ganadores = new ArrayList<>();
        for (Map.Entry<Jugador, Integer> entry : resultados.entrySet()) {
            if (entry.getValue() == maxSuma) {
                ganadores.add(entry.getKey());
            }
        }

        System.out.println("\n--- Resultados de la Ronda ---");
        if (ganadores.isEmpty()) {
            System.out.println("No hubo ganador en esta ronda.");
        } else if (ganadores.size() == 1) {
            Jugador ganador = ganadores.get(0);
            ganador.ganar(pozo);
            System.out.printf("%s es el ganador! Gana el pozo de $%.2f. Dinero total: $%.2f\n", ganador.getNombre(), pozo, ganador.getDinero());
        } else {
            double premioDividido = pozo / ganadores.size();
            System.out.printf("Hay un empate! El pozo de $%.2f se divide entre los ganadores.\n", pozo);
            for (Jugador ganador : ganadores) {
                ganador.ganar(premioDividido);
                System.out.printf("  %s (%s) recibe $%.2f. Dinero total: $%.2f\n", ganador.getNombre(), ganador.obtenerTipoJugador(), premioDividido, ganador.getDinero());
            }
        }
        
        // Eliminar jugadores sin dinero para la próxima ronda
        jugadores.removeIf(jugador -> jugador.getDinero() <= 0);
    }
}
