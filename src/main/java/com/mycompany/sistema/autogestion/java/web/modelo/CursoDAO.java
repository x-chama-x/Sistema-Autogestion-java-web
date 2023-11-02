/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Francisco
 */
public class CursoDAO implements DAO<Curso, Integer> {

    public void addCurso(Curso curso) {

    }
    
    @Override
    public void insertar(Curso entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public List<Curso> listar() {
        List<Curso> cursos = new LinkedList<>(); 
        String query = "SELECT * FROM cursada";
        try (Connection con = ConnectionPool.getInstance().getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                cursos.add(rsRowToCurso(rs));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return cursos;
    }

    @Override
    public Curso buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void insertarCursos() {

    }

    private Curso rsRowToCurso(ResultSet rs) {
        try {
            int idCursada = rs.getInt("id_cursada");
            String anioDivision = rs.getString("anio_division");
            return new Curso(idCursada, anioDivision);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

