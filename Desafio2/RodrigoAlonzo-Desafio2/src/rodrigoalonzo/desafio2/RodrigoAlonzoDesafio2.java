/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodrigoalonzo.desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Alumno
 */
public class RodrigoAlonzoDesafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos al Torneo de Dados al mejor de 3 partidas!");
        
        int numRondas;
        
        System.out.println("\nPor favor, ingrese el numero de rondas a jugar en cada partida: ");
        
        while(!scanner.hasNextLine() || (numRondas = scanner.nextInt()) <= 0){
            System.out.println("Entrada invalida. Por favor, ingrese un numero entero positivo (mayor que 0).");
            if(scanner.hasNextLine()){
                scanner.nextLine();
            }
            System.out.println("Ingrese el numero de rondas a jugar en cada partida: ");
        }

        int victoriasJ1Partidas = 0;
        int victoriasJ2Partidas = 0;
        
        // Bucle principal para el modo "Mejor de 3"
        while (victoriasJ1Partidas < 2 && victoriasJ2Partidas < 2) {
            int resultadoPartida = jugarPartida(numRondas);
            /* Si gana jugador 1, suma una victoria
            al jugador 1 */
            if (resultadoPartida == 1) {
                victoriasJ1Partidas++;
                System.out.println("Jugador 1 gana la partida!");
                /* Si gana el jugador 2, suma una
                victoria al jugador 2 */
            } else if (resultadoPartida == 2) {
                victoriasJ2Partidas++;
                System.out.println("Jugador 2 gana la partida!");
            }
            System.out.println("\nMarcador actual del torneo: J1 (" + victoriasJ1Partidas + ") - J2 (" + victoriasJ2Partidas + ")");
        }
        
        System.out.println("\n--- Fin del Torneo! ---");
        if (victoriasJ1Partidas > victoriasJ2Partidas) {
            System.out.println("El Jugador 1 es el campeon del torneo!");
        } else {
            System.out.println("El Jugador 2 es el campeon del torneo!");
        }

        scanner.close();
    }
    
    public static int jugarPartida(int numRondas) {
        Random random = new Random();
        int victoriasJ1Rondas = 0;
        int victoriasJ2Rondas = 0;
        
        List<Integer> puntajesJ1 = new ArrayList<>();
        List<Integer> puntajesJ2 = new ArrayList<>();
        
        Map<Integer, Integer> histograma = new HashMap<>();
        
                System.out.println("\n--- Nueva partida (al mejor de 3 rondas) ---");

        for (int i = 1; i <= numRondas; i++) {
            System.out.println("\n--- Ronda " + i + " ---");

            int tiradaJ1 = random.nextInt(6) + 1 + random.nextInt(6) + 1;
            int tiradaJ2 = random.nextInt(6) + 1 + random.nextInt(6) + 1;

            System.out.println("Jugador 1 tira: " + tiradaJ1);
            System.out.println("Jugador 2 tira: " + tiradaJ2);

            puntajesJ1.add(tiradaJ1);
            puntajesJ2.add(tiradaJ2);

            // Actualiza el histograma
            histograma.put(tiradaJ1, histograma.getOrDefault(tiradaJ1, 0) + 1);
            histograma.put(tiradaJ2, histograma.getOrDefault(tiradaJ2, 0) + 1);

            if (tiradaJ1 > tiradaJ2) {
                System.out.println("Jugador 1 gana la ronda!");
                victoriasJ1Rondas++;
            } else if (tiradaJ2 > tiradaJ1) {
                System.out.println("Jugador 2 gana la ronda!");
                victoriasJ2Rondas++;
            } else {
                System.out.println("Empate en esta ronda!");
            }
        }

        mostrarEstadisticas(victoriasJ1Rondas, victoriasJ2Rondas, puntajesJ1, puntajesJ2, histograma);

        if (victoriasJ1Rondas > victoriasJ2Rondas) {
            return 1; // Gana Jugador 1
        } else {
            return 2; // Gana Jugador 2
        }
    }
    
    /**
     * Muestra las estadísticas de una partida, incluyendo un histograma.
     */
    public static void mostrarEstadisticas(int victoriasJ1, int victoriasJ2, List<Integer> puntajesJ1, List<Integer> puntajesJ2, Map<Integer, Integer> histograma) {
        System.out.println("\n--- Estadisticas de la partida ---");

        System.out.println("Rondas ganadas por Jugador 1: " + victoriasJ1);
        System.out.println("Rondas ganadas por Jugador 2: " + victoriasJ2);

        System.out.printf("Promedio de puntos de Jugador 1: %.2f\n", calcularPromedio(puntajesJ1));
        System.out.printf("Promedio de puntos de Jugador 2: %.2f\n", calcularPromedio(puntajesJ2));

        System.out.println("Mayor tirada de Jugador 1: " + Collections.max(puntajesJ1));
        System.out.println("Mayor tirada de Jugador 2: " + Collections.max(puntajesJ2));

        System.out.println("\nHistorial de puntajes:");
        System.out.println("Jugador 1: " + puntajesJ1);
        System.out.println("Jugador 2: " + puntajesJ2);

        // Muestra el histograma de resultados
        System.out.println("\nHistograma de resultados:");
        for (int i = 2; i <= 12; i++) {
            if (histograma.containsKey(i)) {
                System.out.printf("Salio %2d: %s (%d veces)\n", i, "*".repeat(histograma.get(i)), histograma.get(i));
            }
        }
    }

    /**
     * Calcula el promedio de una lista de enteros.
     */
    public static double calcularPromedio(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}