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
public class MateriaDAO implements DAO<Materia, Integer> {

    @Override
    public void insertar(Materia entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Materia entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Materia id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Materia> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Materia buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /* private static int contador = 1;
    private List<Materia> materias;

    public MateriaDAO() {
        this.materias = new ArrayList<>();
        insertarMaterias();
    }

    @Override
    public void insertar(Materia materia) {
        materia.setIdMateria(contador);
        materias.add(materia);
        contador++;
    }

    @Override
    public void modificar(Materia entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Materia id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Materia> listar() {
        return new ArrayList<>(this.materias);
    }

    @Override
    public Materia buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void insertarMaterias() {
        insertar(new Materia(contador, "Matemática"));
        insertar(new Materia(contador, "Historia"));
        insertar(new Materia(contador, "Ciencias Naturales"));
        insertar(new Materia(contador, "Geografía"));
        insertar(new Materia(contador, "Lengua y Literatura"));
        insertar(new Materia(contador, "Inglés"));
        insertar(new Materia(contador, "Educación Física"));
        insertar(new Materia(contador, "Educación Artística"));
        insertar(new Materia(contador, "Tecnología"));
        insertar(new Materia(contador, "Formación Ética y Ciudadana"));
    } */
    
}
