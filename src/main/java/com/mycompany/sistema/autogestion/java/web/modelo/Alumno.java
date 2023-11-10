/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Francisco
 */
public class Alumno extends Usuario {
    private int idAlumno;
    private int idCursada;

    // TODO Agregar atributo idCursada al constructor
    public Alumno(int idAlumno,/* int idCursada,*/ int idUsuario, String nombre, String apellido, String email, String contrasenia, Estado estado) {
        super(idUsuario, nombre, apellido, email, contrasenia, estado);
        this.idAlumno = idAlumno;
        //this.idCursada = idCursada;
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
