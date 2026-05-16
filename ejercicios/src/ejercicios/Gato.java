/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Gato extends Animal{
    private final String color;

    public Gato(String color, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("El nombre del gato es " + getNombre());
                System.out.println("El Color del gato es " + getColor());
                                 System.out.println("La edad del gato es " + getEdad());
    }

    @Override
    public void hacerSonido(){
        System.out.println("Se reproduce un audio de un gato maullando");
    }

    public String getColor() {
        return color;
    }
    
}
