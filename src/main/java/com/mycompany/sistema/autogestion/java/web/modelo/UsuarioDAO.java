/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Manuel Botas
 */
public class UsuarioDAO implements DAO<Usuario, Integer> {

    @Override
    public void insertar(Usuario entidad) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public void modificar(Usuario entidad) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public void eliminar(Usuario id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<Usuario> listar() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Usuario buscar(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    public Usuario buscar(String mail, String contrasenia) {
        Usuario u = null;
        String query = "SELECT * FROM usuario WHERE email = ? AND contraseña = ?";
        try(Connection con = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, mail);
            ps.setString(2, contrasenia);
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()) {
                    u = rsRowToUsuario(rs);
                }
            } catch(SQLException ex) {
                throw new RuntimeException();
            }
        } catch(SQLException ex) {
            throw new RuntimeException();
        }
        return u;
    }
    
    private Usuario rsRowToUsuario(ResultSet rs) {
        try {
            int idUsuario = rs.getInt("id_usuario");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String email = rs.getString("email");
            String contrasenia = rs.getString("contraseña");
            Estado estado = Estado.valueOf(rs.getString("estado"));
            return new Usuario(idUsuario, nombre, apellido, email, contrasenia, estado);
        } catch(SQLException ex) {
            throw new RuntimeException();
        }
    }
}
