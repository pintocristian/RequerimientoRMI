/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.clsFormatosDTO2;
import SSeguimientoAnteproyectos.dto.clsResolucionDTO;
import SSeguimientoAnteproyectos.utilidades.GestionFicheros;
import SSeguimientoAnteproyectos.utilidades.ObjectOutputStreamV2;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
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
    private String numR = "8.4.2-90.14/453";
    private String fecha = "2017";
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
        objG.escribirEnHistorial(ficheroHistorial, objFormatos);
        return true;
    }

    @Override
    public boolean RegistrarResolucion(int idAnteproyecto) throws RemoteException {
        clsResolucionDTO objResolucion = new clsResolucionDTO(numR,fecha,idAnteproyecto);
        objG.escribirEnResolucion(ficheroResolucion, objResolucion);
        return true;
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
