
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Manuel Botas
 */
public class Calificacion {
    private int idCalificacion;
    private int nota;
    private int num_examen;

    public Calificacion(int idCalificacion, int nota, int num_examen) {
        this.idCalificacion = idCalificacion;
        this.nota = nota;
        this.num_examen = num_examen;
    }
}
