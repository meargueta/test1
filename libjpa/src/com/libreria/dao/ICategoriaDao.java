package com.libreria.dao;



import java.util.List;

import com.libreria.model.Categoria;
import com.libreria.persistencia.DaoGenerico;

public interface ICategoriaDao extends DaoGenerico<Categoria, Long>{
 List<Categoria> findAll();

}
