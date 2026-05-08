/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dairo
 */
public class Ejercicios {

    public boolean anagrama(String palabra1, String palabra2){
       
        
         int [] vector = new int [palabra1.length()];
         int [] vector2 = new int [palabra2.length()];
         if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("no son anagrama por que son palabras iguales");
        } else {
        for(int i = 0; i < palabra1.length(); i ++){
        vector [i] = palabra1.charAt(i);
            System.out.print(vector[i]);
        }
        System.out.println("anagrama");
        for(int i = palabra1.length(); i == 0 ; i --){
        
            System.out.print(vector[i]);
        }
        for(int i = 0; i < palabra2.length(); i ++){
        vector2 [i] = palabra2.charAt(i);
            System.out.print(vector2[i]);
        }
        System.out.println("anagrama");
        for(int i = palabra2.length(); i == 0 ; i --){
        
            System.out.print(vector[i]);
        }
        
            System.out.println("puede que sea un anagrama");
        }
        return false;
    /*
     }
    public static void main(String[] args) {
       String p = JOptionPane.showInputDialog(null,"ingrese una palabra");
       String p2 = JOptionPane.showInputDialog(null,"ingrese otra palabra");
        Ejercicios e = new Ejercicios();
        e.anagrama(p, p2);
       
         /* EJERCICIO 1
        for(int i = 1; i <=100; i++){
        if(i % 3 == 0 && i % 5 != 0){
            System.out.println("Fizz");
        }else if(i % 5 == 0 && i % 3 != 0){
            System.out.println("Buzz");
        } else if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        } else {
            System.out.println(i);
        }
        
        
        } 
        */   
         
         
    }
    
}
