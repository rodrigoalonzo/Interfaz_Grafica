/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alumno
 */
public class Conversor {
/**
     * Convierte grados Celsius a Fahrenheit.
     * Fórmula: F = C * 9/5 + 32
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura en grados Fahrenheit.
     */
    public double celsiusAFahrenheit(double celsius) {
        return celsius * 9.0/5.0 + 32;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     * Fórmula: C = (F - 32) * 5/9
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Temperatura en grados Celsius.
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}
