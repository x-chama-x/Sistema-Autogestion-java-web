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
public class AlumnoDAO implements DAO<Alumno, Integer>  {
    
    public void addAlumno(Alumno alumno){ 
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

    // obtener todos los alumnos almacenados en la BD
    @Override
    public List<Alumno> listar() {
        List <Alumno> alumnos = new LinkedList(); 
        String query = "SELECT u.nombre, u.apellido, u.email, u.estado\n" + "FROM usuario u;";
        try(Connection con = ConnectionPool.getInstance().getConnection();
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();) {
            while(rs.next()){
                alumnos.add(rsRowToAlumno(rs));
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return alumnos;
    }
    
     // obtener los alumnos por curso almacenados en la BD
    // se que no entra
    public List<Alumno> listar(int curso) {
        System.out.println("FUNCIONA ESTO OBTENERALUMNOSPORCURSO");
        List<Alumno> alumnos = new LinkedList<>();
        String query = "SELECT DISTINCT u.id_usuario, a.id_alumno, u.nombre, u.apellido, u.email, UPPER(u.estado) AS estado " +
                       "FROM usuario u " +
                       "INNER JOIN alumno a ON u.id_usuario = a.id_usuario " +
                       "INNER JOIN calificacion ca ON a.id_alumno = ca.id_alumno " +
                       "INNER JOIN materia m ON ca.id_materia = m.id_materia " +
                       "INNER JOIN `secundariabd`.`cursada/materia` cm ON m.id_materia = cm.id_materia " +
                       "INNER JOIN cursada c ON cm.id_cursada = c.id_cursada " +
                       "WHERE c.id_cursada = ? AND estado = 'ACTIVO'";

        try (Connection con = ConnectionPool.getInstance().getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, curso);
            try (ResultSet rs = ps.executeQuery()) { //ResultSet rs contiene los resultados de la consulta
                while (rs.next()) {
                    alumnos.add(rsRowToAlumno(rs)); //convertir la fila actual del ResultSet en un objeto Curso
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return alumnos;
    }
    

    @Override
    public Alumno buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Alumno rsRowToAlumno(ResultSet rs) {
        try {
            int idAlumno = rs.getInt("id_alumno");
            int idUsuario = rs.getInt("id_usuario");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String email = rs.getString("email");
            Estado estado = Estado.valueOf(rs.getString("estado"));
            return new Alumno(idAlumno,idUsuario,nombre,apellido,email,estado);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
