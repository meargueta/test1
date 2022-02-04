package com.libreria.services;

import java.util.List;

import com.libreria.model.Autor;
import com.libreria.model.Categoria;

public interface AutorSvr {
	 List<Autor> findAll();
     void guardar(Autor c);
     void actualizar(Autor c);
     void eliminar(Autor c);
}
