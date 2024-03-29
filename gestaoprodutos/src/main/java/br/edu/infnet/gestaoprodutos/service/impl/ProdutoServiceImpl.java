package br.edu.infnet.gestaoprodutos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.gestaoprodutos.repository.ProdutoRepository;
import br.edu.infnet.gestaoprodutos.model.Produto;
import br.edu.infnet.gestaoprodutos.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository;
	
	@Override
	public Optional<List<Produto>> pesquisarTodos() {
		List<Produto> resultados = produtoRepository.findAll();
		
		return resultados.isEmpty()
		? Optional.empty()
				: Optional.of(resultados);
	}
	@Override
	public Optional<Produto> pesquisarPorCodigo(Long codigo) {
		return produtoRepository.findById(codigo);
		
	}
	@Override
	public void deletar(Produto produto)throws Exception{
		produtoRepository.delete(produto);
	}
	
}
