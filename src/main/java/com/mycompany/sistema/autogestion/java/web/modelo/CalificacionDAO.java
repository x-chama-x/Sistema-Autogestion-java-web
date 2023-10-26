/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.util.ArrayList; 
import java.util.List;

/**
 *
 * @author Manuel Botas
 */
public class CalificacionDAO implements	DAO<Calificacion, Integer> {
    private static int contador = 1;
    private List<Calificacion> calificaciones;

    public CalificacionDAO() {
        this.calificaciones = new ArrayList<>();
        insertarCalificaciones();
    }
    
    @Override
    public void insertar(Calificacion calificacion) {
        calificacion.setIdCalificacion(contador);
        calificaciones.add(calificacion);
        contador++;
    }

    @Override
    public void modificar(Calificacion entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Calificacion id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Calificacion> listar() {
        return new ArrayList<>(this.calificaciones);
    }

    @Override
    public Calificacion buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void insertarCalificaciones() {
        addCalificacion(new Calificacion(contador, 8, 1, "Lengua"));
        addCalificacion(new Calificacion(contador, 6, 2, "Lengua"));
        addCalificacion(new Calificacion(contador, 7, 1, "Historia"));
        addCalificacion(new Calificacion(contador, 6, 1, "Educación Física"));
        addCalificacion(new Calificacion(contador, 8, 1, "Historia"));
        addCalificacion(new Calificacion(contador, 6, 2, "Biología"));
        addCalificacion(new Calificacion(contador, 3, 3, "Matemáticas"));
        addCalificacion(new Calificacion(contador, 0, 2, "Educación Física"));
        addCalificacion(new Calificacion(contador, 10, 1, "Química"));
        addCalificacion(new Calificacion(contador, 8, 1, "Geografía"));
        addCalificacion(new Calificacion(contador, 8, 3, "Historia"));
        addCalificacion(new Calificacion(contador, 7, 3, "Matemáticas"));
        addCalificacion(new Calificacion(contador, 1, 2, "Matemáticas"));
    }
}
