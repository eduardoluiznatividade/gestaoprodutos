package br.edu.infnet.gestaoprodutos.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestaoprodutos.model.Refeicao;

public interface RefeicaoService {
	
	public Refeicao salvar (Refeicao refeicao)throws Exception ;
	
	public Refeicao atualizar(Refeicao refeicao)throws Exception;
	
	public Optional<List<Refeicao>> pesquisarTodos();
	
	public Optional<Refeicao> pesquisarPorCodigo(Long codigo);
	
	public void deletar(Refeicao refeicao) throws Exception;
}
