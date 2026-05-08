/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class Sucesionfibo {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long c = 0;
     for(int i = 0; i<=50; i++){
        
         System.out.println(c);
         c = a + b;
          
         b = a;
         a = c;
     }
    
    }
}
