/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.main;

import inf.uva.ipc.vista.StateMachine;
import inf.uva.ipc.vista.VistaCajero;
import inf.uva.ipc.vista.VistaMenu;
import inf.uva.ipc.vista.VistaCambiarPin;
import inf.uva.ipc.vista.VistaTransferencia;

/**
 *
 * @author alvdela viccall
 */
public class Main {
    
    private static StateMachine stateMachine;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        stateMachine = new StateMachine();
    }
    
    /**
     * Retorna la maquina de estados.
     * @return stateMachine
     */
     public static StateMachine getStateMachine(){
        return stateMachine;
    }
}
