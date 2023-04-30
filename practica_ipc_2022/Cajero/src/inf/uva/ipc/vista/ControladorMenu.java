/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.vista;

/**
 *
 * @author viccall, alvdela
 */
public class ControladorMenu {

    private VistaMenu vista;
    
    /**
     * Crea un controlador para la vista menu.
     * @param vista, vista del menu.
     */
    public ControladorMenu(VistaMenu vista){
        this.vista = vista;
    }
  
    /**
     * Cambia la vista a la vista del cajero.
     */
    public void procesarBotonCajero() {
        vista.cambiarACajero();
    }
    
    /**
     * Cambia la vista a la vista de cambiar pin.
     */
    public void procesarBotonCambiarPin() {
        vista.cambiarACambiarPin();
    }
    
    /**
     * Cambia la vista a la vista de realizar transfrencia.
     */
    public void procesarBotonTransferencia() {
        vista.cambiarATrasferencia();
    }  
}
