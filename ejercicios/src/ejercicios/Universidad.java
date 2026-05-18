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
public class Universidad {

    public static void main(String args[]) {
        ArrayList<Alumno> estudiantes = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int codigo;
            String nombre;
            String genero;
            int edad;
            boolean fin = false;
            do {
                System.out.println("""
                                               Bienvenido al menu de la universidad
                                               ¿Que desea hacer?
                                               1. Agregar estudiante
                                               2. Mostrar estudiantes
                                               3. Eliminar estudiante
                                               4. Buscar estudiante
                                               5. salir
                                               """);
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1 -> {
                        boolean existe = false;
                        System.out.println("Ingrese el codigo del estudiante");
                        codigo = sc.nextInt();
                        sc.nextLine();
                        
                        for (Alumno estudiante : estudiantes) {
                            if (codigo == estudiante.getCodigo()) {
                                existe = true;
                            }
                        }
                        boolean existe2 = false;
                        
                        if (existe) {
                            while (!existe2) {
                                System.out.println("El codigo que ingreso ya existe");
                                System.out.println("¿Que desea hacer?");
                                System.out.println("""
                                                                               1. Ingresar un codigo nuevo
                                                                               2. Asignar un codigo automaticamente
                                                                               3. Salir
                                                                               """);
                                int opcion2 = sc.nextInt();
                                sc.nextLine();
                                switch (opcion2) {
                                    case 1 -> {
                                        System.out.println("Ingrese el codigo del estudiante");
                                        codigo = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println(codigo);
                                        existe2 = true;
                                        
                                    }
                                    case 2 -> {
                                        codigo = (estudiantes.size() + 1);
                                        System.out.println(codigo);
                                        existe2 = true;
                                        
                                    }
                                    case 3 -> {
                                        existe2 = true;
                                    }
                                    default -> {
                                        System.out.println("La opcion que ingreso no es valida");
                                        System.out.println("POR FAVOR iNTENTELO DE NUEVO");
                                    }
                                }
                            }
                        } 
                            System.out.println("Ingrese el nombre del estudiante");
                            nombre = sc.nextLine();
                            System.out.println("Ingrese el genero del estudiante");
                            genero = sc.nextLine();
                            System.out.println("Ingrese la edad del estudiante");
                            edad = sc.nextInt();
                            Alumno alumno = new Alumno(codigo, nombre, genero, edad);
                            estudiantes.add(alumno);
                        
                    }
                    case 2 -> {
                        for (Alumno estudiante : estudiantes) {
                            System.out.println("----------------");
                            System.out.println("Codigo: " + estudiante.getCodigo());
                            System.out.println("Nombre: " + estudiante.getNombre());
                            System.out.println("----------------");
                        }
                    }
                    case 3 -> {
                        boolean existe = false;
                        Alumno alum = null;
                        System.out.println("Ingrese el codigo del estudiante");
                        int codi = sc.nextInt();
                        for (Alumno estudiante : estudiantes) {
                            if (codi == estudiante.getCodigo()) {
                                alum = estudiante;
                                existe = true;
                            }
                        }
                        if (existe) {
                            estudiantes.remove(alum);
                        } else {
                            System.out.println("No existe alumno con ese codigo");
                        }
                    }
                    case 4 -> {
                        boolean encontrado = false;
                        boolean fin2 = false;
                        System.out.println("Ingrese el codigo del estudiante");
                        int codi = sc.nextInt();
                        for (Alumno estudiante : estudiantes) {
                            if (codi == estudiante.getCodigo()) {
                            encontrado = true;
                            }  
                        }
                        if(encontrado){
                            for (Alumno estudiante : estudiantes) {
                                
                                System.out.println("Codigo: " + estudiante.getCodigo());
                                System.out.println("Nombre: " + estudiante.getNombre());
                                while (!fin2) {
                                    System.out.println("¿Que desea hacer?");
                                    System.out.println("""
                                                                                       1. Mostrar los datos del estudiante
                                                                                       2. Añadir curso
                                                                                       3. Mostrar cursos
                                                                                       4. Eliminar curso
                                                                                       5. Salir
                                                                                       """);
                                    int opcion2 = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcion2) {
                                        case 1 -> {
                                            System.out.println(estudiante.toString());
                                        }
                                        case 2 -> {
                                            boolean existe2 = false;
                                            System.out.println("Ingrese el nombre del curso");
                                            String nombrecurso = sc.nextLine();
                                            System.out.println("Ingrese el profesor del curso");
                                            String profesorcurso = sc.nextLine();
                                            System.out.println("Ingrese los creditos del curso");
                                            int creditoscurso = sc.nextInt();
                                            Curso curso = new Curso(nombrecurso, profesorcurso, creditoscurso);
                                            estudiante.agregarCurso(curso);
                                        }
                                        case 3 -> {
                                            estudiante.mostrarCursos();
                                        }
                                        case 4 -> {
                                            System.out.println("Ingrese el nombre del curso");
                                            String nomcurso = sc.nextLine();
                                            estudiante.eliminarCurso(nomcurso);
                                        }
                                        case 5 -> {
                                            fin2 = true;
                                        }
                                        default -> {
                                            System.out.println("El valor ingresado no es valido");
                                            System.out.println("POR FAVOR iNTENTELO DE NUEVO");
                                        }
                                    }
                                    
                                }
                            
                                
                            }
                        } else {
                            System.out.println("No existe estudiante registrado con ese codigo");
                        }
                    }
                    case 5 -> {
                        fin = true;
                    }
                }
                
            } while (!fin);
        } catch (Exception e){
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
