package br.edu.infnet.gestaoprodutos.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestaoprodutos.model.Bebida;

public interface BebidaService {

	public Bebida salvar (Bebida bebida)throws Exception ;
	
	public Bebida atualizar(Bebida bebida)throws Exception;
	
	public Optional<List<Bebida>> pesquisarTodos();
	
	public void deletar(Bebida bebida) throws Exception;
	
	public Optional<Bebida> pesquisarPorCodigo(Long codigo);
}