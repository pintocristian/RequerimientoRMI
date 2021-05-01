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
import SGestionAnteproyectos.dto.clsFormatosDTO;
import SGestionAnteproyectos.utilidades.UtilidadesRegistroC;
import SSeguimientoAnteproyectos.dto.clsFormatoTiADTO2;
import SSeguimientoAnteproyectos.dto.clsFormatoTiBDTO2;
import SSeguimientoAnteproyectos.dto.clsFormatoTiCDTO2;
import SSeguimientoAnteproyectos.dto.clsFormatoTiDDTO2;
import SSeguimientoAnteproyectos.dto.clsFormatosDTO2;
import SSeguimientoAnteproyectos.sop_rmi.GestionSeguimientoINT;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        for (int i = 0; i < FormatoB.size(); i++) {
            if (this.FormatoB.get(i).getCodigo() == objFormatoB.getCodigo() && this.FormatoB.get(i).getCodigo() == objFormatoB.getCodigo()) {
               if(this.FormatoB.get(i).getConcepto()==-1){
                    this.FormatoB.get(i).setConcepto(objFormatoB.getConcepto());
                    this.FormatoB.get(i).setObservaciones(objFormatoB.getObservaciones());
                    this.FormatoB.get(i).setFecha(objFormatoB.getFecha());
                    encontro = true;
                    break;
               }
            }
        }
        if (encontro == true) {
            for (int i = 0; i < this.FormatoA.size(); i++) {
                if (this.FormatoA.get(i).getCodigo() == objFormatoB.getCodigo()) {
                    this.FormatoA.get(i).setFlujo(FormatoA.get(i).getFlujo() + 1);
                    break;
                }
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

        boolean funciono = false;
        if (FormatoD.add(objFormatoD) == true) {
            if(objFormatoD.getConceptoCoor()==1){
                EnviarFormatos(objFormatoD.getCodigo());
            }
            
            for (int i = 0; i < this.FormatoA.size(); i++) {
                if (this.FormatoA.get(i).getCodigo() == objFormatoD.getCodigo()) {
                    this.FormatoA.get(i).setFlujo(5);
                    funciono = true;
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
                System.out.println("Entrando a solicitarCodigo");
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
              System.out.println("Entrando a consultar Conceptos");
       int concepto1=0;
       int concepto2=0;
       int id=0;
       for(int i=0;i<this.FormatoB.size();i++){
           if(this.FormatoB.get(i).getCodigo()==codigo){
              concepto1=this.FormatoB.get(i).getConcepto(); 
              id=this.FormatoB.get(i).getId_evaluador();
               break;
           }
       }
       for(int j=0;j<this.FormatoB.size();j++){
           if(this.FormatoB.get(j).getCodigo()==codigo && this.FormatoB.get(j).getCodigo() != id){
               concepto2=this.FormatoB.get(j).getConcepto(); 
             
               break;
           }
       }
        clsConceptosDTO objConceptos = new clsConceptosDTO(concepto1,concepto2);
       return objConceptos;
    }

  
    
    

    @Override
    public int ConsultarConceptoJefe(int codigo) throws RemoteException {
               System.out.println("Entrando a consultarConceptoJefe");
        
        for(int i=0;i<this.FormatoC.size();i++){
           if(this.FormatoC.get(i).getCodigo()==codigo){
               return this.FormatoC.get(i).getConceptoDpto();
           }
       }
       return -1;
    }
     @Override
    public int ConsultarConceptoD(int codigo) throws RemoteException {
       
                System.out.println("Entrando a consultarConceptoD");
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
    public int consultarAnteproyecto(int codigo) throws RemoteException {
        System.out.println("Entrando a consultar Anteproyecto");
        
        int bandera = -1;
       boolean encontro=false;
       if(this.FormatoA.isEmpty()){
               System.out.println("no se encuentran anteproyectos registrados");
       }else{
             for(int i=0;i<this.FormatoA.size();i++){
           if(this.FormatoA.get(i).getCodigo()==codigo && this.FormatoA.get(i).getFlujo()==1){
            encontro=true;
            bandera=1;
            break;
           } 
       }
        if(encontro==true){
         for(int j=0;j<this.FormatoB.size();j++){
             if(this.FormatoB.get(j).getCodigo()==codigo){
                 bandera=2;
                 break;
             }
        
             }
        }else{
               bandera=0;
        }
      }
        return bandera;
    }

    @Override
    public boolean verificarPropiedad(int codigoAnt, int codEv) throws RemoteException {
     boolean bandera =false;
        for(int i=0;i<this.FormatoB.size();i++){
          if(this.FormatoB.get(i).getCodigo()==codigoAnt && this.FormatoB.get(i).getId_evaluador()==codEv){
              bandera= true;
          }
      }
        return bandera;
    }

   public void EnviarFormatos(int ide){
       int id=ide;
       int ev1=0;
       clsFormatoTiADTO objA=new  clsFormatoTiADTO();
       clsFormatoTiBDTO objB1 =new clsFormatoTiBDTO();
       clsFormatoTiBDTO objB2=new clsFormatoTiBDTO();
       clsFormatoTiCDTO objC=new clsFormatoTiCDTO();
       clsFormatoTiDDTO objD=new  clsFormatoTiDDTO();
       clsFormatoTiADTO2 objAS= new clsFormatoTiADTO2();
       clsFormatoTiBDTO2 objB1S =new clsFormatoTiBDTO2();
       clsFormatoTiBDTO2 objB2S=new  clsFormatoTiBDTO2();
       clsFormatoTiCDTO2 objCS= new  clsFormatoTiCDTO2();
       clsFormatoTiDDTO2 objDS=new   clsFormatoTiDDTO2 ();
       for (int i=0;i<this.FormatoA.size();i++){
           if(this.FormatoA.get(i).getCodigo()==id){
           objA = this.FormatoA.get(i);
           }
       }
       for (int i=0;i<this.FormatoB.size();i++){
           if(this.FormatoB.get(i).getCodigo()==id){
               objB1 = this.FormatoB.get(i);
               ev1=this.FormatoB.get(i).getId_evaluador();
               break;
           } 
       }
        for (int i=0;i<this.FormatoB.size();i++){
           
           if(this.FormatoB.get(i).getCodigo()==id && ev1 != this.FormatoB.get(i).getId_evaluador()){
                 objB2 = this.FormatoB.get(i);
                 break;
           }
       }
       for (int i=0;i<this.FormatoC.size();i++){
           if(this.FormatoC.get(i).getCodigo()==id){
                objC = this.FormatoC.get(i);
           }
       }
       for (int i=0;i<this.FormatoD.size();i++){
           if(this.FormatoD.get(i).getCodigo()==id){
               objD = this.FormatoD.get(i);
           }
       }
      
       // Formato A
       objAS.setCodigo(objA.getCodigo());
       objAS.setNombrePrograma(objA.getNombrePrograma());
       objAS.setTitulo(objA.getTitulo());
       objAS.setEstudiante01(objA.getEstudiante01());
       objAS.setCodigoestudiante01(objA.getCodigoestudiante01());
       objAS.setEstudiante02(objA.getEstudiante02());
       objAS.setCodigoestudiante02(objA.getCodigoestudiante02());
       objAS.setDirector(objA.getDirector());
       objAS.setCodirector(objA.getCodirector());
       objAS.setObjetivo(objA.getObjetivo());
       objAS.setFlujo(objA.getFlujo());
        // Formato B1
       objB1S.setId_evaluador(objB1.getId_evaluador());
       objB1S.setCodigo(objB1.getCodigo());
       objB1S.setConcepto(objB1.getConcepto());
       objB1S.setObservaciones(objB1.getObservaciones());
       objB1S.setFecha(objB1.getFecha());
       // Formato B2
       objB2S.setId_evaluador(objB2.getId_evaluador());
       objB2S.setCodigo(objB2.getCodigo());
       objB2S.setConcepto(objB2.getConcepto());
       objB2S.setObservaciones(objB2.getObservaciones());
       objB2S.setFecha(objB2.getFecha());
       // Formato C
       objCS.setCodigo(objC.getCodigo());
       objCS.setEstructura(objC.getEstructura());
       objCS.setConceptoDpto(objC.getConceptoDpto());
       objCS.setObservaciones(objC.getObservaciones());
       // Formato D
       objDS.setCodigo(objD.getCodigo());
       objDS.setEstructura(objD.getEstructura());
       objDS.setConceptoCoor(objD.getConceptoCoor());
       objDS.setObservaciones(objD.getObservaciones());
       
       clsFormatosDTO2 objFormatos =new clsFormatosDTO2(id,objAS,objB1S,objB2S,objCS,objDS);
         try {
             this.objReferenciaRemota.RegistrarHistorial(objFormatos);
         } catch (RemoteException ex) {
             Logger.getLogger(GestionAnteproyectoImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
       
       
   
    }

    @Override
    public ArrayList<clsFormatoTiBDTO> ListarAnt(int id) throws RemoteException {
         System.out.println("Entrando a listar anteproyectos");
         ArrayList<clsFormatoTiBDTO> listaAnt = new   ArrayList();
         for(int i=0;i<this.FormatoB.size();i++){
             if(this.FormatoB.get(i).getId_evaluador()==id){
             listaAnt.add(this.FormatoB.get(i));
             }
         }
         return listaAnt;
    }

  
   

    


}
