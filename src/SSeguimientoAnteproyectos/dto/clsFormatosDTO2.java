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
public class clsFormatosDTO2 implements Serializable{
    private int codigoAnteproyectos;
    private clsFormatoTiADTO2 formatoA;
    private clsFormatoTiBDTO2 formatoB1;
    private clsFormatoTiBDTO2 formatoB2;
    private clsFormatoTiCDTO2 formatoC;
    private clsFormatoTiDDTO2 formatoD;

    public clsFormatosDTO2(int codigoAnteproyectos, clsFormatoTiADTO2 formatoA, clsFormatoTiBDTO2 formatoB1, clsFormatoTiBDTO2 formatoB2, clsFormatoTiCDTO2 formatoC, clsFormatoTiDDTO2 formatoD) {
        this.codigoAnteproyectos = codigoAnteproyectos;
        this.formatoA = formatoA;
        this.formatoB1 = formatoB1;
        this.formatoB2 = formatoB2;
        this.formatoC = formatoC;
        this.formatoD = formatoD;
    }

    public int getCodigoAnteproyectos() {
        return codigoAnteproyectos;
    }

    public void setCodigoAnteproyectos(int codigoAnteproyectos) {
        this.codigoAnteproyectos = codigoAnteproyectos;
    }

    public clsFormatoTiADTO2 getFormatoA() {
        return formatoA;
    }

    public void setFormatoA(clsFormatoTiADTO2 formatoA) {
        this.formatoA = formatoA;
    }

    public clsFormatoTiBDTO2 getFormatoB1() {
        return formatoB1;
    }

    public void setFormatoB1(clsFormatoTiBDTO2 formatoB1) {
        this.formatoB1 = formatoB1;
    }

    public clsFormatoTiBDTO2 getFormatoB2() {
        return formatoB2;
    }

    public void setFormatoB2(clsFormatoTiBDTO2 formatoB2) {
        this.formatoB2 = formatoB2;
    }

    public clsFormatoTiCDTO2 getFormatoC() {
        return formatoC;
    }

    public void setFormatoC(clsFormatoTiCDTO2 formatoC) {
        this.formatoC = formatoC;
    }

    public clsFormatoTiDDTO2 getFormatoD() {
        return formatoD;
    }

    public void setFormatoD(clsFormatoTiDDTO2 formatoD) {
        this.formatoD = formatoD;
    }
    
}
