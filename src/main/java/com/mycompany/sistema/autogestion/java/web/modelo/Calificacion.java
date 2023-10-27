
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Manuel Botas
 */
public class Calificacion {
    private int idCalificacion;
    private int nota;
    private int numExamen;
    private int idAlumno;
    private int idMateria;

    public Calificacion(int idCalificacion, int nota, int numExamen, int idAlumno, int idMateria) {
        this.idCalificacion = idCalificacion;
        this.nota = nota;
        this.numExamen = numExamen;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
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

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    
}
