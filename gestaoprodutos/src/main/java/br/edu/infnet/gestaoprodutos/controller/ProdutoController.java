package br.edu.infnet.gestaoprodutos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.infnet.gestaoprodutos.model.Produto;
import br.edu.infnet.gestaoprodutos.service.ProdutoService;

@Controller
@RequestMapping("/gestaoprodutos")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	

	@GetMapping("/produto/pesquisar")
	public String pesquisar(Model model,RedirectAttributes attributes) {		
		model.addAttribute("produto",model.getAttribute("produtoEncontrado"));
		return "/produto/pesquisar-produto";
	}
	@PostMapping("/produto/pesquisar")
	public String pesquisar(Model model,Long codigo,RedirectAttributes attributes) {
		
		Optional<Produto> opProduto=produtoService.pesquisarPorCodigo(codigo);
		try {
			Produto produtoEncontrado = opProduto.get();
			attributes.addFlashAttribute("produtoEncontrado",produtoEncontrado);
		}catch(Exception ex) {
			
		}	
		return "redirect:/produto/pesquisar-produto";
	}
	@GetMapping("/produto/listar")
	public String listar(Model model) {
		
		Optional<List<Produto>> opListaProduto = produtoService.pesquisarTodos();
		try {
			List<Produto> ListaProduto = opListaProduto.get();
			model.addAttribute("produto",ListaProduto);
		}catch(Exception e) {
			
		}	
		return "produto/listar-produtos";
	}
	
}
