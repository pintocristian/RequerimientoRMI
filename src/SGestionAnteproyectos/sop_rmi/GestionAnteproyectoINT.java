/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.clsConceptosDTO;
import SGestionAnteproyectos.dto.clsFormatoTiADTO;
import SGestionAnteproyectos.dto.clsFormatoTiBDTO;
import SGestionAnteproyectos.dto.clsFormatoTiCDTO;
import SGestionAnteproyectos.dto.clsFormatoTiDDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Usuario
 */
public interface GestionAnteproyectoINT extends Remote {
    public boolean RegistrarFormatoTiA(clsFormatoTiADTO objFormatoA)throws RemoteException;
    public boolean RegistrarFormatoTiB(clsFormatoTiBDTO objFormatoB)throws RemoteException;
    public boolean RegistrarFormatoTiC(clsFormatoTiCDTO objFormatoC)throws RemoteException;
    public boolean RegistrarFormatoTiD(clsFormatoTiDDTO objFormatoD)throws RemoteException;
    public int VerificarAnteproyecto(int codigo)throws RemoteException;
    public int solicitarCodigo()throws RemoteException;
    public clsConceptosDTO ConsultarConceptos(int codigo)throws RemoteException;
    public boolean Asignar(clsFormatoTiBDTO objFormatoB)throws RemoteException;
    public int ConsultarConceptoJefe(int codigo)throws RemoteException;
    public int ConsultarConceptoD(int codigo)throws RemoteException;
    public int  consultarAnteproyecto(int codigo)throws RemoteException;
    public boolean verificarPropiedad(int codigoAnt, int codEv)throws RemoteException;
}
