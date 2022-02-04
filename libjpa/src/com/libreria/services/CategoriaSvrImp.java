package com.libreria.services;

import java.util.List;

import com.libreria.dao.CategoriaDaoImp;
import com.libreria.model.Categoria;

public class CategoriaSvrImp implements CategoriaSvr{
    CategoriaDaoImp cdao = new CategoriaDaoImp();
	@Override
	public List<Categoria> findAll() {
		
		return cdao.findAll();
	}

	@Override
	public void guardar(Categoria c) {
		cdao.Guardar(c);
		
	}

	@Override
	public void actualizar(Categoria c) {
		cdao.Actualizar(c);
		
	}

	@Override
	public void eliminar(Categoria c) {
		cdao.Eliminar(c);
		
	}
	

}
