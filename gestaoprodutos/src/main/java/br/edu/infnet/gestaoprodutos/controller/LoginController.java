package br.edu.infnet.gestaoprodutos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.edu.infnet.gestaoprodutos.model.Login;
import br.edu.infnet.gestaoprodutos.service.LoginService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/gestaoprodutos")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login/login")
	public String login(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		
		return "/login/login";
	}

	@PostMapping("/login/autorizarAcesso")
	public String autorizar(Login login, HttpSession session) {
		
		String paginaRetorno = "redirect:/gestaoprodutos";
		
		Optional<Login> optionalLogin = loginService.findByEmail(login.getEmail());
		
		if (!optionalLogin.isEmpty()) {
			
			if (optionalLogin.get().getEmail().equals(login.getEmail())) {
				session.setAttribute("loginAutorizado", optionalLogin.get());
				
				paginaRetorno = "redirect:/gestaoprodutos";
			}
		}
				
		return paginaRetorno;
		
	}
	
	 @GetMapping("/login/logout")
	    public String logout(HttpSession session){
	        session.setAttribute("loginAutorizado", null);
	        
	        return  "redirect:/gestaoprodutos";
	    }
}
