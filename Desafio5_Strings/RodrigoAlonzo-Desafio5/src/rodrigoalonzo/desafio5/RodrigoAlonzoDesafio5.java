/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodrigoalonzo.desafio5;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author Alumno
 */
public class RodrigoAlonzoDesafio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("---- Actividad 1 ----\n");
        
        String palabra1 = "Argentina";
        int longitud = palabra1.length();
        System.out.println("La palabra \"" + palabra1 + "\" tiene " + longitud + " caracteres.");
        
        String palabra2 = "Murcielago";
        int longitud2 = palabra2.length();
        System.out.println("La palabra \"" + palabra2 + "\" tiene " + longitud2 + " caracteres.");
        
        String palabra3 = "Van Gogh";
        int longitud3 = palabra3.length();
        System.out.println("La palabra \"" + palabra3 + "\" tiene " + longitud3 + " caracteres.");
        
        String palabra4 = "Abracadabra!!";
        int longitud4 = palabra4.length();
        System.out.println("La palabra \"" + palabra4 + "\" tiene " + longitud4 + " caracteres.");
        
        String palabra5 = "Hipopotomonstrosesquipedaliofobia";
        int longitud5 = palabra5.length();
        System.out.println("La palabra \"" + palabra5 + "\" tiene " + longitud5 + " caracteres.");
        
        System.out.println("\n---- Actividad 2 ----\n");
        
        String palabraConsigna2 = "Chocolate";
        char primeraLetra = palabraConsigna2.charAt(0);
        System.out.println("a) La primera letra de \"" + palabraConsigna2 + "\" es: " + primeraLetra);
        
        char tercerLetra = palabraConsigna2.charAt(2);
        System.out.println("b) La tercer letra de \"" + palabraConsigna2 + "\" es: " + tercerLetra);
       
        int longitudConsigna2 = palabraConsigna2.length();
        char ultimaLetra = palabraConsigna2.charAt(longitudConsigna2 - 1);
        System.out.println("c) La ultima letra de \"" + palabraConsigna2 + "\" es: " + ultimaLetra);
        
        System.out.println("\n---- Actividad 3 ----\n");
        
        String palabraConsigna3 = "Girasol";
        String subcadena = palabraConsigna3.substring(4);
        System.out.println("La subcadena extraida es: " + subcadena);
        
        System.out.println("\n---- Actividad 4 ----\n");
        
        String palabraConsigna4 = "Murcielago";
        String silaba1 = palabraConsigna4.substring(0,3);
        String silaba2 = palabraConsigna4.substring(3,6);
        String silaba3 = palabraConsigna4.substring(6,8);
        String silaba4 = palabraConsigna4.substring(8);
        System.out.println("Las silabas son:");
        System.out.println(silaba1);
        System.out.println(silaba2);
        System.out.println(silaba3);
        System.out.println(silaba4);
        
        System.out.println("\n---- Actividad 5 ----\n");
        
        String a5 = "Hola";
        String b5 = new String("Hola");
        
        boolean conIgual = a5 == b5;
        boolean conEquals5 = a5.equals(b5);
        
        System.out.println("a) Con exactamente igual: " + conIgual);
        System.out.println("a) Con equals: " + conEquals5);
        
        System.out.println("\n---- Actividad 6 ----\n");
        
        String a6 = "JAVA";
        String b6 = "Java";
        
        boolean conEquals6 = a6.equals(b6);
        boolean conIgnoreCase = a6.equalsIgnoreCase(b6);
        
        System.out.println("a) Con equals: " + conEquals6);
        System.out.println("b) Con ignore case: " + conIgnoreCase);
        
        System.out.println("\n---- Actividad 7 ----\n");
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Por favor, ingrese su nombre: ");
        
        String nombreUsuario = scanner.nextLine();
        
        if (nombreUsuario.equalsIgnoreCase("Juan")) {
            System.out.println("Bienvenido Juan.");
        } else {
            System.out.println("No eres Juan.");
        }
        
        System.out.println("\n---- Actividad 8 ----\n");
        
        String palabraConsigna8 = "Elefante";
        
        for(int i = 0; i < palabraConsigna8.length(); i++){
            char letra = palabraConsigna8.charAt(i);
            System.out.println("Letra " + (i+1) + ": " + letra);
        }
        
        System.out.println("\n---- Actividad 9 ----\n");
        
        String palabraConsigna9 = "Manzana";
        char letraConsigna9 = 'a';
        int contadorConsigna9 = 0;
        for(int i = 0; i < palabraConsigna9.length(); i++){
            if(palabraConsigna9.charAt(i) == letraConsigna9){
                contadorConsigna9++;
            }
        }
        System.out.println("En la palabra " + palabraConsigna9 + " la letra 'a' aparece: " + contadorConsigna9);
        
        System.out.println("\n---- Actividad 10 ----\n");
        
        String palabraConsigna10 = "Programar";
        
        System.out.println("Las letras en posiciones pares son:");

        for (int i = 0; i < palabraConsigna10.length(); i++) {
            if (i % 2 == 0) {
                System.out.println("Posicion " + (i) + ": " + palabraConsigna10.charAt(i));
            }
        }
        
        System.out.println("\n---- Actividad 11 ----\n");
        
        String palabraConsigna11 = "xylophon";
        int contadorConsigna11 = 0;
        boolean resultado = false;
        
        while(contadorConsigna11 < palabraConsigna11.length()){
            char letra = palabraConsigna11.charAt(contadorConsigna11);
            if(esVocal(letra)){
                System.out.println("La primera vocal encontrada es: " + letra);
                resultado = true;
                break;
            }
            contadorConsigna11++;
        }
        
        if(resultado == false){
            System.out.println("No se encontro vocal en la palabra analizada.");
        }
        
        System.out.println("\n---- Actividad 12 ----\n");
        
        String palabraConsigna12 = "Banana";
        String palabraDuplicada = "";
        
        for(int i = 0; i < palabraConsigna12.length(); i++){
            char letraConsigna12 = palabraConsigna12.charAt(i);
            palabraDuplicada += letraConsigna12;
            palabraDuplicada += letraConsigna12;
        }
        
        System.out.println("Palabra con letras duplicadas: " + palabraConsigna12);
        System.out.println("Palabra con letras duplicadas: " + palabraDuplicada);
        
        System.out.println("\n---- Actividad 13 ----\n");
        
        String fraseConsigna13 = "La programacion en Java";
        String palabraABuscar = "Java";
        
        int indice = fraseConsigna13.indexOf(palabraABuscar);
        
        System.out.println("El indice donde empieza la palabra \"" + palabraABuscar + "\" es: " + indice);
        
        System.out.println("\n---- Actividad 14 ----\n");
        
        String palabraConsigna14 = "Contrasenia123";
        String subcadenaConsigna14 = "123";
        
        int posicion = palabraConsigna14.indexOf(subcadenaConsigna14);
        
        if(posicion != -1){
            System.out.println("La cadena \"" + palabraConsigna14 + "\" contiene \"" + subcadenaConsigna14 + "\"");
        }
        else{
            System.out.println("No se encontro \"" + subcadenaConsigna14 + "\" en la palabra \"" + palabraConsigna14 + "\"");
        }
        
        System.out.println("\n---- Actividad 15 ----\n");
        
        String palabraConsigna15 = "www.google.com";
        String subcadenaConsigna15 = "https";
        
        if(palabraConsigna15.startsWith(subcadenaConsigna15)){
            System.out.println("\"" + palabraConsigna15 + "\" empieza con \"" + subcadenaConsigna15 + "\"");
        }
        else{
            System.out.println("\"" + palabraConsigna15 + "\" no empieza con \"" + subcadenaConsigna15 + "\"");
        }
        
        System.out.println("\n---- Actividad 16 ----\n");
        
        String pConsigna16 = "documento.pdf";
        String sConsigna16 = ".pdf";
        
        if(pConsigna16.endsWith(sConsigna16)){
            System.out.println("\"" + pConsigna16 + "\" termina en \"" + sConsigna16 + "\"");
        }
        else{
            System.out.println("\"" + pConsigna16 + "\" no termina en \"" + sConsigna16 + "\"");
        }
        
        System.out.println("\n---- Actividad 17 ----\n");
        
        System.out.print("Por favor, ingrese su email: ");
        
        String emailUsuario = scanner.nextLine();
        
        if(esEmailValido(emailUsuario)){
            System.out.println("El email es valido.");
        }
        else{
            System.out.println("El email no es valido.");
        }
        
        System.out.println("\n---- Actividad 18 ----\n");
        
        String pConsigna18 = "hola mundo";
        
        System.out.println("La cadena \"" + pConsigna18 + "\" en mayusculas es: " + pConsigna18.toUpperCase());
        
        System.out.println("\n---- Actividad 19 ----\n");
        
        String pConsigna19 = " Java ";
        String pConsigna192 = " Hola Mundo ";
        
        System.out.println("\"" + pConsigna19 + "\" sin espacios es: \"" + pConsigna19.trim() + "\"");
        System.out.println("\"" + pConsigna192 + "\" sin espacios es: \"" + pConsigna192.trim() + "\"");
        
        System.out.println("\n---- Actividad 20 ----\n");
        
        String pConsigna20 = "perro";
        String pReemplazo = "gato";
        String cConsigna20 = "Mi perro juega";
        
        System.out.println("Original: " + cConsigna20);
        System.out.println("Reemplazo: " + cConsigna20.replaceAll(pConsigna20, pReemplazo));
        
        System.out.println("\n---- Actividad 21 ----\n");
        
        String pConsigna21 = "cAmArA";
        
        System.out.println("Todo en minusculas: " + pConsigna21.toLowerCase());
        
        System.out.println("\n---- Actividad 22 ----\n");
        
        String cConsigna22 = "Compre pocas copas, pocas copas compre y como compre pocas copas, pocas copas pague";
        String pConsigna22 = "copas";
        String pReemplazo22 = "cocas";
        
        System.out.println("Original: " + cConsigna22);
        System.out.println("Reemplazo: " + cConsigna22.replaceAll(pConsigna22, pReemplazo22));
        
        System.out.println("\n---- Actividad 23 ----\n");
        
        String cConsigna23 = "rojo,verde,azul";
        String[] arrayColores = cConsigna23.split(",");
        
        for(String color : arrayColores){
            System.out.println("Color: " + color);
        }
        
        System.out.println("\n---- Actividad 24 ----\n");
        
        String cConsigna24 = "lunes-martes-miercoles";
        String[] arrayDias = cConsigna24.split("-");
        
        System.out.println(arrayDias[2]);
        
        System.out.println("\n---- Actividad 25 ----\n");
        
        String cConsigna25 = "Java es muy divertido";
        
        int contadorConsigna25 = 0;
        
        String[] arrayFrase = cConsigna25.split(" ");
        
        for(String palabra : arrayFrase){
            contadorConsigna25++;
        }
        
        System.out.println("La frase \"" + cConsigna25 + "\" contiene " + contadorConsigna25 + " palabras");
        
        System.out.println("\n---- Actividad 26 ----\n");
        
        String cConsigna26 = "123.456.789";
        int contadorConsigna26 = 1;
        
        String[] arrayNumeros = cConsigna26.split("\\.");
        
        for(String numero : arrayNumeros){
            System.out.println(contadorConsigna26++ + ". " + numero);
        }
        
        System.out.println("\n---- Actividad 27 ----\n");
        
        String cConsigna27 = "correo@gmail.com";
        
        String[] arrayEmail = cConsigna27.split("@");
        
        System.out.println("Usuario: " + arrayEmail[0]);
        System.out.println("Dominio: " + arrayEmail[1]);
        
        System.out.println("\n---- Actividad 28 ----\n");
        
        String pConsigna28 = "bananaterracotapie";
        
        String sub1 = pConsigna28.substring(0, 6);
        String sub2 = pConsigna28.substring(6, 15);
        String sub3 = pConsigna28.substring(15);
        
        for(int i = 0; i < sub1.length(); i++){
            System.out.println("Letra 1: " + sub1.charAt(i));
        }
        
        System.out.println("\n---- Actividad 29 ----\n");
        
        String pConsigna29 = "Programacion";
        
        int[] contadorConsigna29 = new int[26];
        
        pConsigna29 = pConsigna29.toLowerCase();
        
        for(int i = 0; i < pConsigna29.length(); i++){
            char letra = pConsigna29.charAt(i);
            if(Character.isLetter(letra)){
                int posicionConsigna29 = letra - 'a';
                contadorConsigna29[posicionConsigna29]++;
            }
        }
        
        for(int i = 0; i < contadorConsigna29.length; i++){
            if(contadorConsigna29[i] > 0){
                char letra = (char)('a' + i);
                System.out.println(letra + ": " + contadorConsigna29[i]);
            }
        }
        
        System.out.println("\n---- Actividad 29 usando HashMap ----\n");
        
        String pConsigna292 = "Programacion";
        
        pConsigna292 = pConsigna292.toLowerCase();
        HashMap<Character, Integer> contadorConsigna292 = new HashMap<>();
        
        for(int i = 0; i < pConsigna292.length(); i++){
            char letra = pConsigna292.charAt(i);
            if(Character.isLetter(letra)){
                contadorConsigna292.put(letra, contadorConsigna292.getOrDefault(letra, 0) + 1);
            }
        }
        
        for(char letra : contadorConsigna292.keySet()){
            System.out.println(letra + ": " + contadorConsigna292.get(letra));
        }
        
        System.out.println("\n---- Actividad 30 ----\n");
        
        System.out.print("Por favor, ingrese contrasenia: ");
        
        String contrasenia = scanner.nextLine();
        
        if(validacionContrasenia(contrasenia)){
            System.out.println("La contrasenia es valida");
        }
        else{
            System.out.println("La contrasenia es invalida");
        }
        
        System.out.println("\n---- Actividad 31 ----\n");
        
        System.out.print("Por favor, ingrese clave a encriptar: ");
        
        String encriptar = scanner.nextLine();
        
        String encriptado = encriptarVocales(encriptar);
        System.out.println("Original: " + encriptar);
        System.out.println("Encriptado: " + encriptado);
    }
    
    public static boolean esEmailValido(String email) {
            if (!email.contains("@")) {
            return false;
            }
            
            if (email.startsWith("@") ||
                    email.endsWith("@") ||
                    email.startsWith(".") ||
                    email.endsWith(".")) {
            return false;
            }
            
            int indiceArroba = email.indexOf("@");
            int indicePunto = email.indexOf(".", indiceArroba);
            
            if (indicePunto == -1 || indicePunto == indiceArroba + 1) {
            return false;
            }
            
            return true;
    }
    
    public static boolean esVocal(char c){
        c = Character.toLowerCase(c);
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u';
    }
    
    public static boolean validacionContrasenia(String texto){
        if(texto.length() < 8){
            return false;
        }
        
        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        
        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if(Character.isUpperCase(c)){
                tieneMayuscula = true;
            }
            if(Character.isDigit(c)){
                tieneNumero = true;
            }
        }
        return tieneMayuscula && tieneNumero;
    }
    
    public static String encriptarVocales(String texto){
        texto = texto.toLowerCase();
        String resultado = "";
        
        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            
            switch(letra){
                case 'a': resultado += '1';
                break;
                
                case 'e': resultado += '2';
                break;
                
                case 'i': resultado += '3';
                break;
                
                case 'o': resultado += '4';
                break;
                
                case 'u': resultado += '5';
                break;
                
                default: resultado += letra;
            }
        }
        return resultado;
    }
}