/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodrigoalonzodesafio1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class RodrigoAlonzoDesafio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al Analizador de Texto!");
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        
        //Código
        
        /* Inicializamos las variables
        int para contar */
        int vocales = 0;
        int consonantes = 0;
        int espacios = 0;
        int numeros = 0;
        
        /* Creamos un arreglo para contar
        la frecuencia de cada letra. El tamaño de
        27 corresponde a las 26 letras del abecedario
        en español */
        int[] frecuenciaLetras = new int[26];
        
        /* Este bucle se ejecuta mientras i sea
        menor al tamaño de la frase ingresada */
        for (int i = 0; i < frase.length(); i++) {
            /* Declaramos una variable char llamada caractet.
            El método ".charAt(i)" es un método de String que devuelve
            el carácter que se encuentra en el índice i */
            char caracter = frase.charAt(i);
            
            /* Si el caracter es una vocal,
            cuenta las vocales en la frase */
            if (caracter >= 'a' && caracter <= 'z') {
                if (caracter == 'a' ||
                        caracter == 'e' ||
                        caracter == 'i' ||
                        caracter == 'o' ||
                        caracter == 'u') {
                    vocales++;
                    /* Si no son vocales, cuenta las consonantes */
                } else {
                    consonantes++;
                }
                /* Con este código contamos las letras
                del abecedario. Los caracteres se almacenan
                como numeros enteros. La operacion "caracter - 'a'" nos
                permite obtener la letra del abecedario a contar */
                frecuenciaLetras[caracter - 'a']++;
                
                /* Si, el caracter es entre 0 y 9, es decir, un número
                cuenta los números en la frase */
            } else if (caracter >= '0' && caracter <= '9') {
                numeros++;
                /* Si el caracter es un espacio, cuenta
                los espacios */
            } else if (caracter == ' ') {
                espacios++;
            }
        }
        
        /* Inicializamos las variables para
        obtener la letra más repetida */
        char letraMasRepetida = ' ';
        int maxFrecuencia = 0;
        
        /* Recorremos el arreglo "frecuenciaLetras" */
        for (int i = 0; i < frecuenciaLetras.length; i++) {
            if (frecuenciaLetras[i] > maxFrecuencia) {
                maxFrecuencia = frecuenciaLetras[i];
            /*Convertimos el índice del arreglo de
            nuevo a su carácter correspondiente*/
                letraMasRepetida = (char)('a' + i);
            }
        }

        System.out.println("---");
        System.out.println("Estadisticas de la frase:");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Espacios: " + espacios);
        System.out.println("Numeros: " + numeros);
        System.out.println("---");
        
        // Imprimimos la letra más repetida solo si se encontró alguna letra
        if (maxFrecuencia > 0) {
            System.out.println("La letra que mas se repite es '" +
                    letraMasRepetida + "' con " +
                    maxFrecuencia + " ocurrencias.");
        } else {
            System.out.println("No se encontraron letras en la frase.");
        }
        
        scanner.close();
        // TODO code application logic here
    }
    
}
