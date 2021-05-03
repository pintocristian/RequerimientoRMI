/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.sop_rmi;

import cliente.vistas.GUIMenuDirector;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class NotificacionImpl extends UnicastRemoteObject implements NotificacionINT{
    private GUIMenuDirector Director;
    public NotificacionImpl(GUIMenuDirector director)throws RemoteException{
    this.Director=director;
    }
    @Override
    public void Notificar(int codigo) throws RemoteException {
          System.out.println("El anteproyecto con codigo: "+codigo+" Fue aprobado por los evaluadores");
         Director.Notificacion("El anteproyecto con codigo: "+codigo+" Fue aprobado por los evaluadores");
         
    }
    
}
