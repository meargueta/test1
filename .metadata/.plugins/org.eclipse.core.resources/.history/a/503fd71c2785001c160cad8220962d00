package com.libreria.services;

import java.util.List;

import com.libreria.dao.AutorDao;
import com.libreria.model.Autor;

public class AutorSvrImp implements AutorSvr {
    AutorDao autd = new AutorDao();
	@Override
	public List<Autor> findAll() {
		
		return autd.findAll();
	}

	@Override
	public void guardar(Autor c) {
		autd.Guardar(c);
		
	}

	@Override
	public void actualizar(Autor c) {
		autd.Actualizar(c);
		
	}

	@Override
	public void eliminar(Autor c) {
		autd.Eliminar(c);
		
	}

}
