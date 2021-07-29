package com.generation.moc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import com.generation.moc.models.entity.Usuarios;
import com.generation.moc.service.IUsuariosService;




@Controller

public class LoginController {
	
	
	@Autowired
	private IUsuariosService usuarioService;

	
	
	
	@GetMapping("/auth/registro")
	public String registroForm(Model model) {
		model.addAttribute("usuario", new Usuarios());
		return "registro";
	}
	
	@PostMapping("/auth/registro")
	public String registro(@Validated @ModelAttribute Usuarios usuario, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "redirect:/auth/registro";
		}
		else { 
			model.addAttribute("usuario", usuarioService.registrar(usuario));
			 
		}
		return "redirect:/auth/login";
	}
	
	
}