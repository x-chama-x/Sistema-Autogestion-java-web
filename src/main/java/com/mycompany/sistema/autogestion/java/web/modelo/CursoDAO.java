
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Curso id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Curso> listar() {
        return new ArrayList<>(this.cursos);
    }

    @Override
    public Curso buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
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

