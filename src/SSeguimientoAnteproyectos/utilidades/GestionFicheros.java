/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.utilidades;

import SSeguimientoAnteproyectos.dto.clsFormatosDTO2;
import SSeguimientoAnteproyectos.dto.clsResolucionDTO;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Cristian Pinto
 */
public class GestionFicheros {

    public GestionFicheros() {
    }

    public boolean escribirEnHistorial(String fichero, clsFormatosDTO2 objFormatos) {
        boolean r = false;
        if (estaVacio(fichero)) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(fichero));
                oos.writeObject(objFormatos);
                oos.close();
                r = true;
            } catch (IOException e) {
                System.out.println("error al escribir en historial");
            }
        } else {
            try {
                ObjectOutputStreamV2 oos = new ObjectOutputStreamV2(
                        new FileOutputStream(fichero, true));
                oos.writeUnshared(objFormatos);
                oos.close();
                r = true;
            } catch (IOException e) {
                System.out.println("error al escribir en historial");
            }
        }
        return r;
    }

    public boolean escribirEnResolucion(String fichero, clsResolucionDTO objResolucion) {
        boolean r = false;
        if (estaVacio(fichero)) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(fichero));
                oos.writeObject(objResolucion);
                oos.close();
                return true;
            } catch (IOException e) {
                System.out.println("error al escribir en resolucion");
            }

        } else {
            try {
                ObjectOutputStreamV2 oos = new ObjectOutputStreamV2(
                        new FileOutputStream(fichero, true));
                oos.writeUnshared(objResolucion);
                oos.close();
                return true;
            } catch (IOException e) {
                System.out.println("error al escribir en resolucion");
            }

        }
        return r;
    }

    public ArrayList<clsResolucionDTO> leerResolucion(String fichero) {
        ArrayList<clsResolucionDTO> listaResoluciones = new ArrayList();
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof clsResolucionDTO) {

                }
                listaResoluciones.add((clsResolucionDTO) aux);

                aux = ois.readObject();

            }
            ois.close();

        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println("resolucion leida");
        }
        return listaResoluciones;
    }

    public ArrayList<clsFormatosDTO2> leerHistorial(String fichero) {
        ArrayList<clsFormatosDTO2> listaFormatos = new ArrayList();
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Object aux = ois.readObject();

            while (aux != null) {
                if (aux instanceof clsFormatosDTO2) {

                }
                listaFormatos.add((clsFormatosDTO2) aux);
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println("historial leido");
        }
        return listaFormatos;
    }

    public boolean estaVacio(String prmArchivo) {
        boolean r = false;
        try {
            ObjectInputStream objIs = new ObjectInputStream(
                    new FileInputStream(prmArchivo));

            Object aux = objIs.readObject();
            r = false;
            objIs.close();

        } catch (EOFException e) {
            System.out.println("fin fichero");
            r = true;
        } catch (Exception ex) {
            System.out.println("creando");
            r = true;
        }
        return r;
    }
}
