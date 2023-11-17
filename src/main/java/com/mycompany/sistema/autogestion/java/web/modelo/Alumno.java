
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Francisco
 */
public class Alumno extends Usuario {
    private int idAlumno;
    private int idCursada;
    
    public Alumno(int idAlumno, int idUsuario, String nombre, String apellido, String email, String contrasenia, Estado estado) {
        super(idUsuario, nombre, apellido, email, contrasenia, estado);
        this.idAlumno = idAlumno;
    }

    public Alumno(int idAlumno, int idCursada, int idUsuario, String nombre, String apellido, String email, String contrasenia, Estado estado) {
        super(idUsuario, nombre, apellido, email, contrasenia, estado);
        this.idAlumno = idAlumno;
        this.idCursada = idCursada;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }
}
