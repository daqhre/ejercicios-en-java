/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Perro extends Animal{
    private final String raza;

    public Perro(String raza, String nombre, int edad) {
        super(nombre, edad);
        this.raza = raza;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("El nombre del perro es " + getNombre());
                System.out.println("La raza del perro es " + getRaza());
                                 System.out.println("La edad del perro es " + getEdad());
    }
    @Override
    public void hacerSonido(){
        System.out.println("se reproduce un audio de un perro ladrando");
    }

    public String getRaza() {
        return raza;
    }
    
}
