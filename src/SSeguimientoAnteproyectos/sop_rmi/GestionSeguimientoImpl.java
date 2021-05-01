/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.clsFormatosDTO2;
import SSeguimientoAnteproyectos.dto.clsResolucionDTO;
import SSeguimientoAnteproyectos.utilidades.GestionFicheros;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GestionSeguimientoImpl extends UnicastRemoteObject implements GestionSeguimientoINT {

    private ArrayList<clsResolucionDTO> listaResoluciones;
    private ArrayList<clsFormatosDTO2> listaHistorial;
    private boolean auxRegistrarResolucion = false;
    private boolean auxRegistrarFormatos = false;
    private GestionFicheros objG;
    private String numR ;
    private String fecha = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
    private String ficheroHistorial = "HistorialTGI.txt";
    private String ficheroResolucion = "ListadoTGIAprobados.txt";

    public GestionSeguimientoImpl() throws RemoteException {
        super();
        listaResoluciones = new ArrayList();
        listaHistorial = new ArrayList();
        objG = new GestionFicheros();
    }
    
    @Override
    public boolean RegistrarHistorial(clsFormatosDTO2 objFormatos) throws RemoteException {
        boolean r = objG.escribirEnHistorial(ficheroHistorial, objFormatos);
        if (r) {
            System.out.println("Registro Historial exitoso");
        }else{
            System.out.println("Error al registrar historial");
        }
        return true;
    }

    @Override
    public boolean RegistrarResolucion(int idAnteproyecto) throws RemoteException {
        numR = generarCodigoR();
        clsResolucionDTO objResolucion = new clsResolucionDTO(numR,fecha,idAnteproyecto);
        boolean r = objG.escribirEnResolucion(ficheroResolucion, objResolucion);
        if (r) {
            System.out.println("Registro Resolucion exitoso");
        }else{
            System.out.println("Error al registrar resolucion");
        }
        return r;
    }
    public String generarCodigoR(){
        String codigo = "8.4.2-90.14/";
        ArrayList<clsResolucionDTO> aux;
        int numero = 0;
        try {
            aux = ConsultarResoluciones();
            numero = aux.size()+1;
        } catch (RemoteException ex) {
            System.out.println("ocurrio un error al genera codigo");
        }
        
        Formatter frmt = new Formatter();
        frmt.format("%03d",numero);
        codigo = codigo + frmt;
        return codigo;
        
    }
    @Override
    public ArrayList<clsResolucionDTO> ConsultarResoluciones() throws RemoteException {
        listaResoluciones = objG.leerResolucion(ficheroResolucion);
        return listaResoluciones;
    }

    @Override
    public ArrayList<clsFormatosDTO2> ConsultarHistorial() throws RemoteException {
        listaHistorial = objG.leerHistorial(ficheroHistorial);
        return listaHistorial;
    }

}
