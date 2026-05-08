/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
public class caculadora {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("calculadota");
        System.out.println("ingrese numero");
        int num1 = sc.nextInt();
        System.out.println("ingrese numero");
        int num2 = sc.nextInt();
        System.out.println("""
                           que metodo desea realizar 
                           1. sumar
                           2. restar 
                           3. multiplicar 
                           4. dividir""");
        int eleccion = sc.nextInt();
        int resultado;
         switch (eleccion){
        case 1 -> { 
            resultado = num1 + num2;
            System.out.println("la suma de " + num1 + " + " + num2 + " es " + resultado);
            }
        case 2 ->{
             resultado = num1 - num2;
             System.out.println("la resta de " + num1 + " - " + num2 + " es " + resultado);
            }
        case 3 ->{
             resultado = num1 * num2;
             System.out.println("la multiplicacion de " + num1 + " * " + num2 + " es " + resultado);
            }
        case 4 ->{
             resultado = num1 / num2;
             System.out.println("la division de " + num1 + " / " + num2 + " es " + resultado);
            }
        default ->
            {
                System.out.println("el elemento que ingreso es mayor a 4 o menor a 0");
            }
}
    }
    
}
