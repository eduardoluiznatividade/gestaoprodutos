package br.edu.infnet.gestaoprodutos.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.gestaoprodutos.model.Login;
import br.edu.infnet.gestaoprodutos.repository.LoginRepository;
import br.edu.infnet.gestaoprodutos.service.LoginService;

@Service
public class LoginServiceImp implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Optional<Login> findByEmail(String email) {
		return loginRepository.findByEmail(email);
	}

	

}
