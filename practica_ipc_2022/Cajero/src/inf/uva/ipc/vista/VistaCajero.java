/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.vista;

import inf.uva.ipc.main.Main;
import inf.uva.ipc.modelo.Modelo;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author alvdela viccall
 */
public class VistaCajero extends javax.swing.JFrame {

    private ControladorCajero miControlador;
    private Modelo miModelo;

    /**
     * Crea la vista del caero y su controlador.
     * @param miModelo, modelo del sistema.
     */
    public VistaCajero(Modelo miModelo) {
        initComponents();
        ButtonCancel.setBackground(Color.red);
        ButtonBorrar.setBackground(Color.yellow);
        ButtonAcept.setBackground(Color.green);
        salirText.setBackground(Color.white);
        ImageIcon iconoTarjeta = new ImageIcon("src/inf/uva/ipc/vista/icono.jpg");
        Imagen1.setIcon(new ImageIcon(iconoTarjeta.getImage().getScaledInstance(230, 190, Image.SCALE_SMOOTH)));

        //Elementos MVC
        this.miModelo = miModelo;
        miControlador = new ControladorCajero(this, miModelo);
        //Inicia la interfaz
        miControlador.iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Tarjeta = new javax.swing.JButton();
        Imagen1 = new javax.swing.JLabel();
        DineroButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantallaSecundaria = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        ButtonSaldo = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        ButtonRetirar = new javax.swing.JButton();
        ButtonTransac = new javax.swing.JButton();
        dineroText = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        saldoText = new javax.swing.JLabel();
        salirText = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        retirarText = new javax.swing.JLabel();
        transacText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        centralText = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonNull3 = new javax.swing.JButton();
        ButtonNull1 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonNull2 = new javax.swing.JButton();
        ButtonAcept = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(0, 0));

        jPanel3.setLayout(new java.awt.GridLayout(4, 0));

        Tarjeta.setText("Tarjeta");
        Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaActionPerformed(evt);
            }
        });
        jPanel3.add(Tarjeta);
        jPanel3.add(Imagen1);

        DineroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DineroButtonActionPerformed(evt);
            }
        });
        jPanel3.add(DineroButton);

        pantallaSecundaria.setEditable(false);
        pantallaSecundaria.setColumns(20);
        pantallaSecundaria.setRows(5);
        pantallaSecundaria.setPreferredSize(new java.awt.Dimension(100, 100));
        jScrollPane2.setViewportView(pantallaSecundaria);

        jPanel3.add(jScrollPane2);

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        ButtonSaldo.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaldoActionPerformed(evt);
            }
        });
        jPanel7.add(ButtonSaldo);

        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        jPanel7.add(ButtonSalir);

        jPanel5.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        ButtonRetirar.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetirarActionPerformed(evt);
            }
        });
        jPanel8.add(ButtonRetirar);

        ButtonTransac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTransacActionPerformed(evt);
            }
        });
        jPanel8.add(ButtonTransac);

        jPanel5.add(jPanel8, java.awt.BorderLayout.LINE_START);

        dineroText.setEditable(false);
        jPanel5.add(dineroText, java.awt.BorderLayout.PAGE_END);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setLayout(new java.awt.GridLayout(2, 0));

        saldoText.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.add(saldoText);

        salirText.setBackground(new java.awt.Color(255, 255, 255));
        salirText.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel10.add(salirText);

        jPanel9.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel11.setLayout(new java.awt.GridLayout(2, 0));

        retirarText.setToolTipText("");
        jPanel11.add(retirarText);

        transacText.setBackground(new java.awt.Color(255, 255, 255));
        transacText.setPreferredSize(new java.awt.Dimension(80, 80));
        transacText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel11.add(transacText);

        jPanel9.add(jPanel11, java.awt.BorderLayout.LINE_START);

        centralText.setEditable(false);
        centralText.setColumns(20);
        centralText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        centralText.setRows(5);
        centralText.setBorder(null);
        centralText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(centralText);

        jPanel9.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(4, 4));

        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        jPanel6.add(Button1);

        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        jPanel6.add(Button2);

        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        jPanel6.add(Button3);

        ButtonCancel.setText("Cancelar");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });
        jPanel6.add(ButtonCancel);

        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        jPanel6.add(Button4);

        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        jPanel6.add(Button5);

        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        jPanel6.add(Button6);

        ButtonBorrar.setText("Borrar");
        ButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarActionPerformed(evt);
            }
        });
        jPanel6.add(ButtonBorrar);

        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        jPanel6.add(Button7);

        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        jPanel6.add(Button8);

        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        jPanel6.add(Button9);
        jPanel6.add(ButtonNull3);
        jPanel6.add(ButtonNull1);

        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        jPanel6.add(Button0);
        jPanel6.add(ButtonNull2);

        ButtonAcept.setText("Aceptar");
        ButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptActionPerformed(evt);
            }
        });
        jPanel6.add(ButtonAcept);

        jPanel4.add(jPanel6);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        miControlador.procesarEventoNumero(1);
    }//GEN-LAST:event_Button1ActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        miControlador.procesarEventoCancelar();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarActionPerformed
        miControlador.procesarEventoBorrar();
    }//GEN-LAST:event_ButtonBorrarActionPerformed

    private void ButtonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptActionPerformed
        miControlador.procesarEventoAceptar();
    }//GEN-LAST:event_ButtonAceptActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        miControlador.procesarEventoSalir();
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetirarActionPerformed
        miControlador.procesarEventoRetirar();
    }//GEN-LAST:event_ButtonRetirarActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        miControlador.procesarEventoNumero(2);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        miControlador.procesarEventoNumero(3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        miControlador.procesarEventoNumero(4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        miControlador.procesarEventoNumero(5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        miControlador.procesarEventoNumero(6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        miControlador.procesarEventoNumero(7);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        miControlador.procesarEventoNumero(8);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        miControlador.procesarEventoNumero(9);
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        miControlador.procesarEventoNumero(0);
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonTransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTransacActionPerformed
        miControlador.procesarEventoMovimientos();
    }//GEN-LAST:event_ButtonTransacActionPerformed

    private void ButtonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaldoActionPerformed
        miControlador.procesarEventoConsultaSaldo();
    }//GEN-LAST:event_ButtonSaldoActionPerformed

    private void DineroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DineroButtonActionPerformed
        miControlador.procesarRecogerDinero();
    }//GEN-LAST:event_DineroButtonActionPerformed

    private void TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaActionPerformed
        miControlador.procesarEventoTarjeta();
    }//GEN-LAST:event_TarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAcept;
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonNull1;
    private javax.swing.JButton ButtonNull2;
    private javax.swing.JButton ButtonNull3;
    private javax.swing.JButton ButtonRetirar;
    private javax.swing.JButton ButtonSaldo;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JButton ButtonTransac;
    private javax.swing.JButton DineroButton;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JButton Tarjeta;
    private javax.swing.JTextArea centralText;
    private javax.swing.JTextField dineroText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pantallaSecundaria;
    private javax.swing.JLabel retirarText;
    private javax.swing.JLabel saldoText;
    private javax.swing.JLabel salirText;
    private javax.swing.JLabel transacText;
    // End of variables declaration//GEN-END:variables

    /**
     * Muestra el dinero que se desea retirar por pantalla
     */
    public void solicitaDinero() {
        centralText.setText("Introduzca el dinero que desea retirar,\ndespues pulse aceptar.\n" + miModelo.getNumIntro());
        dineroText.setText("" + miModelo.getNumIntro() + "€");
    }

    /**
     * Activa o desactiva los elementos de la interfaz a excepción del elemento
     * introducir tarjeta.
     *
     * @param b b = true --> activa || b = false --> desactiva
     */
    public void desactivarActivar(boolean b) {
        Button0.setEnabled(b);
        Button1.setEnabled(b);
        Button2.setEnabled(b);
        Button3.setEnabled(b);
        Button4.setEnabled(b);
        Button5.setEnabled(b);
        Button6.setEnabled(b);
        Button7.setEnabled(b);
        Button8.setEnabled(b);
        Button9.setEnabled(b);
        ButtonAcept.setEnabled(b);
        ButtonBorrar.setEnabled(b);
        ButtonCancel.setEnabled(b);
        ButtonNull1.setEnabled(b);
        ButtonNull2.setEnabled(b);
        ButtonNull3.setEnabled(b);
        ButtonRetirar.setEnabled(b);
        ButtonSaldo.setEnabled(b);
        ButtonSalir.setEnabled(b);
        ButtonTransac.setEnabled(b);
        DineroButton.setEnabled(b);
    }

    /**
     * Solicita el pin por pantalla y muestra el pin que esta introduciendo
     * el usuario.
     * @param pin, pin que introduce el usuario
     */
    public void solicitaPin() {
        if (miModelo.getPinIntro().isEmpty()) {
            centralText.setText("Por favor introduzca el pin de la tarjeta.");
            salirText.setText("");
        } else if (miControlador.getIntentos() == 3) {
            centralText.setText("Pin: " + miModelo.getPinIntro() + "\n"
                    + "Numero de intentos restantes: " + miControlador.getIntentos());
        }
        if (miControlador.getIntentos() < 3) {
            centralText.setText("Pin incorrecto" + "\n" + "Pin: " + miModelo.getPinIntro()
                    + "\n" + "Numero de intentos restantes: " + miControlador.getIntentos());
        }
    }

    /*
    * Muestra los movimientos
    * @param mov, string con toda la informacion de los movimientos.
     */
    public void mostrarMovimientos(String mov) {
        pantallaSecundaria.setText(mov);
    }

    /**
     * Elimina todo el texto de la pantalla
     */
    public void resetText() {
        centralText.setText("");
        retirarText.setText("");
        transacText.setText("");
        saldoText.setText("");
        salirText.setText("");
    }
    
    /**
     * Enseña al lado de los botones sus funciones.
     */
    public void muestraOperaciones() {
        centralText.setText("Selecione la operacion que desea realizar.");
        retirarText.setText("Retirar dinero");
        transacText.setText("<html>Consultar\ntransacciones");
        saldoText.setText("Consultar saldo");
        salirText.setText("Salir");
        dineroText.setText("");
    }
    /**
     * Avisa al usuario de que ha utilicidado todos los intentos para
     * introducir el pin, y desactiva el cajero.
     */
    void errorPin() {
        centralText.setText("Pin incorrecto demasiadas veces,\nse bloqueará la tarjeta");
        desactivarActivar(false);
        Tarjeta.setEnabled(false);
    }
    
    /**
     * Muestra el saldo de la cuenta.
     * @param saldo = string con la cantidad de dinero.
     */
    public void mostrarSaldo() {
        centralText.setText(miModelo.getSaldo() + "€");
    }

    /**
     * Notifica al usuario si la cantidad que se desea extraer no es multiplo de
     * 10
     */
    void numeroIncorrecto() {
        centralText.setText("Introduzca el dinero que desea retirar,\ndespues pulse aceptar."
                + "\nError: el numero debe ser multiplo de 10.\n" + miModelo.getNumIntro());
        dineroText.setText("" + miModelo.getNumIntro() + "€");
    }

    /**
     * Comunica al usuario si la operacion de retirar dinero se ha realizado con
     * exito y las acciones que puede realizar a continuacion.
     *
     * @param b = true --> se ha retirado el dinero
     * @param b = false --> no hay saldo suficiente en la cuenta
     */
    public void operacionRetirar(boolean b) {
        if (b) {
            centralText.setText("Operacion realizada con exito."
                    + "\nPulse cancelar si desea realizar otra\noperacion."
                    + "\nTecle una nueva cantidad si desea retirar\notra cantidad de dinero."
                    + "\nPulse salir si no desea realizar ninguna\notra operacion.");
            salirText.setText("Salir");
            dineroText.setText("0€");
        } else {
            centralText.setText("Error: no dispone de suficiente saldo en la \ncuenta."
                    + "\nPulse cancelar si desea realizar alguna otra\noperacion."
                    + "\nTecle una nueva cantidad si desea retirar\notra cantidad de dinero."
                    + "\nPulse salir si no desea realizar ninguna\notra operacion.");
            salirText.setText("Salir");
        }
    }
    /**
     * Solicita al usuario que recoga su dinero
     * @param recogido  boolean que notifica de si se ha recogido el dinero.
     */
    public void recogerDinero(boolean recogido) {
        if (!recogido) {
            centralText.setText("Por favor recoja su dinero");
            ImageIcon iconoDinero = new ImageIcon("src/inf/uva/ipc/vista/dinero.png");
            DineroButton.setIcon(new ImageIcon(iconoDinero.getImage().getScaledInstance(200, 120, Image.SCALE_SMOOTH)));
        }else{
            DineroButton.setIcon(null);
        }
    }
    
    /**
     * Activa o desactiva el boton que simula la introducción de una tarjeta.
     * @param tarjeta = true, se activa el boton
     * @param tarjeta = false, se inhabilita
     */
    public void activarDesactivarTarjeta(boolean tarjeta){
        Tarjeta.setEnabled(tarjeta);
    }

    /**
     * Manda un mensaje inicial al usuario indicando que debe hacer
     */
    void mensajeInicial() {
        centralText.setText("Para comenzar introduzca su tarjeta.\nPulse salir para volver al menu.");
        ButtonSalir.setEnabled(true);
        salirText.setText("Salir");
    }
    
    /**
     * Regresa al menu principal.
     */
    public void regresaAMenu(){
        Main.getStateMachine().abrirVentanaMenu();
    }
}