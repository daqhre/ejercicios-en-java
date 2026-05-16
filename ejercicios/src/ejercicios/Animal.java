/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class  Animal {
    private final String nombre;
    private final int edad;
     public void hacerSonido(){
         System.out.println("no hay audios");
     }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
     
    public void mostrarDatos(){
        System.out.println("no hay datos");
    }

    public String getNombre() {
        return nombre;
    }

   

    public int getEdad() {
        return edad;
    }

        
            
            }
