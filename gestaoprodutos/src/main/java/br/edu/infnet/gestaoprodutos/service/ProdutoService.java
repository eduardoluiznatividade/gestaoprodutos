package br.edu.infnet.gestaoprodutos.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestaoprodutos.model.Produto;

public interface ProdutoService {

	public Optional<List<Produto>> pesquisarTodos();
	
	public void deletar(Produto produto) throws Exception;
	
	public Optional<Produto> pesquisarPorCodigo(Long codigo);
}
