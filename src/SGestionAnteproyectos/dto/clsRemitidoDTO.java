/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGestionAnteproyectos.dto;

import java.io.Serializable;

/**
 *
 * @author Cristian Pinto
 */
public class clsRemitidoDTO  implements Serializable{
    private int codigo;
    private String departamentoDirector;

    public clsRemitidoDTO(int codigo, String departamentoDirector) {
        this.codigo = codigo;
        this.departamentoDirector = departamentoDirector;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDepartamentoDirector() {
        return departamentoDirector;
    }

    public void setDepartamentoDirector(String departamentoDirector) {
        this.departamentoDirector = departamentoDirector;
    }
    
    
}
