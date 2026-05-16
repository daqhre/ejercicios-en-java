/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Diseñador extends Empleados{
    private final String Favorito;

    public Diseñador(String Favorito, String nombre, int salario) {
        super(nombre, salario);
        this.Favorito = Favorito;
    }

    public String getFavorito() {
        return Favorito;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println(getNombre());
        System.out.println(getSalario());
        System.out.println(getFavorito());
    }
    @Override
    public void trabajar(){
        System.out.println("trabaja creando diseños");
    }
}
