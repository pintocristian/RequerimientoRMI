/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class NotificacionImpl extends UnicastRemoteObject implements NotificacionINT{
    public NotificacionImpl()throws RemoteException{}
    @Override
    public void Notificar(int codigo) throws RemoteException {
          System.out.println("El anteproyecto con codigo: "+codigo+" Fue aprobado por los evaluadores");
            JOptionPane.showMessageDialog(null,"El anteproyecto con codigo: "+codigo+" Fue aprobado por los evaluadores"); 
           
    
    }
    
}
