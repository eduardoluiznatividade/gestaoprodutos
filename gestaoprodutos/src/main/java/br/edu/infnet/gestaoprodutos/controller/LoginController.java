package br.edu.infnet.gestaoprodutos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gestaoprodutos")
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		return "/login/login";
	}

}
