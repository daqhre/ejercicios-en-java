/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
import java.util.*;

public class adivinador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int Anum = aleatorio.nextInt(101-1) + 1;
        int intentos = 1;
        int numero = 0;
        boolean adivino = false;

        System.out.println("ADIVINA EL NUMERO ALEATORIO");
        System.out.println("""
                           Pista: debes ingresar un numero entre 0 y 100
                           si el numero que ingresas es mas alto que el numero aleatorio 
                           se indicara alto, si el numero es menos te dira menor,
                           si el numero es el numero aleatorio te dira correcto
                           """);
        System.out.println("TIENES 5 INTENTOS PARA ADIVINAR EL NUMERO");
        System.out.println(Anum);
        while (adivino == false) {
            System.out.println("ingresa un numero ");
            numero = sc.nextInt();
            if (intentos == 5) {
                System.out.println("Has gastado todos tus intentos");
                System.out.println("HAS PERDIDO");
                adivino = true;
            } else {
            if (numero == Anum) {
                System.out.println("El Numero que ingresaste es correcto");
                System.out.println("HAS GANADO");
                adivino = true;
            } else if (numero < Anum) {
                System.out.println("El Numero que ingresaste es MENOR");
                System.out.println("Intentalo otra vez");
                adivino = false;
            } else if (numero > Anum) {
                System.out.println("El Numero que ingresaste es ALTO");

                adivino = false;
            }
            

            

            intentos++;
            }
        }

    }

}
