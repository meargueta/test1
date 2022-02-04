package com.libreria.services;

import java.util.List;

import com.libreria.model.Categoria;

public interface CategoriaSvr {
     List<Categoria> findAll();
     void guardar(Categoria c);
     void actualizar(Categoria c);
     void eliminar(Categoria c);
     
     
}
