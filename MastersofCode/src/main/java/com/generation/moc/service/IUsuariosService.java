package com.generation.moc.service;

import com.generation.moc.models.entity.Usuarios;

public interface IUsuariosService {
	public Usuarios findByUsername(String username);
	public Usuarios registrar(Usuarios usuario);

}