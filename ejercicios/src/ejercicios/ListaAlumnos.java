/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class ListaAlumnos {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String nombrealumno;
        int opcion;
        boolean fin = false;

        while (fin == false) {
            System.out.println("""
                         Elija que opcion desea hacer
                           1. Agregar estudiante
                           2. Mostrar estudiantes
                           3. Buscar estudiante
                           4. Salir
                           """);
            System.out.println("----");
            opcion = sc.nextInt();
            System.out.println("----");
            switch (opcion) {

                case 1 -> {
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del alumno");
                    nombrealumno = sc.nextLine();

                    nombres.add(nombrealumno);
                }
                case 2 -> {
                    if (!nombres.isEmpty()) {
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println((i + 1) + ". " + nombres.get(i));
                        }
                    } else {
                        System.out.println("No hay estudiantes");
                    }
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.println("Ingrese el nombre a buscar");
                    nombrealumno = sc.nextLine();

                    if (nombres.contains(nombrealumno)) {
                        int pos = nombres.indexOf(nombrealumno);
                        System.out.println("El alumno está en la posición " + (pos + 1));
                    } else {
                        System.out.println("El alumno no existe");
                    }
                }
                case 4 -> {

                    System.out.println("Gracias por participar");
                    fin = true;

                }
                default -> {
                    System.out.println("la opcion que ingreso no es valida");
                }

            }

        }
    }

}
