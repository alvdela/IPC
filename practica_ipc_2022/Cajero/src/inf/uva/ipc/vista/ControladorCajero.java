/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf.uva.ipc.vista;

import inf.uva.ipc.modelo.Modelo;
import java.time.LocalDate;

/**
 *
 * @author alvdela viccall
 */
public class ControladorCajero {

    private VistaCajero miVista;
    private Modelo miModelo;
    private EstadoCajero estado;
    private int intentos;

    /**
     * Crea un nuevo controlador para la vista del cajero.
     * @param v, vista del cajero
     * @param m, modelo del sistema
     */
    public ControladorCajero(VistaCajero v, Modelo m) {
        miVista = v;
        miModelo = m;
    }

    /**
     * Retorna el numero de intentos restantes del usuario para introducir el
     * pin.
     *
     * @return intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * Establece el numero de intentos para desbloquear la tarjeta
     *
     * @param i numero de intentos
     */
    private void setIntentos(int i) {
        intentos = i;
    }

    /**
     * Procesa la acción de introducir tarjeta.
     */
    public void procesarEventoTarjeta() {
        if (estado.equals(EstadoCajero.Desactivado)) {
            estado = EstadoCajero.PIN;
            miVista.desactivarActivar(true);
            miVista.solicitaPin();
            miVista.activarDesactivarTarjeta(false);
        }
    }

    /**
     * Inicia el cajero
     */
    public void iniciar() {
        miVista.desactivarActivar(false);
        miVista.activarDesactivarTarjeta(true);
        estado = EstadoCajero.Desactivado;
        setIntentos(3);
        miVista.resetText();
        miVista.mensajeInicial();
    }

    /**
     * Procesa la pulsación de un numero del cajero.
     *
     * @param n numero de la tecla pulsada
     */
    public void procesarEventoNumero(int n) {
        if (estado.equals(EstadoCajero.PIN)) {
            if (miModelo.getPinIntro().length() < 4) {
                miModelo.addPinIntro(n);
                miVista.solicitaPin();
            }
        }
        if (estado.equals(EstadoCajero.Retirada)) {
            int dinero = miModelo.getNumIntro();
            dinero = dinero * 10 + n;
            miModelo.setNumIntro(dinero);
            miVista.resetText();
            miVista.solicitaDinero();
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar el boton cancelar
     */
    public void procesarEventoCancelar() {
        if (estado.equals(EstadoCajero.PIN)) {
            miModelo.cleanPinIntro();
            iniciar();
            //miVista.regresaAMenu();
        }
        if (estado.equals(EstadoCajero.Retirada)) {
            estado = EstadoCajero.Operacion;
            miModelo.setNumIntro(0);
            miVista.muestraOperaciones();
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar el boton borrar
     */
    public void procesarEventoBorrar() {
        if (estado.equals(EstadoCajero.Retirada)) {
            int num = miModelo.getNumIntro();
            num = num / 10;
            miModelo.setNumIntro(num);
            miVista.solicitaDinero();
        }
        if (estado.equals(EstadoCajero.PIN)) {
            miModelo.removePinIntro();
            miVista.solicitaPin();
        }
    }

    /**
     * Procesa la accion al pulsar mostrar movimientos.
     */
    public void procesarEventoMovimientos() {
        if (estado.equals(EstadoCajero.Operacion)) {
            String movimientos = "Listado de movimientos:\n"+ getMovimientos();
            miVista.mostrarMovimientos(movimientos);
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar el boton aceptar
     */
    public void procesarEventoAceptar() {
        if (estado.equals(EstadoCajero.PIN) && miModelo.getPinIntro().length() == 4) {
            if (miModelo.compruebaPin()) {
                estado = EstadoCajero.Operacion;
                miModelo.cleanPinIntro();
                miVista.muestraOperaciones();
            } else {
                miModelo.cleanPinIntro();
                setIntentos(getIntentos() - 1);
                if (getIntentos() == 0) {
                    miVista.errorPin();
                } else {
                    miVista.solicitaPin();
                }
            }
        }
        if (estado.equals(EstadoCajero.Retirada)) {
            if (miModelo.getNumIntro() % 10 == 0) {
                if (miModelo.getNumIntro() != 0) {
                    if (miModelo.getNumIntro() < miModelo.getSaldo()) {
                        miModelo.retiraDinero();
                        miModelo.setNumIntro(0);
                        estado = EstadoCajero.RecogerDinero;
                        miVista.recogerDinero(false);
                    } else {
                        miModelo.setNumIntro(0);
                        miVista.operacionRetirar(false);
                    }
                }
            } else {
                miVista.numeroIncorrecto();
            }
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar el boton consultar saldo
     */
    public void procesarEventoConsultaSaldo() {
        if (estado.equals(EstadoCajero.Operacion)) {
            String saldo = "Saldo disponible:\n";
            miVista.mostrarSaldo();
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar el boton salir
     */
    public void procesarEventoSalir() {
        if(estado.equals(EstadoCajero.Desactivado)){
            miVista.regresaAMenu();
        }
        if (estado.equals(EstadoCajero.Operacion) || estado.equals(EstadoCajero.Retirada)) {
            iniciar();
            miVista.regresaAMenu();
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar el boton retirar dinero
     */
    public void procesarEventoRetirar() {
        if (estado.equals(EstadoCajero.Operacion)) {
            estado = EstadoCajero.Retirada;
            miVista.resetText();
            miVista.solicitaDinero();
        }
    }

    /**
     * Procesa la accion que se ejecutara al pulsar recoger el dinero
     */
    public void procesarRecogerDinero() {
        if (estado.equals(EstadoCajero.RecogerDinero)) {
            estado = EstadoCajero.Retirada;
            miVista.recogerDinero(true);
            miVista.operacionRetirar(true);
        }
    }
    
    /**
     * Devuelve los movimientos por orden cronologico.
     * @return movs, movimientos ordenados.
     */
    public String getMovimientos(){
        String movs="";
        
        int n = miModelo.getMovimiento().keySet().size();
      
        LocalDate clavesArray[] = new LocalDate[n];
        int i = 0;
        for (LocalDate x : miModelo.getMovimiento().keySet())
            clavesArray[i++] = x;
        clavesArray=ordenar(clavesArray);
                i =0;
        while(i!=n){
            movs=movs+clavesArray[i]+"  "+miModelo.getMovimiento().get(clavesArray[i])+"\n";
            i++;
        }
        return(movs);
    }
    /**
     * Ordena el array
     * @param = datos, array a ordenar
     * @return clavesArrayOrdenadas, es datos pero ordenado
     */
    public LocalDate[] ordenar(LocalDate[] datos){
        LocalDate clavesArrayOrdenadas[] = datos;
        for(int i=0;i<(clavesArrayOrdenadas.length-1);i++){
            for(int j=i+1;j<clavesArrayOrdenadas.length;j++){
                if(clavesArrayOrdenadas[i].isAfter(clavesArrayOrdenadas[j])){
                    LocalDate variableauxiliar=clavesArrayOrdenadas[i];
                    clavesArrayOrdenadas[i]=clavesArrayOrdenadas[j];
                    clavesArrayOrdenadas[j]=variableauxiliar;
 
                }
            }
        }
        return(clavesArrayOrdenadas);
    }    
}
