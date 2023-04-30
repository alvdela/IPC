/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.vista;

import inf.uva.ipc.modelo.*;
import java.util.ArrayList;
/**
 *
 * @author viccall, alvdela
 */
public class ControladorCambiarPin {

    private VistaCambiarPin vista;
    private Modelo modelo;

    /**
     * Crea un nuevo controlador para la vista cambiar pin.
     * @param vista, vista de cambiar el pin
     * @param modelo , modelo del sistema
     */
    public ControladorCambiarPin(VistaCambiarPin vista, Modelo modelo) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    /**
     * Método para volver al menú principal.
     */
    public void procesarCancelButton() {
        vista.regresaAMenu();
    }
    
    /**
     * Procesa lo que ocurre al presionar el boton confirmar, comrueba que todo este bien y cambia el pin de la cuenta.
     */
    public void procesarConfirmarPin() {
        if (!vista.devuelvePinAnt().isEmpty() && !vista.devuelvePinNuev().isEmpty() && !vista.devuelvePinNuev2().isEmpty()) {
            if (procesarCampos()) {
                String pinA = modelo.getPin();
                if (Integer.parseInt(pinA) != Integer.parseInt(vista.devuelvePinAnt())) {
                    vista.setError("El pin antiguo no es correcto.");
                } else {
                    if (Integer.parseInt(vista.devuelvePinNuev()) == Integer.parseInt(vista.devuelvePinNuev2())) {
                        if (vista.devuelvePinNuev().length() == 4) {
                            vista.cambioCorrecto();
                            modelo.setPin(vista.devuelvePinNuev());
                            vista.cleanPin();
                        } else {
                            vista.setError("El pin introducido no es valido.");
                        }
                    } else {
                        vista.setError("El pin nuevo no coincide.");
                    }
                }
            } else {
                vista.setError("Se han introducido caracteres invalidos.");
            }
        }else{
            vista.setError("Hay campos vacios.");
        }
    }
    
    /**
    * Se ocupa de comprobar que los campos introducidos en la vista sean correctos.
    * @return camposBien 
    */
    private boolean procesarCampos() {
        boolean camposBien = true;
        ArrayList<String> pin = new ArrayList<>();
        pin.add(vista.devuelvePinAnt());
        pin.add(vista.devuelvePinNuev());
        pin.add(vista.devuelvePinNuev2());
        for (int i = 0; i < pin.size(); i++) {
            String s = pin.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) < '0' || s.charAt(j) > '9') {
                    camposBien = false;
                }
            }
        }
        return camposBien;
    }
}
