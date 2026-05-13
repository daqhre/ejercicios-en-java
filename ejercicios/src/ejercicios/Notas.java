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
public class Notas {
    //metodo para el estado del alumno
    public enum estadoalumno {
    Aprovado,
    Reprovado
    }
    public static void main(String args[]){
        //importaciones
    Scanner sc = new Scanner(System.in);
    //variables
     double promedio = 0;
    int notas;
    Double notaAlta = 0.0;
    Double notaBaja = 5.0;
    //ingreso de datos
        System.out.println("Las notas de los alumnos van del 0 a 5 puntos");
        System.out.println("ingresa la cantidad de notas que ingresaras");
        notas = sc.nextInt();
        //creacion de array
        Double [] Lista = new Double [notas];
        //ingreso de datos al array
    for(int i = 0; i < notas; i++ ){
        System.out.println("ingresa la nota " + (i+1));
        Lista[i] = sc.nextDouble();
    }
    //calculo de promedio y motrar las notas del alumno
    for (int i = 0; i < notas; i++){
        promedio = promedio + Lista[i];
    System.out.println("la nota " + (i+1) + " es " + Lista[i]);
    //para identificar la nota mas alta
    if(notaAlta <= Lista[i]){
    notaAlta = Lista[i];
    }
    //para identificar la nota mas baja
    if(notaBaja >= Lista[i]){
    notaBaja = Lista[i];
    }
    }
    //motrar el promedio del alumno
        System.out.println("el promedio del alumno es " + (promedio / notas));
        //mostrar el estado del alumno
        if(promedio < 3){
            System.out.println("el alumno fue " + estadoalumno.Reprovado);
        } else {
            System.out.println(" el alumno fue " + estadoalumno.Aprovado);
        }
        System.out.println("la nota mas alta fue " + notaAlta);
        System.out.println("la nota mas baja fue " + notaBaja);
    
    }
    
}
