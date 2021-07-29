package com.generation.moc.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.generation.moc.models.dao.IUsuariosDAO;
import com.generation.moc.models.entity.Usuarios;
import com.generation.moc.service.IUsuariosService;

@Service 


public class UsuariosServiceImp  implements IUsuariosService {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	private IUsuariosDAO usuarioDao;
	
	
	@Override
	public Usuarios findByUsername(String username) {
		
		
		return usuarioDao.findByUsername(username);
	}
	
	@Override
	public Usuarios registrar(Usuarios u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return usuarioDao.save(u);
	}

}

