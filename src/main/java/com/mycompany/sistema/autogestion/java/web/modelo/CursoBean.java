
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.io.Serializable;

/**
 *
 * @author Francisco
 */
public class CursoBean implements Serializable {
    private int id_cursada;
    private String anioDivision;

    public CursoBean() {
    }

    public CursoBean(int id_cursada, String anioDivision) {
        this.id_cursada = id_cursada;
        this.anioDivision = anioDivision;
    }

    public int getId_cursada() {
        return id_cursada;
    }

    public void setId_cursada(int id_cursada) {
        this.id_cursada = id_cursada;
    }

    public String getAnioDivision() {
        return anioDivision;
    }

    public void setAnioDivision(String anioDivision) {
        this.anioDivision = anioDivision;
    }

}
