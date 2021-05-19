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
public class clsFormatoTiADTO implements Serializable {

    private int codigo;
    private String nombrePrograma;
    private String titulo;
    private String estudiante01;
    private int codigoestudiante01;
    private String estudiante02;
    private int codigoestudiante02;
    private String director;
    private String codirector;
    private String objetivo;
    private int flujo;
    private int codigoDirector;

    public clsFormatoTiADTO() {
    }

    public clsFormatoTiADTO(int codigo, String nombrePrograma, String titulo, String estudiante01, int codigoestudiante01, String estudiante02, int codigoestudiante02, String director, String codirector, String objetivo, int codigoDirector) {
        this.codigo = codigo;
        this.nombrePrograma = nombrePrograma;
        this.titulo = titulo;
        this.estudiante01 = estudiante01;
        this.codigoestudiante01 = codigoestudiante01;
        this.estudiante02 = estudiante02;
        this.codigoestudiante02 = codigoestudiante02;
        this.director = director;
        this.codirector = codirector;
        this.objetivo = objetivo;
        this.codigoDirector = codigoDirector;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudiante01() {
        return estudiante01;
    }

    public void setEstudiante01(String estudiante01) {
        this.estudiante01 = estudiante01;
    }

    public int getCodigoestudiante01() {
        return codigoestudiante01;
    }

    public void setCodigoestudiante01(int codigoestudiante01) {
        this.codigoestudiante01 = codigoestudiante01;
    }

    public String getEstudiante02() {
        return estudiante02;
    }

    public void setEstudiante02(String estudiante02) {
        this.estudiante02 = estudiante02;
    }

    public int getCodigoestudiante02() {
        return codigoestudiante02;
    }

    public void setCodigoestudiante02(int codigoestudiante02) {
        this.codigoestudiante02 = codigoestudiante02;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCodirector() {
        return codirector;
    }

    public void setCodirector(String codirector) {
        this.codirector = codirector;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getFlujo() {
        return flujo;
    }

    public void setFlujo(int flujo) {
        this.flujo = flujo;
    }

    public int getCodigoDirector() {
        return codigoDirector;
    }

    public void setCodigoDirector(int codigoDirector) {
        this.codigoDirector = codigoDirector;
    }

}
