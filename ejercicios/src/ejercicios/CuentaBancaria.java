/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author dairo
 */
public class CuentaBancaria {
    //etiquetas de la clase
    private int saldo;
    private String titular;
    //metodos getters y setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        } else {
            System.out.println("el valor ingresado no es valido");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(!titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("el valor ingresado no es valido");
        }
    }
    
    //metodo depositar
    public void depositar(int saldo){
        saldo = getSaldo() + saldo;
        setSaldo(saldo);
    }
    //metodo para retirar saldo
    public void retirar(int saldo){
        if(getSaldo() < saldo){
            System.out.println("la cantidad que desea retirar es mayor al saldo de la cuenta");
        } else {
        saldo = getSaldo() - saldo;
        setSaldo(saldo);
        }
        
    }
    //metodo para mostrar los datos
    public void mostrardatos(){
        System.out.println("El titular de la cuenta es " + getTitular());
        System.out.println("El saldo de la cuenta es " + getSaldo());
    }
    
}
