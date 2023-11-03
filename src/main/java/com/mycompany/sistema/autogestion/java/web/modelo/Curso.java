/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Francisco
 */
public class Curso {
    private int idCursada;
    private String anioDivision;

    public Curso(int id_cursada, String anioDivision) {
        this.idCursada = id_cursada;
        this.anioDivision = anioDivision;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public String getAnioDivision() {
        return anioDivision;
    }

    public void setAnioDivision(String anioDivision) {
        this.anioDivision = anioDivision;
    }


    
}
