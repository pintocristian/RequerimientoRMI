/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import SSeguimientoAnteproyectos.dto.clsFormatosDTO2;
import SSeguimientoAnteproyectos.dto.clsResolucionDTO;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public interface GestionSeguimientoINT extends Remote {
    public boolean RegistrarHistorial(clsFormatosDTO2 objFormatos)throws RemoteException;
    public boolean RegistrarResolucion(int idAnteproyecto)throws RemoteException;
    public ArrayList<clsResolucionDTO> ConsultarResoluciones() throws RemoteException;
    public ArrayList<clsFormatosDTO2> ConsultarHistorial() throws RemoteException;
}
