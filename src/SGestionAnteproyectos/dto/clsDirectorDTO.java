/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import cliente.sop_rmi.NotificacionINT;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsDirectorDTO implements Serializable {

    private int id;
    private ArrayList lista;
    private NotificacionINT Referencia;
    private boolean activo;
    public clsDirectorDTO(int id, NotificacionINT Referencia, boolean activo) {
        this.id = id;
        this.Referencia = Referencia;
        this.lista = new ArrayList();
        this.activo=activo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public NotificacionINT getReferencia() {
        return Referencia;
    }

    public void setReferencia(NotificacionINT Referencia) {
        this.Referencia = Referencia;
    }

}
