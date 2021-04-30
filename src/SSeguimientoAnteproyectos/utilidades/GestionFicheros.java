/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.utilidades;

import SSeguimientoAnteproyectos.dto.clsFormatosDTO;
import SSeguimientoAnteproyectos.dto.clsResolucionDTO;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Cristian Pinto
 */
public class GestionFicheros {
    private  final String ruta = System.getProperty("user.dir");
    private  final String so = System.getProperty("os.name");
    private  final String carpetaBuscada = "pruebitas"; 
    private ArrayList<clsFormatosDTO> listaFormatos;
    private ArrayList<clsResolucionDTO> listaResoluciones;
    
    public GestionFicheros() {
        listaFormatos = new ArrayList();
        listaFormatos = new ArrayList();
    }
    public void escribirEnHistorial(String fichero, clsFormatosDTO objFormatos){
        if(estaVacio(fichero)){
            try {
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(fichero));
                oos.writeObject(objFormatos);
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                ObjectOutputStreamV2 oos = new ObjectOutputStreamV2(
                        new FileOutputStream(fichero, true));
                oos.writeUnshared(objFormatos);
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void escribirEnResolucion(String fichero,clsResolucionDTO objResolucion){
        if(estaVacio(fichero)){
            try {
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(fichero));
                oos.writeObject(objResolucion);
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                ObjectOutputStreamV2 oos = new ObjectOutputStreamV2(
                        new FileOutputStream(fichero, true));
                oos.writeUnshared(objResolucion);
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public  ArrayList<clsResolucionDTO> leerResolucion(String fichero){
         try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof clsResolucionDTO) {
                    System.out.println("es de tipo resoluciones");
                }
                listaResoluciones.add((clsResolucionDTO) aux);
                aux = ois.readObject();
            }
            ois.close();
            
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
             System.out.println("persona leidaxd");
        }
         return listaResoluciones;
    }
    public ArrayList<clsFormatosDTO> leerHistorial(String fichero){
         try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof clsFormatosDTO) {
                    System.out.println("es de tipo formatos");
                }
                listaFormatos.add((clsFormatosDTO) aux);
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
             System.out.println("persona leidaxd");
        }
        return listaFormatos;
    }
    
    public boolean buscarArchivo(String fichero) {
        System.out.println("entro a la busqueda");
        File carpeta = new File(ruta + "/" + carpetaBuscada);
        System.out.println("creo archivo file");
        File[] archivos = carpeta.listFiles();
        System.out.println("creo lista de archivos");
        for (File archivo : archivos) {
            if(archivo.getName().equals("datos.txt"))
                return true;
        }
        return false;
    }
    public boolean estaVacio(String prmArchivo){
        boolean r = false;
        try {
            ObjectInputStream objIs = new ObjectInputStream(
                    new FileInputStream(prmArchivo));

            Object aux = objIs.readObject();
            objIs.close();
            return false;
        } catch (EOFException e) {
            System.out.println("fin fichero");
            r =  true;
        } catch (Exception ex) {
            System.out.println("creando");
            r=true;
        } 
        return r;
    }
}
