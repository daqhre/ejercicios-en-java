/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Curso {

    private final String nombre;
    private final String profesor;
    private final int creditos;

    public Curso(String nombre, String profesor, int creditos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", profesor=" + profesor + ", creditos=" + creditos + '}';
    }

}
