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
public class Banco {
    public static void main(String args[]){
    CuentaBancaria  cuenta = new CuentaBancaria();
    Scanner sc = new Scanner(System.in);
    boolean fin = false;
        System.out.println("ingrese su nombre");
        String nombre = sc.nextLine();
        cuenta.setTitular(nombre);
        
        
        while(fin == false){
            System.out.println("""
                           ¿que desea hacer?
                           1. Depositar
                           2. Retirar
                           3. Mostrar datos
                           4. Salir
                           """);
        int opcion = sc.nextInt();
            switch(opcion){
                case 1 ->{
                    System.out.println("Digite la cantidad que desea depositar");
                    int cantidaddeposito = sc.nextInt();
                    cuenta.depositar(cantidaddeposito);
                }
                case 2 -> {
                System.out.println("Digite la cantidad que desea retirar");
                    int cantidadretiro = sc.nextInt();
                    cuenta.retirar(cantidadretiro);
                }
                case 3 -> {
                    System.out.println("Los datos de la cuenta son:" );
                cuenta.mostrardatos();
                    
                }
                case 4 -> {
                fin = true;
                }
                default -> {
                    System.out.println("la opcion que ingreso no es valida");
                }

            }
        
        }
        sc.close();
    }
}
