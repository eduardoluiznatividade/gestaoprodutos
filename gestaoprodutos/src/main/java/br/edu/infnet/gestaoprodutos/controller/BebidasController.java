package br.edu.infnet.gestaoprodutos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.infnet.gestaoprodutos.model.Bebida;
import br.edu.infnet.gestaoprodutos.model.Sobremesa;
import br.edu.infnet.gestaoprodutos.service.BebidaService;

@Controller
@RequestMapping("/gestaoprodutos")
public class BebidasController {
	
	@Autowired
	BebidaService bebidaService;
	
	@GetMapping("/bebida/listar")
	public String listar(Model model,Bebida bebida) {
		Optional<List<Bebida>> opListaBebida = bebidaService.pesquisarTodos();
		try {
			List<Bebida> ListaBebida = opListaBebida.get();
			model.addAttribute("bebida",ListaBebida);
		}catch(Exception e) {
			return "bebida/listar-bebidas";
		}	
		return "bebida/listar-bebidas";
	}
	
	@GetMapping("/bebida/pesquisar")
	public String pesquisar(RedirectAttributes attributes,Model model) {
		
		model.addAttribute("bebida",model.getAttribute("bebidaEncontrada"));
		
		
		return "/bebida/pesquisar-bebida";
	}
	
	@PostMapping("/bebida/pesquisar")
	public String procuraBebida(Model model,Long id,RedirectAttributes attributes) {
		
		Optional<Bebida> opBebida = bebidaService.pesquisarPorCodigo(id);
		try {
			Bebida bebidaEncontrada = opBebida.get();
			System.out.println(bebidaEncontrada);
			attributes.addFlashAttribute("bebidaEncontrada",bebidaEncontrada);
		}catch(Exception ex) {
			
		}	
		return "redirect:../bebida/pesquisar";
	}
	
	
	@GetMapping("/bebida/cadastrar")
	public String cadastrar(Model model,Bebida bebida) {
		model.addAttribute("bebida",bebida);
		return "/bebida/cadastrar-bebida";
	}
	
	@PostMapping("/bebida/cadastrar")
	public String add(Model model,Bebida bebida,RedirectAttributes redirect) {
		try {
			System.out.println(bebida);
			bebidaService.salvar(bebida);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			//redirecionar para pagina de erro
		}
		
		return "redirect:../bebida/listar";
	}
	 

}
