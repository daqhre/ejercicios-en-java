/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;

/**
 *
 * @author dairo
 */
public class Alumno {

    private final int codigo;
    private final String nombre;
    private final String genero;
    private final int edad;

    public Alumno(int codigo, String nombre, String genero, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    ArrayList<Curso> cursos = new ArrayList<>();

    public void agregarCurso(Curso curso) {
        boolean existe = false;
        for (Curso curso1 : cursos) {
            if (curso.equals(curso1)) {
                existe = true;
            }
        }
        if (existe == true) {
            System.out.println("El alumno ya tiene Registrado el curso " + curso.getNombre());
            System.out.println("Por favor ingrese otro curso");
        } else {
            cursos.add(curso);
        }

    }

    public void mostrarCursos() {
        System.out.println("Los cursos del alumno son;");
        for (Curso curs : cursos) {
            int pos = cursos.indexOf(curs);
            System.out.println((pos + 1) + ". " + curs.toString());
        }
    }

    public void eliminarCurso(String curso) {
        boolean existe = false;
        Curso eliminar = null;
        for (Curso curso1 : cursos) {
            if (curso.equalsIgnoreCase(curso1.getNombre())) {
                eliminar = curso1;
                existe = true;
            }
        }
        if (existe == true) {
            cursos.remove(eliminar);
        } else {
            System.out.println("El curso que intenta elmininar no esta registrado "
                    + "en los cursos del estudiante");
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "Codigo: " + codigo + "Nombre = " + nombre + ", Genero = " + genero + ", edad = " + edad + '}';
    }

}
