package br.edu.infnet.gestaoprodutos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gestaoprodutos")
public class SobremesaController {
	
	@GetMapping("/sobremesa/listar")
	public String listar() {
		return "/sobremesa/listar-sobremesas";
	}
	
	@GetMapping("/sobremesa/pesquisar")
	public String pesquisar() {
		return "/sobremesa/pesquisar-sobremesa";
	}
	
	
	@GetMapping("/sobremesa/cadastrar")
	public String cadastrar() {
		return "/sobremesa/cadastrar-sobremesa";
	}

}
