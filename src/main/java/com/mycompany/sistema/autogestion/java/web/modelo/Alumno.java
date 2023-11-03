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
    private int id_alumno;

    public Alumno(int id_alumno, int id_usuario, String nombre, String apellido, String email, Estado estado) {
        super(id_usuario, nombre, apellido, email, estado);
        this.id_alumno = id_alumno;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
}
