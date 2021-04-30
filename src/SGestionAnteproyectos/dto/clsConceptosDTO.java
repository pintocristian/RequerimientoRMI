/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class clsConceptosDTO implements Serializable{
    int concepto1;
    int concepto2;

    public clsConceptosDTO(int concepto1, int concepto2) {
        this.concepto1 = concepto1;
        this.concepto2 = concepto2;
    }

    public int getConcepto1() {
        return concepto1;
    }

    public void setConcepto1(int concepto1) {
        this.concepto1 = concepto1;
    }

    public int getConcepto2() {
        return concepto2;
    }

    public void setConcepto2(int concepto2) {
        this.concepto2 = concepto2;
    }
    
}
