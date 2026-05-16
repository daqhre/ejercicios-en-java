/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()){
            System.out.println("por favor ingrese un nombre");
        } else {
        this.nombre = nombre;}
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
       if(precio < 0){
           System.out.println("por favor ingresar un valor");
       } else {
        this.precio = precio;
       }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad < 0){
           System.out.println("por favor ingresar un valor");
       } else {
        this.cantidad = cantidad;
       }
        
    }
    
    public void mostrarDatos(){
        System.out.println("Producto: " + getNombre());
        System.out.println("Precio: " +  getPrecio());
        System.out.println("La cantidad disponible es " + getCantidad());
    }
    
}
