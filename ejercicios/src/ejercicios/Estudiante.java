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
public class Estudiante {
    String nombre;
    int edad;
    String carrera;
    public static void main(String args[]){
    Estudiante alumno = new Estudiante();
    Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el nombre del alumno ");
        alumno.nombre = sc.nextLine();
        System.out.println("ingrese la edad del estudiante ");
        alumno.edad = sc.nextInt();
        sc.nextLine();
        System.out.println("ingresa el nombre de la carrera del alumno ");
        alumno.carrera = sc.nextLine();
        System.out.println("el alumno " + alumno.nombre + " tiene " + alumno.edad + 
                " años y cursa la carrera de " +
                alumno.carrera);
        
        sc.close();
       }
}
