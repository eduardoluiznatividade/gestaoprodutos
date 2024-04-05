package br.edu.infnet.gestaoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.gestaoprodutos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	
}
