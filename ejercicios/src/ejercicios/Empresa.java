/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Empresa {
    public static void main(String args[]){
    Empleados empleo [] = new Empleados[2];

    empleo [0]= new Programador("Java","Miguel",200);
    empleo [1]= new Diseñador("photoshop","Andres", 100);
   
        for (Empleados empleas : empleo) {
            empleas.mostrarDatos();
            empleas.trabajar();
            System.out.println("");
        }
    }
}
