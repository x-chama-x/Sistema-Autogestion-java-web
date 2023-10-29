/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Francisco
 */
public class AlumnoDAO implements DAO<Alumno, Integer>  {
    private static int contador = 1;
    private List<Alumno> alumnos;

    public AlumnoDAO() {
        this.alumnos = new ArrayList<>();
        insertarAlumnos();
    }
    
    public void addAlumno(Alumno alumno){
        alumno.setId_usuario(contador);
        alumno.setId_alumno(contador);
        alumnos.add(alumno);
        contador++;  
    }
        
    @Override
    public void insertar(Alumno entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void modificar(Alumno entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminar(Alumno id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Alumno> listar() {
        return new ArrayList<>(this.alumnos);
    }

    @Override
    public Alumno buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private void insertarAlumnos() {
        addAlumno(new Alumno(contador, contador, "Juan", "Pérez", "juan@example.com"));
        addAlumno(new Alumno(contador, contador, "María", "Gómez", "maria@example.com"));
        addAlumno(new Alumno(contador, contador, "Carlos", "Rodríguez", "carlos@example.com"));
        addAlumno(new Alumno(contador, contador, "Sara", "Torres", "saratorres@example.com"));
        addAlumno(new Alumno(contador, contador, "Andrés", "Ramírez", "andresramirez@example.com"));
    }
}
