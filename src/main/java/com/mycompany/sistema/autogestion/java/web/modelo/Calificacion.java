
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Manuel Botas
 */
public class Calificacion {
    private int idCalificacion;
    private int nota;
    private int numExamen;
    private String materia;

    public Calificacion(int idCalificacion, int nota, int numExamen) {
        this.idCalificacion = idCalificacion;
        this.nota = nota;
        this.numExamen = numExamen;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getNumExamen() {
        return numExamen;
    }

    public void setNumExamen(int numExamen) {
        this.numExamen = numExamen;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
