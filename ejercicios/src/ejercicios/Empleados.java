/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public abstract class Empleados {
    private final String nombre;
    private final int salario;

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Empleados(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public abstract void trabajar();
    public void mostrarDatos(){
    }
}
