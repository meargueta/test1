package com.libreria.services;

import java.util.List;

import com.libreria.dao.LibrosDaoImp;
import com.libreria.model.Libro;

public class LibroSvrImp implements LibroSvr {
    LibrosDaoImp libdao = new LibrosDaoImp();
	@Override
	public List<Libro> findAll() {
		
		return libdao.findAll();
	}

	@Override
	public void guardar(Libro ob) {
		libdao.Guardar(ob);

	}

	@Override
	public void actualizar(Libro ob) {
	   libdao.Actualizar(ob);

	}

	@Override
	public void eliminar(Libro ob) {
		libdao.Eliminar(ob);
	}

}
