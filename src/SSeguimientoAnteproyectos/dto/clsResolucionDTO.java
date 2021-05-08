/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSeguimientoAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class clsResolucionDTO implements Serializable {

    String numeroReosolucion;
    String fecha;
    int codigo;

    public clsResolucionDTO(String numeroReosolucion, String fecha, int codigo) {
        this.numeroReosolucion = numeroReosolucion;
        this.fecha = fecha;
        this.codigo = codigo;
    }

    public String getNumeroReosolucion() {
        return numeroReosolucion;
    }

    public void setNumeroReosolucion(String numeroReosolucion) {
        this.numeroReosolucion = numeroReosolucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
