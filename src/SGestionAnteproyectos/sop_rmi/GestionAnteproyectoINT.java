/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.clsConceptosDTO;
import SGestionAnteproyectos.dto.clsDirectorDTO;
import SGestionAnteproyectos.dto.clsFormatoTiADTO;
import SGestionAnteproyectos.dto.clsFormatoTiBDTO;
import SGestionAnteproyectos.dto.clsFormatoTiCDTO;
import SGestionAnteproyectos.dto.clsFormatoTiDDTO;
import SGestionAnteproyectos.dto.clsUsuarioDTO;
import cliente.sop_rmi.NotificacionINT;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface GestionAnteproyectoINT extends Remote {

    public boolean RegistrarFormatoTiA(clsFormatoTiADTO objFormatoA) throws RemoteException;

    public boolean RegistrarFormatoTiB(clsFormatoTiBDTO objFormatoB) throws RemoteException;

    public boolean RegistrarFormatoTiC(clsFormatoTiCDTO objFormatoC) throws RemoteException;

    public boolean RegistrarFormatoTiD(clsFormatoTiDDTO objFormatoD) throws RemoteException;

    public int VerificarAnteproyecto(int codigo) throws RemoteException;

    public int solicitarCodigo() throws RemoteException;

    public clsConceptosDTO ConsultarConceptos(int codigo) throws RemoteException;

    public boolean Asignar(clsFormatoTiBDTO objFormatoB) throws RemoteException;

    public int ConsultarConceptoJefe(int codigo) throws RemoteException;

    public int ConsultarConceptoD(int codigo) throws RemoteException;

    public int consultarAnteproyecto(int codigo) throws RemoteException;

    public boolean verificarPropiedad(int codigoAnt, int codEv) throws RemoteException;

    public ArrayList<clsFormatoTiBDTO> ListarAnt(int id) throws RemoteException;

    public ArrayList<clsFormatoTiBDTO> ListarAntBAprobados() throws RemoteException;

    public ArrayList<clsFormatoTiCDTO> ListarAntCAprobados() throws RemoteException;

    public ArrayList<clsFormatoTiDDTO> ListarAntDAprobados() throws RemoteException;

    public ArrayList<clsFormatoTiADTO> ListarAntNoAsig() throws RemoteException;

    public void registrarCallback(clsDirectorDTO objDirector) throws RemoteException;
    
    public void AsignarAnteproyectos(int id, int codigo) throws RemoteException;
}
