/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.modelo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


/**
 *
 * @author alvdela viccall
 */
public class Modelo {
    private int numIntro;
    private ArrayList<Integer> pinIntro;
    private Cuenta cuenta;
    private HashMap<LocalDate,String> movimientos;  
    
    public Modelo(){
        setNumIntro(0);
        pinIntro = new ArrayList<>();
        cuenta = new Cuenta("1234", 500);
        movimientos = new HashMap<>();
        movimientos.put(LocalDate.of(2022, 1, 10), "100");
        movimientos.put(LocalDate.of(2022, 2, 12), "200");
       
        
    }
    /*
    *Devuleve un HashMap con todos los movimientos de la cuenta
    *@return movimientos, HashMap con los movimientos
    */
    
    public HashMap<LocalDate,String> getMovimiento(){
        return movimientos;    
    }
    
    /**
     * Establece el numero introducido por el usuario.
     * @param i numero introducio por el usuario
     */
    public void setNumIntro(int i){
        numIntro = i;
    }
    
    /**
     * Devuelve el numero que ha introducido el usuario.
     * @return numIntro numero introducido
     */
    public int getNumIntro(){
        return numIntro;
    }
    
    /**
     * Establece el pin que ha introducido el usuario.
     * @param pin 
     */
    public void addPinIntro(int pin){
        pinIntro.add(pin);
    }
    /*
    *Devuelve el pin introducido
    *@return pin
    */
    public String getPinIntro(){
        String pin = "";
        for (int i = 0; i < pinIntro.size(); i++) {
            pin = pin + "" + pinIntro.get(i);
        }
        return pin;
    }
    
    /*
    *Borra un numero del pin
    */   
    public void removePinIntro(){
        if(!pinIntro.isEmpty())
            pinIntro.remove(pinIntro.size() - 1);
    }
    
    /*
    * Borra el pin
    */
    public void cleanPinIntro(){
        pinIntro = new ArrayList<>();
    }
    
    /**
     * Comprueba si el pin introducido coincide con el de la cuenta
     * @return true si coincide, false en caso contrario
     */
    public boolean compruebaPin(){
        if(getPinIntro().equals(cuenta.getPin()))
            return true;
        else
            return false;
    }
    
    /*
    *Devuelve el saldo
    *@return saldo
    */
    public int getSaldo(){
        int saldo=cuenta.getSaldo();
        return saldo;
    }
    /*
    * Saca dinero y registra el movimiento realizado.
    */
    public void retiraDinero() {
        cuenta.retirar(getNumIntro());
        addMovimiento(getNumIntro());
        
    }
    
    /*
    * Añade un movimiento a la lista de movimientos
    * @param numIntro, numero de dinero a añadir a la lista de movimientos
    */
    private void addMovimiento(int numIntro) {
        if(movimientos.containsKey(LocalDate.now())){
            String temp = "";
            temp = movimientos.get(LocalDate.now()) + ", " + numIntro;
            movimientos.replace(LocalDate.now(), temp);
        }else{
            movimientos.put(LocalDate.now(), String.valueOf(numIntro));
        }
    }
    
   /*
    * Devuelve el pin de la cuenta.
    * @return getPin string con el pin de la cuenta.
    */
   public String getPin(){
       return cuenta.getPin();
   }
   
   /*
   * Establece un nuevo pin.
   * @param pin ,string con un pin nuevo.
   */
   public void setPin(String pin){
       cuenta.setPin(pin);
   }
   
   /*
   * Realiza la operacion de transferir dinero.
   * @param num cantidad a transferir.
   */
   public void transferencia(int num){
       cuenta.retirar(num);
        addMovimiento(num);
   }
}
