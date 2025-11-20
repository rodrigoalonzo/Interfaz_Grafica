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
public class Dado {
    public int tirar() {
        return new Random().nextInt(6) + 1;
    }
}
