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
public class clsFormatoTiBDTO implements Serializable{
    private int id_evaluador;
    private int codigo;
    private int concepto;
    private String observaciones;
    private String fecha;
    private String evaluador;

    public clsFormatoTiBDTO(int id_evaluador, int codigo, int concepto, String observaciones, String fecha, String evaluador) {
        this.id_evaluador = id_evaluador;
        this.codigo = codigo;
        this.concepto = concepto;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.evaluador = evaluador;
    }

    public int getId_evaluador() {
        return id_evaluador;
    }

    public void setId_evaluador(int id_evaluador) {
        this.id_evaluador = id_evaluador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getConcepto() {
        return concepto;
    }

    public void setConcepto(int concepto) {
        this.concepto = concepto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(String evaluador) {
        this.evaluador = evaluador;
    }
    
    
}
