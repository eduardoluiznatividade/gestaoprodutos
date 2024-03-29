package br.edu.infnet.gestaoprodutos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gestaoprodutos")
public class RefeicaoController {
	
	@GetMapping("/refeicao/listar")
	public String listar() {
		return "/refeicao/listar-refeicoes";
	}
	
	@GetMapping("/refeicao/pesquisar")
	public String pesquisar() {
		return "/refeicao/pesquisar-refeicao";
	}
	
	
	@GetMapping("/refeicao/cadastar")
	public String cadastrar() {
		return "/refeicao/cadastrar-refeicao";
	}

}
