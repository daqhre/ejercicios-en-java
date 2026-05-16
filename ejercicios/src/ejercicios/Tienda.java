/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class Tienda {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        boolean fin = false;
      ArrayList<Producto> produ = new ArrayList<>();
      do {
          System.out.println("""
                             Ingrese que opcion desea hacer
                             1. Agregar productos
                             2. Mostrar productos
                             3. Buscar producto
                             4. Eliminar producto
                             5. Salir
                             """);
          int opcion = sc.nextInt();
          sc.nextLine();
          switch (opcion){
              
              case 1 -> {
                          Producto productos = new Producto();
                        System.out.println("Ingrese el Nombre del producto");
                        String nombre = sc.nextLine();
                        productos.setNombre(nombre);
                        System.out.println("Ingrese el precio del producto");
                        int precio = sc.nextInt();
                        productos.setPrecio(precio);
                        System.out.println("ingrese la cantidad dispobiles del producto");
                        int cantidad = sc.nextInt();
                        productos.setCantidad(cantidad);
                        produ.add(productos);
              }
              case 2 ->{
                  for (Producto produ1 : produ) {
                      System.out.println("----------------------");
                      int pos = produ.indexOf(produ1);
                      System.out.println("Posicion: " + pos + 1);
            produ1.mostrarDatos();
            System.out.println("----------------------");
        }
              }
              case 3 ->{
                  boolean encontrado = false;
              System.out.println("Ingrese el nombre a buscar");
                    String nombreproducto = sc.nextLine();
              for (Producto produ1 : produ) {
                  if (nombreproducto.equalsIgnoreCase(produ1.getNombre())) {
                      int pos = produ.indexOf(produ1);
                      System.out.println("El producto está en la posición " + (pos + 1));
                      produ1.mostrarDatos();
                      encontrado = true;
                  } 
              }
              if(encontrado == false){
                  System.out.println("el producto no fue encontrado");
              }
              }
              case 4 -> {
                   boolean encontrado = false;
                  Producto eliminar = null;
              System.out.println("Ingrese el nombre a buscar");
                    String nombreproducto = sc.nextLine();
              for (Producto produ1 : produ) {
                  if (nombreproducto.equalsIgnoreCase(produ1.getNombre())) {
                     eliminar = produ1;
                     encontrado = true;
                 }
              }
                   if(eliminar != null){
              produ.remove(eliminar);
              }             
                  if(encontrado == false){
                  System.out.println("el producto ya fue removido");
              }
              }
              case 5 -> {
              fin = true;
              }
              default -> {
                  System.out.println("El valor ingresado no es valido");
              }
          }
        
      }while(fin == false);
        sc.close();
    }
}
