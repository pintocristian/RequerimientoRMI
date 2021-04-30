/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.sop_rmi;

import SSeguimientoAnteproyectos.dto.clsFormatosDTO;
import SSeguimientoAnteproyectos.dto.clsResolucionDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GestionSeguimientoImpl  extends UnicastRemoteObject implements GestionSeguimientoINT{

    public GestionSeguimientoImpl() throws RemoteException {
     super();
    }
    
    @Override
    public boolean RegistrarHistorial(clsFormatosDTO objFormatos) throws RemoteException {
       return true;
    }

    @Override
    public boolean RegistrarResolucion(int codigo) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<clsResolucionDTO> ConsultarResoluciones() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<clsFormatosDTO> ConsultarHistorial() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
