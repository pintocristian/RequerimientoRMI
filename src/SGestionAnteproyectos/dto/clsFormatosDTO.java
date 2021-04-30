/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import SGestionAnteproyectos.dto.clsFormatoTiDDTO;
import SGestionAnteproyectos.dto.clsFormatoTiCDTO;
import SGestionAnteproyectos.dto.clsFormatoTiBDTO;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class clsFormatosDTO implements Serializable{
    private int codigoAnteproyectos;
    private clsFormatoTiADTO formatoA;
    private clsFormatoTiBDTO formatoB1;
    private clsFormatoTiBDTO formatoB2;
    private clsFormatoTiCDTO formatoC;
    private clsFormatoTiDDTO formatoD;

    public clsFormatosDTO(int codigoAnteproyectos, clsFormatoTiADTO formatoA, clsFormatoTiBDTO formatoB1, clsFormatoTiBDTO formatoB2, clsFormatoTiCDTO formatoC, clsFormatoTiDDTO formatoD) {
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

    public clsFormatoTiADTO getFormatoA() {
        return formatoA;
    }

    public void setFormatoA(clsFormatoTiADTO formatoA) {
        this.formatoA = formatoA;
    }

    public clsFormatoTiBDTO getFormatoB1() {
        return formatoB1;
    }

    public void setFormatoB1(clsFormatoTiBDTO formatoB1) {
        this.formatoB1 = formatoB1;
    }

    public clsFormatoTiBDTO getFormatoB2() {
        return formatoB2;
    }

    public void setFormatoB2(clsFormatoTiBDTO formatoB2) {
        this.formatoB2 = formatoB2;
    }

    public clsFormatoTiCDTO getFormatoC() {
        return formatoC;
    }

    public void setFormatoC(clsFormatoTiCDTO formatoC) {
        this.formatoC = formatoC;
    }

    public clsFormatoTiDDTO getFormatoD() {
        return formatoD;
    }

    public void setFormatoD(clsFormatoTiDDTO formatoD) {
        this.formatoD = formatoD;
    }
    
}
