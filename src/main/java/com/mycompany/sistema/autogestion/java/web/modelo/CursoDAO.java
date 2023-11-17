
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco
 */
public class CursoDAO implements DAO<CursoBean, Integer> {
    private static int contador = 1;
    private List <CursoBean> cursos;

    public CursoDAO() {
        this.cursos = new ArrayList<>();
        insertarCursos();
    }
    
    @Override
    public void insertar(CursoBean curso) {
        curso.setId_cursada(contador);
        cursos.add(curso);
        contador++;
    }

    @Override
    public void modificar(CursoBean entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(CursoBean id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<CursoBean> listar() {
        return new ArrayList<>(this.cursos);
    }

    @Override
    public CursoBean buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void insertarCursos() {
        insertar(new CursoBean(contador,"15"));
        insertar(new CursoBean(contador,"13"));
        insertar(new CursoBean(contador,"25"));
        insertar(new CursoBean(contador,"23"));
        insertar(new CursoBean(contador,"33"));
        insertar(new CursoBean(contador,"35"));
    }
    
}

