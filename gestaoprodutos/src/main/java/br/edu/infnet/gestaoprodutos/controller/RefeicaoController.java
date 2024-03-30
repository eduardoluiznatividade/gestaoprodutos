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

import br.edu.infnet.gestaoprodutos.model.Bebida;
import br.edu.infnet.gestaoprodutos.model.Refeicao;
import br.edu.infnet.gestaoprodutos.service.RefeicaoService;

@Controller
@RequestMapping("/gestaoprodutos")
public class RefeicaoController {
	
	@Autowired
	RefeicaoService refeicaoService;
	
	@GetMapping("/refeicao/listar")
	public String listar(Model model,Refeicao refeicao) {
		Optional<List<Refeicao>> opListaRefeicao = refeicaoService.pesquisarTodos();
		try {
			List<Refeicao> ListaRefeicao = opListaRefeicao.get();
			model.addAttribute("refeicao",ListaRefeicao);
		}catch(Exception e) {
			return "refeicao/listar-refeicoes";
		}	
		return "refeicao/listar-refeicoes";
	}
	
	@GetMapping("/refeicao/pesquisar")
	public String pesquisar(RedirectAttributes attributes,Model model) {
		
		model.addAttribute("refeicao",model.getAttribute("refeicaoEncontrada"));
			
		return "/refeicao/pesquisar-refeicao";
	}
	
	@PostMapping("/refeicao/pesquisar")
	public String procuraRefeicao(Model model,Long id,RedirectAttributes attributes) {
		
		Optional<Refeicao> opRefeicao = refeicaoService.pesquisarPorCodigo(id);
		try {
			Refeicao refeicaoEncontrada = opRefeicao.get();
			System.out.println(refeicaoEncontrada);
			attributes.addFlashAttribute("refeicaoEncontrada",refeicaoEncontrada);
		}catch(Exception ex) {
			
		}	
		return "redirect:../refeicao/pesquisar";
	}
	
	
	@GetMapping("/refeicao/cadastrar")
	public String cadastrar(Model model,Refeicao refeicao) {
		model.addAttribute("refeicao",refeicao);
		return "/refeicao/cadastrar-refeicao";
	}
	
	@PostMapping("/refeicao/cadastrar")
	public String add(Model model,Refeicao refeicao,RedirectAttributes redirect) {
		try {
			
			refeicaoService.salvar(refeicao);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//redirecionar para pagina de erro
		}
		
		return "redirect:../refeicao/listar";
	}

}
