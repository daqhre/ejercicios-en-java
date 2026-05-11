/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class ContandoVocales {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("""
                               Ingresa cualquier palabra, frase o texto 
                               y te contare cuantas letras vocales y 
                               letras no vocales tiene""");
            String texto = sc.nextLine();
            int contadordevocales = 0;
            int contadordenovocales = 0;
            for (int i = 0; i < texto.replaceAll("\\s+","").length(); i++) {
                char letra = texto.toLowerCase().charAt(i);
                switch (letra) {
                    case 'a' -> {
                        contadordevocales++;
                    }
                    case 'e' -> {
                        contadordevocales++;
                    }
                    case 'i' -> {
                        contadordevocales++;
                    }
                    case 'o' -> {
                        contadordevocales++;
                    }
                    case 'u' -> {
                        contadordevocales++;
                    }
                    default -> {
                        contadordenovocales++;
                    }
                }
            }
            System.out.println("la frase tiene " + texto.replaceAll("\\s+","").length() + " letras");
            System.out.println("la cantidad de letras vocales son " + contadordevocales);
            System.out.println("la cantidad de letras no vocales son " + contadordenovocales);
        } catch (Exception e){
            System.out.println("el error es " + e);
        }
    }

}
