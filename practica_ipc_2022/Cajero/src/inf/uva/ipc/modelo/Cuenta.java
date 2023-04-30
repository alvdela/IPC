/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.modelo;

/**
 *
 * @author alvdela viccall
 */ 
public class Cuenta {
    private String pin;
    private int saldo;
    
    public Cuenta(String pin, int saldo){
        setPin(pin);
        setSaldo(saldo);
    }
    /*
    *Establecer pin
    *@param= pin ,pin es un string con el pin
    */
    public void setPin(String pin) {
        this.pin = pin;
    }
    /*
    *Establece el saldo
    *@param= saldo,  numero entero con la cantidad de saldo a establecer.
    */
    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    /*
    *Devuelve el pin
    *@return pin , pin de la cuenta
    */
    public String getPin(){
        return pin;
    }
     /*
    *Devuelve el saldo
    *@return saldo , saldo de la cuenta
    */   
    public int getSaldo(){
        return saldo;
    }
    /*
    *resta dinero a la cuenta
    *@param= dinero , dinero a sacar
    */
    public void retirar(int dinero){
        saldo = saldo - dinero;
    }
}
