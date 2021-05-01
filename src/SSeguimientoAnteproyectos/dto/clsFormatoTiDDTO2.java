/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.dto;

import SGestionAnteproyectos.dto.*;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class clsFormatoTiDDTO2 implements Serializable{
    private int codigo;
    private String estructura;
    private int conceptoCoor;
    private String observaciones;

    public clsFormatoTiDDTO2(int codigo, String estructura, int conceptoCoor, String observaciones) {
        this.codigo = codigo;
        this.estructura = estructura;
        this.conceptoCoor = conceptoCoor;
        this.observaciones = observaciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    public int getConceptoCoor() {
        return conceptoCoor;
    }

    public void setConceptoCoor(int conceptoCoor) {
        this.conceptoCoor = conceptoCoor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
