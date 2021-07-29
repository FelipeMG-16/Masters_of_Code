package com.generation.moc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.moc.models.entity.Usuarios;
import com.generation.moc.service.IUsuariosService;

@Controller
@RequestMapping("/private")


public class PrivateController {
	
	
	@Autowired
	private IUsuariosService usuarioService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuarios usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		
		return "index";
	}

}

