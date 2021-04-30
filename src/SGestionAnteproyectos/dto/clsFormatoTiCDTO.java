/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class clsFormatoTiCDTO implements Serializable{
    private int codigo;
    private String estructura;
    private int conceptoDpto;
    private String observaciones;

    public clsFormatoTiCDTO(int codigo, String estructura, int conceptoDpto, String observaciones) {
        this.codigo = codigo;
        this.estructura = estructura;
        this.conceptoDpto = conceptoDpto;
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

    public int getConceptoDpto() {
        return conceptoDpto;
    }

    public void setConceptoDpto(int conceptoDpto) {
        this.conceptoDpto = conceptoDpto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
