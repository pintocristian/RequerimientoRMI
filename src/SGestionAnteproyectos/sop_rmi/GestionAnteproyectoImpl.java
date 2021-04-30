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
import SGestionAnteproyectos.utilidades.UtilidadesRegistroC;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoINT;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class GestionAnteproyectoImpl extends UnicastRemoteObject implements GestionAnteproyectoINT{
     private GestionSeguimientoINT objReferenciaRemota;
     private ArrayList<clsFormatoTiADTO> FormatoA;
     private ArrayList<clsFormatoTiBDTO> FormatoB;
     private ArrayList<clsFormatoTiCDTO> FormatoC;
     private ArrayList<clsFormatoTiDDTO> FormatoD;
     private static int incremento =0;
    public GestionAnteproyectoImpl() throws RemoteException {
        super();
        this.FormatoA=new ArrayList();
        this.FormatoB=new ArrayList();
        this.FormatoC=new ArrayList();
        this.FormatoD=new ArrayList();
    }

    @Override
    public boolean RegistrarFormatoTiA(clsFormatoTiADTO ObjFormatoA) throws RemoteException {
        System.out.println("Entrando a registrar formato A ");
         ObjFormatoA.setFlujo(1); 
        return FormatoA.add(ObjFormatoA);
        
    }
  
    @Override
    public boolean RegistrarFormatoTiB(clsFormatoTiBDTO objFormatoB) throws RemoteException {    
          System.out.println("Entrando a registrar formato");
        boolean encontro = false;
        
        for(int i=0; i<FormatoB.size();i++){
            if(this.FormatoB.get(i).getCodigo()==objFormatoB.getCodigo()){
                this.FormatoB.get(i).setConcepto(objFormatoB.getConcepto());
                this.FormatoB.get(i).setObservaciones(objFormatoB.getObservaciones());
                this.FormatoB.get(i).setFecha(objFormatoB.getFecha());
                encontro=true;
            }
        }
        for(int i=0;i<this.FormatoA.size();i++){
            if(this.FormatoA.get(i).getCodigo()==objFormatoB.getCodigo()){
                this.FormatoA.get(i).setFlujo(FormatoA.get(i).getFlujo()+1);
                break;
            }
        }
        return encontro;
        
        
    }

    @Override
    public boolean RegistrarFormatoTiC(clsFormatoTiCDTO objFormatoC) throws RemoteException {
        System.out.println("Entrando a registrar formato C");
        boolean funciono=false;
        
     
        
        if(FormatoC.add(objFormatoC)==true){
             for(int i=0;i<this.FormatoA.size();i++){
            if(this.FormatoA.get(i).getCodigo()==objFormatoC.getCodigo()){
                this.FormatoA.get(i).setFlujo(4);
                funciono=true;
                break;
            }
            }
        }
        
       
        return funciono;
        
    }

    @Override
    public boolean RegistrarFormatoTiD(clsFormatoTiDDTO objFormatoD) throws RemoteException {
        System.out.println("Entrando a registrar formato D");
         
        boolean funciono=false;
        if(FormatoD.add(objFormatoD)==true){
        
        for(int i=0;i<this.FormatoA.size();i++){
            if(this.FormatoA.get(i).getCodigo()==objFormatoD.getCodigo()){
                this.FormatoA.get(i).setFlujo(5);
                funciono=true;
                break;
            }
        }
        }
        return funciono;
    }

    @Override
    public int VerificarAnteproyecto(int codigo) throws RemoteException {
        System.out.println("Entrando a verificar anteproyecto");
        for(int i=0;i<this.FormatoA.size();i++){
            if(this.FormatoA.get(i).getCodigo()==codigo){
                return this.FormatoA.get(i).getFlujo();
                
            }
        }
        return 0;
    }

    @Override
    public int solicitarCodigo() throws RemoteException {
        String periodo="";
        incremento =incremento+1;
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String año  =Integer.toString(localDate.getYear());
        int mes = localDate.getMonthValue();
        String Fecha="";
        if(mes <= 6){
            periodo="1";
        }else{
            periodo="2";
        }
        Fecha=año+periodo;
        int Numero=Integer.parseInt(Fecha);
        Numero=Numero*1000;
        Numero=Numero+incremento;
        return Numero;
    }

    @Override
    public clsConceptosDTO ConsultarConceptos(int codigo) throws RemoteException {
      
       int concepto1=0;
       int concepto2=0;
       int id=0;
       for(int i=0;i<this.FormatoB.size();i++){
           if(this.FormatoB.get(i).getCodigo()==codigo){
              concepto1=this.FormatoB.get(i).getConcepto(); 
              id=this.FormatoB.get(i).getCodigo();
               break;
           }
       }
       for(int i=0;i<this.FormatoB.size();i++){
           if(this.FormatoB.get(i).getCodigo()==codigo && this.FormatoB.get(i).getCodigo() != id){
               concepto2=this.FormatoB.get(i).getConcepto(); 
             
               break;
           }
       }
        clsConceptosDTO objConceptos = new clsConceptosDTO(concepto1,concepto2);
       return objConceptos;
    }

  
    
    

    @Override
    public int ConsultarConceptoJefe(int codigo) throws RemoteException {
       for(int i=0;i<this.FormatoC.size();i++){
           if(this.FormatoC.get(i).getCodigo()==codigo){
               return this.FormatoC.get(i).getConceptoDpto();
           }
       }
       return -1;
    }
     @Override
    public int ConsultarConceptoD(int codigo) throws RemoteException {
       for(int i=0;i<this.FormatoD.size();i++){
           if(this.FormatoD.get(i).getCodigo()==codigo){
               return this.FormatoD.get(i).getConceptoCoor();
           }
       }
       return -1;
    }
    
      public String consultarReferenciaRemota(String direccionIpRMIRegistry, int  numPuertoRMIRegistry){
    String Mensaje ="";
    System.out.println(" ");
    System.out.println("Desde consultarReferenciaRemotaDeSeguimiento()...");
    Mensaje="Desde consultarReferenciaRemotaDeSeguimiento()...";
    this.objReferenciaRemota= (GestionSeguimientoINT) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,
    numPuertoRMIRegistry, "objetoRemotoSeguimiento");
    return Mensaje;
  }

    @Override
    public boolean Asignar(clsFormatoTiBDTO objFormatoB) throws RemoteException {
        System.out.println("Entrando a Asignar formato B");
        return FormatoB.add(objFormatoB); 
    }

    @Override
    public boolean consultarAnteproyecto(int codigo) throws RemoteException {
       boolean bandera = false;
        for(int i=0;i<this.FormatoA.size();i++){
           for(int j=0;j<this.FormatoB.size();i++){
               if(this.FormatoA.get(i).getCodigo()==this.FormatoB.get(j).getCodigo() && this.FormatoA.get(i).getFlujo()==1){
                   bandera =true;
                   return bandera;
               }
           }
       }
        return bandera;
    }

   
}
