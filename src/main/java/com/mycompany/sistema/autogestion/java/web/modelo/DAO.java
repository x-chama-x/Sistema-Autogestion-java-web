
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.util.List;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface DAO<T, K> {
    void insertar(T entidad) throws Exception;
    void modificar(T entidad) throws Exception;
    void eliminar(T id) throws Exception;
    List<T> listar() throws Exception;
    T buscar(K id) throws Exception;
}
