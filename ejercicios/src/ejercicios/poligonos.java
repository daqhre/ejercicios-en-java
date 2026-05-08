/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author dairo
 */
public class poligonos {
    //metodo para calcular el area
    public int poligono(int lados,  int dlado){
        //calculando el area
        int area = (lados * dlado);
        //retorno del area
        return area;
       }
    
    
    
     public static void main(String[] args) {
         //llamo los metodos que voy a usar
          poligonos p = new poligonos();
       Scanner t = new Scanner(System.in);
       //ingreso de datos
         System.out.println("ingrese la altura");
         int l = t.nextInt();
         
         System.out.println("ingrese la base");
         int dl = t.nextInt();
        
         // se muestra los resultados
         System.out.println("el area de tu poligono es " + p.poligono(l, dl));
         
         
     
     }
}
