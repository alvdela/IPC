/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.vista;

import inf.uva.ipc.modelo.Modelo;

/**
 *
 * @author viccall, alvdela
 */
public class ControladorTransferencia {

    private Modelo modelo;
    private VistaTransferencia vista;

    /**
     * Crea un cntrolador para la vista de realizar transferencia.
     * @param vista, vista realizar transferencia.
     * @param modelo, modelo del sistema.
     */
    public ControladorTransferencia(VistaTransferencia vista, Modelo modelo) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    /**
    * Hace que se regrese al menú.
    */
    public void procesarCancelButton() {
        vista.regresaAMenu();
    }
    
    /**
    * Comprueba que todos los campos de la ventana esten correctos y realiza las operaciones necesarias de la transferencia.
    */
    public void procesarConfirmar() {
        if (!vista.getTitular().isEmpty() && !vista.getCuenta().isEmpty() && !vista.getConcepto().isEmpty() && !vista.getCantidad().isEmpty()) {
            if (comprobarIBAN() && vista.getCuenta().length() == 24){//Aqui va lo del IBAN
                if (comprobarNum(vista.getCantidad())) {
                    if (Integer.parseInt(vista.getCantidad()) <= modelo.getSaldo()) {
                        modelo.setNumIntro(Integer.parseInt(vista.getCantidad()));
                        modelo.retiraDinero();
                        vista.setCorrecto();
                        modelo.setNumIntro(0);
                    } else {
                        vista.setError("No hay saldo suficiente.");
                    }
                } else {
                    vista.setError("Caracteres invalidos en la cantidad.");
                }
            }else{
                vista.setError("El IBAN no es valido.");
            }
        } else {
            vista.setError("Hay algun campo vacio.");
        }
    }
    
    /**
    * Comprueba que la cantidad de dinero sea correcta y no haya letras.
    * @return correcto
    */
    private boolean comprobarNum(String s) {
        boolean correcto = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                correcto = false;
            }
        }
        return correcto;
    }
    
    /**
     * Comprueba que el IBAN sea correcto.
     * @return correcto
     */
    private boolean comprobarIBAN(){
        boolean correcto = true;
        char c;
        String s = "";
        for(int i = 2; i < vista.getCuenta().length();i++){
            s = s + vista.getCuenta().charAt(i);
        }
        correcto = comprobarNum(s);
        c = vista.getCuenta().charAt(0);
        if(!Character.isUpperCase(c))
            correcto = false;
        c = vista.getCuenta().charAt(1);
        if(!Character.isUpperCase(c))
            correcto = false;
        return correcto;
    }
}
