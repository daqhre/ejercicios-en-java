/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Programador extends Empleados {
    private final String Lenguaje;

    public Programador(String Lenguaje, String nombre, int salario) {
        super(nombre, salario);
        this.Lenguaje = Lenguaje;
    }
    
    public String getLenguaje() {
        return Lenguaje;
    }
    
    @Override
    public void trabajar() {
        System.out.println("Trabaja creando programas");
    }
    @Override
    public void mostrarDatos(){
        System.out.println(getNombre());
        System.out.println(getSalario());
        System.out.println(getLenguaje());
    }
}
