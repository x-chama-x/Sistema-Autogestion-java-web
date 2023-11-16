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
    public List<Materia> listar() {
        List<Materia> materias = new LinkedList<>();
        String query = "SELECT * FROM materia";
        try(Connection con = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                materias.add(rsRowToMateria(rs));
            }
        } catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return materias;
    }

    private Materia rsRowToMateria(ResultSet rs) {
        try {
            int idMateria = rs.getInt("id_materia");
            String nombre = rs.getString("nombre");
            return new Materia(idMateria, nombre);
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Materia buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int obtenerIDporMateria(String materia){
        int id=0;
        String query = "SELECT id_materia FROM materia" + 
                "WHERE materia.nombre = ?";
        try (Connection con = ConnectionPool.getInstance().getConnection();
                PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, materia);
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    id=rs.getInt("id_materia");
                }
            } catch (SQLException x){
                throw new RuntimeException (x);
            }
        } catch (SQLException x){
            throw new RuntimeException (x);
        }
        return id;
    }
    
}
