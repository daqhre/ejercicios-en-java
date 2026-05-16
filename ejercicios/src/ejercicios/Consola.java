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
public class Consola {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    Videojuego juego = new Videojuego("Minecraft","cubos",1);
    boolean fin = false;
    do{
        System.out.println("Datos actuales");
    juego.mostrarDatos();
        System.out.println("¿Desea cambiar las horas jugadas?");
        System.out.println("Ingrese si o no");
        String opcion = sc.nextLine();
        switch (opcion){
            case "si" -> {
                System.out.println("ingrese la cantidad de horas que va a ingresar ");
                int horas = sc.nextInt();
                sc.nextLine();
                juego.setHoras(horas);
            }
            case "no" -> {
                System.out.println("ok, gracias por participar");
                fin = true;
            }
            default -> {
                System.out.println("El dato que ingreso no es valido");
            }
        }
    
    } while(fin == false);
    sc.close();
    }
    
}
