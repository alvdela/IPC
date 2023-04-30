/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.vista;

import javax.swing.JFrame;
import inf.uva.ipc.modelo.Modelo;

/**
 *
 * @author viccall, alvdela
 */
public class StateMachine {

    private JFrame currentState;
    private Modelo modelo;

    /**
     * Crea una una nueva maquina de estados y el modelo del sistema.
     */
    public StateMachine() {
        modelo = new Modelo();
        abrirVentanaMenu();
    }

    /**
     * Abre la ventana del menu de inicio.
     */
    public void abrirVentanaMenu() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (currentState != null) {
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaMenu();
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Abre la ventana de cambiar pin.
     */
    public void abrirVentanaCambiarPin() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (currentState != null) {
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaCambiarPin(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Abre la ventana del cajero.
     */
    public void abrirVentanaCajero() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (currentState != null) {
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaCajero(modelo);
                currentState.setVisible(true);
            }
        });
    }

    /**
     * Abre la ventana realizar transferencia.
     */
    public void abrirVentanaTransferencia() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (currentState != null) {
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaTransferencia(modelo);
                currentState.setVisible(true);
            }
        });
    }

}
