package br.edu.infnet.gestaoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gestaoprodutos.model.Refeicao;

@Repository
public interface RefeicaoRepository extends JpaRepository<Refeicao,Long> {


}
