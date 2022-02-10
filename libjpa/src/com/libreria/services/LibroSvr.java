package com.libreria.services;

import java.util.List;

import com.libreria.model.Libro;

public interface LibroSvr {
   List<Libro> findAll();
   void guardar(Libro ob);
   void actualizar(Libro ob);
   void eliminar(Libro ob);
}
