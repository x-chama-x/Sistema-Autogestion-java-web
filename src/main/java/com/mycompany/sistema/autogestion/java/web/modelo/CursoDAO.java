/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco
 */
public class CursoDAO implements DAO<Curso, Integer> {
    private static int contador = 1;
    private List <Curso> cursos;

    public CursoDAO() {
        this.cursos = new ArrayList<>();
        insertarCursos();
    }
    
    @Override
    public void insertar(Curso curso) {
        curso.setId_cursada(contador);
        cursos.add(curso);
        contador++;
    }

    @Override
    public void modificar(Curso entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Curso id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Curso> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Curso buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void insertarCursos() {
        insertar(new Curso(contador,"15"));
        insertar(new Curso(contador,"13"));
        insertar(new Curso(contador,"25"));
        insertar(new Curso(contador,"23"));
        insertar(new Curso(contador,"33"));
        insertar(new Curso(contador,"35"));
    }
}

