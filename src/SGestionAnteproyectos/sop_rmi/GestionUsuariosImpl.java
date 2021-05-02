/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.sop_rmi;


import SGestionAnteproyectos.dto.clsFormatoTiBDTO;
import SGestionAnteproyectos.dto.clsUsuarioDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import SGestionAnteproyectos.sop_rmi.GestionUsuariosINT;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoINT;
import cliente.utilidades.UtilidadesRegistroC;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author Usuario
 */
public class GestionUsuariosImpl extends UnicastRemoteObject implements GestionUsuariosINT{
    private ArrayList<clsUsuarioDTO> Usuarios;
    private GestionSeguimientoINT objReferenciaRemota;

    public GestionUsuariosImpl() throws RemoteException {
      super();
       Usuarios= new ArrayList();
      
    }

    @Override
    public boolean RegistrarUsuarios(clsUsuarioDTO objUsuario) throws RemoteException {
         System.out.println("Entrando a registrar Usuarios ");
         return this.Usuarios.add(objUsuario);
         
         
    }

    @Override
    public clsUsuarioDTO ConsultarUsuario(int id) throws RemoteException {
           System.out.println("Entrando a consultar Usuarios ");
           clsUsuarioDTO objUsuario =null;
           for(int i=0;i<this.Usuarios.size();i++){
               if(this.Usuarios.get(i).getId()==id){ 
                objUsuario=this.Usuarios.get(i);
                  return objUsuario;
               }
           }
          return objUsuario;
    }

    @Override
    public boolean ModificarUsuario(clsUsuarioDTO objUsuario) throws RemoteException {
      System.out.println("Entrando a ModificarUsuario ");
      boolean bandera=false;
          for(int i=0;i<this.Usuarios.size();i++){
              if(this.Usuarios.get(i).getId()==objUsuario.getId() ){
                  this.Usuarios.get(i).setNombreCompleto(objUsuario.getNombreCompleto());
                  this.Usuarios.get(i).setRole(objUsuario.getRole());
                   this.Usuarios.get(i).setDepartamento(objUsuario.getDepartamento());
                     this.Usuarios.get(i).setContrasenia(objUsuario.getContrasenia());
                    
                  bandera=true;
                  
              }
          } 
           return bandera;
    }

    @Override
    public clsUsuarioDTO Sesion(String usuario, String clave) throws RemoteException {
          System.out.println("Entrando a iniciar Sesion ");
          clsUsuarioDTO objUsuario =null;
          for(int i=0;i<this.Usuarios.size();i++){
              if(this.Usuarios.get(i).getUsuario().equals(usuario) && this.Usuarios.get(i).getContrasenia().equals(clave)){
                  objUsuario=this.Usuarios.get(i);
                  return objUsuario;
              }
          } 
           return objUsuario;
    }

  
 public String consultarReferenciaRemota(String direccionIpRMIRegistry, int  numPuertoRMIRegistry){
    String Mensaje ="";
    System.out.println(" ");
    System.out.println("Desde consultarReferenciaRemotaDeSeguimientoUsuario()...");
    Mensaje="Desde consultarReferenciaRemotaDeSeguimientoUsuario()...";
    this.objReferenciaRemota= (GestionSeguimientoINT) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,
    numPuertoRMIRegistry, "objetoRemotoSeguimiento");
    return Mensaje;
  }

    @Override
    public int consultarEvaluador(int id) throws RemoteException {
        System.out.println("Entrando a consultar Evaluador ");
        int bandera = -1;
        boolean encontro =false;
        if (this.Usuarios.isEmpty()) {
            System.out.println("NO hay usuarios Registrados ");
        } else {
            for (int i = 0; i < this.Usuarios.size(); i++) {
                if (this.Usuarios.get(i).getId() == id && this.Usuarios.get(i).getRole().equals("Evaluador")) {
                    bandera = 1;
                    encontro=true;
                }
            }
        }
        if(encontro==false){
                bandera=2;
            }

        return bandera;

    }

    @Override
    public ArrayList<clsUsuarioDTO> listarEv() throws RemoteException {
         System.out.println("Entrando a listar Evaluadores ");
          ArrayList<clsUsuarioDTO> lista =new ArrayList();
          for (int i=0;i<this.Usuarios.size();i++){
              if(this.Usuarios.get(i).getRole().equals("Evaluador")){
                  lista.add(this.Usuarios.get(i));
              }
          }
          return lista;
    }

  

 

 
   
    
}
