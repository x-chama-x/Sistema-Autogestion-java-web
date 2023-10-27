/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Manuel Botas
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String legajo;
    private String contrasenia;
    private boolean estado;

    public Usuario(int idUsuario, String nombre, String apellido, String legajo, String contrasenia) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.contrasenia = contrasenia;
        this.estado = true;
    }
    
    
}
