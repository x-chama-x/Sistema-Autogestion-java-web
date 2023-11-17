
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Manuel Botas
 */
public class ProfesorBean extends UsuarioBean {
    private int idProfesor;

    public ProfesorBean() {
        super();
    }

    public ProfesorBean(int idProfesor, int idUsuario, String nombre, String apellido, String email, String contrasenia, Estado estado) {
        super(idUsuario, nombre, apellido, email, contrasenia, estado);
        this.idProfesor = idProfesor;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }    
    
}
