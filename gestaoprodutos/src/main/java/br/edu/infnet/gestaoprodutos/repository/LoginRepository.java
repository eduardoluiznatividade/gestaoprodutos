package br.edu.infnet.gestaoprodutos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gestaoprodutos.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

	Optional<Login> findByEmail(String email);

	
}
