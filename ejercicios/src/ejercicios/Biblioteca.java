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
public class Biblioteca {

    public static void main(String args[]) {
        ArrayList<Libro> libreria = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        do {
            System.out.println("""
                           1. Agregar libro
                           2. Mostrar libros
                           3. Buscar libro
                           4. Eliminar libro
                           5. Salir
                           """);
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    boolean existe = false;
                    System.out.println("Ingrese el nombre del libro");
                    String libro = sc.nextLine();
                    System.out.println("Ingrese el nombre del autor");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese la cantidad de paginas del libro");
                    int paginas = sc.nextInt();

                    for (Libro lib : libreria) {
                        if (libro.equalsIgnoreCase(lib.getTitulo()) && autor.equalsIgnoreCase(lib.getAutor()) && paginas == lib.getPaginas()) {
                            existe = true;
                        }
                    }
                    if (existe) {
                        System.out.println("El libro ya esta registrado");
                    } else {
                        Libro libros = new Libro(libro, autor, paginas);
                        libreria.add(libros);
                        System.out.println("registrado con exito");
                    }
                }
                case 2 -> {
                    for (Libro lib : libreria) {

                        System.out.println("----------------------");
                        int pos = libreria.indexOf(lib);
                        System.out.println("Posicion: " + (pos + 1));
                        System.out.println(lib.toString());
                        System.out.println("----------------------");
                    }
                }
                case 3 -> {
                    boolean encontrado = false;
                    System.out.println("Ingrese el nombre del libro");
                    String nombre = sc.nextLine();
                    for (Libro lib : libreria) {
                        if (nombre.equalsIgnoreCase(lib.getTitulo())) {
                            int pos = libreria.indexOf(lib);
                            System.out.println("Posicion: " + (pos + 1));
                            System.out.println(lib);
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("El libro no esta registrado");
                    }
                }
                case 4 -> {
                    boolean encontrado = false;
                    Libro eliminar = null;
                    System.out.println("Ingrese el nombre del libro");
                    String nombre = sc.nextLine();
                    for (Libro lib : libreria) {
                        if (nombre.equalsIgnoreCase(lib.getTitulo())) {
                            encontrado = true;
                            eliminar = lib;
                        }
                    }
                    if (eliminar != null) {
                        libreria.remove(eliminar);
                    }
                    if (encontrado == false) {
                        System.out.println("El libro no esta registrado");
                    }
                }
                case 5 -> {
                    fin = true;
                }
                default -> {
                    System.out.println("El valor ingresado no es valido");
                }
            }
        } while (fin == false);
        sc.close();
    }
}
