package br.edu.infnet.gestaoprodutos.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestaoprodutos.model.Sobremesa;

public interface SobremesaService {

	public Sobremesa salvar (Sobremesa sobremesa)throws Exception ;

	public Sobremesa atualizar(Sobremesa sobremesa)throws Exception;
	
	public Optional<List<Sobremesa>> pesquisarTodos();

	public void deletar(Sobremesa sobremesa) throws Exception;
	
	public Optional<Sobremesa> pesquisarPorCodigo(Long codigo);
}

