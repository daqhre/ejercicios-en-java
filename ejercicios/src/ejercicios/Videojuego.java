/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Videojuego {
    private String nombre;
    private String genero;
    private int horas;
    //constructor
    public Videojuego(String nombre, String genero, int horas) {
        this.nombre = nombre;
        this.genero = genero;
        this.horas = horas;
    }
    public void mostrarDatos(){
        System.out.println("El nombre del videojuego es: " + getNombre());
        System.out.println("El genero del videojuego es; " + getGenero());
        System.out.println("Las horas jugadas son: " + getHoras());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas > 0){
        this.horas = this.horas + horas;
        } else {
            System.out.println("el dato que ingreso no es valido");
        }
    }
}
