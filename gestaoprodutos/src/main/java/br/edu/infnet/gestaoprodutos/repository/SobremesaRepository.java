package br.edu.infnet.gestaoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.gestaoprodutos.model.Sobremesa;

@Repository
public interface SobremesaRepository extends JpaRepository<Sobremesa, Long> {

}
