
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.io.Serializable;

/**
 *
 * @author Manuel Botas
 */
public class MateriaBean implements Serializable {
    private int idMateria;
    private String nombre;

    public MateriaBean() {
    }

    public MateriaBean(int idMateria, String nombre) {
        this.idMateria = idMateria;
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
