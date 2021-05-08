/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;

import SGestionAnteproyectos.dto.clsUsuarioDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public interface GestionUsuariosINT extends Remote {

    public boolean RegistrarUsuarios(clsUsuarioDTO objUsuario) throws RemoteException;

    public clsUsuarioDTO ConsultarUsuario(int id) throws RemoteException;

    public boolean ModificarUsuario(clsUsuarioDTO objUsuario) throws RemoteException;

    public clsUsuarioDTO Sesion(String usuario, String clave) throws RemoteException;

    public int consultarEvaluador(int id) throws RemoteException;

    public ArrayList<clsUsuarioDTO> listarEv() throws RemoteException;

    public int validarId(int id) throws RemoteException;

    public boolean validarUS(String usuario) throws RemoteException;
}
