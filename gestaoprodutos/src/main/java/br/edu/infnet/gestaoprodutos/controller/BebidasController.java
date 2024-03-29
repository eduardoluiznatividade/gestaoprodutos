package br.edu.infnet.gestaoprodutos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gestaoprodutos")
public class BebidasController {
	
	@GetMapping("/bebida/listar")
	public String listar() {
		return "/bebida/listar-bebidas";
	}
	
	@GetMapping("/bebida/pesquisar")
	public String pesquisar() {
		return "/bebida/pesquisar-bebida";
	}
	
	
	@GetMapping("/bebida/cadastrar")
	public String cadastrar() {
		return "/bebida/cadastrar-bebida";
	}

}
