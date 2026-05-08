/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class numeroprimo {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            int contador = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                contador++;
                
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }
    
    }
}
