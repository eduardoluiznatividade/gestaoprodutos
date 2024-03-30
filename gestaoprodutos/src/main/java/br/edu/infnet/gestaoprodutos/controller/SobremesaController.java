package br.edu.infnet.gestaoprodutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.infnet.gestaoprodutos.model.Sobremesa;
import br.edu.infnet.gestaoprodutos.service.SobremesaService;

@Controller
@RequestMapping("/gestaoprodutos")
public class SobremesaController {
	
	@Autowired
	SobremesaService sobremesaService;
	@GetMapping("/sobremesa/cadastrar")
	public String cadastrar(Model model,Sobremesa sobremesa) {
		model.addAttribute("sobremesa",sobremesa);
		return "/sobremesa/cadastrar-sobremesa";
	}
	
	@GetMapping("/sobremesa/listar")
	public String listar() {
		return "/sobremesa/listar-sobremesas";
	}
	
	@GetMapping("/sobremesa/pesquisar")
	public String pesquisar() {
		return "/sobremesa/pesquisar-sobremesa";
	}
	
	@PostMapping("/sobremesa/cadastrarSobremesa")
	public String add(Model model,Sobremesa sobremesa,RedirectAttributes redirect) {
		try {
			sobremesaService.salvar(sobremesa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//redirecionar para pagina de erro
		}
		
		return "redirect:../home";
	}
	 
	

}
