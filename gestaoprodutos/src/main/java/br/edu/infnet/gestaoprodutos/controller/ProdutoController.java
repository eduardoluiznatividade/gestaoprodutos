package br.edu.infnet.gestaoprodutos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gestaoprodutos")
public class ProdutoController {
	
	@GetMapping("/produto/listar")
	public String listar() {
		return "/produto/listar-produtos";
	}
	
	@GetMapping("/produto/pesquisar")
	public String pesquisar() {
		return "/produto/pesquisar-produto";
	}
	

}
