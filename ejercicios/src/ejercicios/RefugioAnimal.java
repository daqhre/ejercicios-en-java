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
public class RefugioAnimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    Animal animales [] = new Animal[3];
    boolean fin = false;
    animales [0]= new Animal("desconocido", 0);
    animales [1]= new Gato("michi","negro",2);
    animales [2]= new Perro("firulais","doberman", 1);
   
        for (Animal animale : animales) {
            animale.mostrarDatos();
            animale.hacerSonido();
            System.out.println("");
        }
    
    
    }
    
}
