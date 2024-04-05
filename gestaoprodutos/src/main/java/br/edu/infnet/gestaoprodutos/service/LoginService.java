package br.edu.infnet.gestaoprodutos.service;

import java.util.Optional;
import br.edu.infnet.gestaoprodutos.model.Login;

public interface LoginService {
	
	public Optional<Login> findByEmail(String email);

}
