package br.edu.infnet.gestaoprodutos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.infnet.gestaoprodutos.model.Sobremesa;
import br.edu.infnet.gestaoprodutos.repository.SobremesaRepository;
import br.edu.infnet.gestaoprodutos.service.SobremesaService;

@Service
public class SobremesaServiceImpl implements SobremesaService{

private SobremesaRepository sobremesaRepository;
	
	public SobremesaServiceImpl(SobremesaRepository sobremesaRepository) {
		this.sobremesaRepository = sobremesaRepository;
	}
	

	@Override
	public Sobremesa salvar(Sobremesa sobremesa) {
		Sobremesa sobremesaSalva = sobremesaRepository.save(sobremesa);
		return sobremesaSalva;
	}


	@Override
	public Optional<List<Sobremesa>> pesquisarTodos() {
		List<Sobremesa> resultados = sobremesaRepository.findAll();
		
		return resultados.isEmpty()
		? Optional.empty()
				: Optional.of(resultados);
	}
	
	@Override
	public Optional<Sobremesa> pesquisarPorCodigo(Long codigo) {
		return sobremesaRepository.findById(codigo);
		
	}
	@Override
	public Sobremesa atualizar(Sobremesa refeicao)throws Exception{
		return sobremesaRepository.save(refeicao);
	}
	@Override
	public void deletar(Sobremesa refeicao)throws Exception{
		sobremesaRepository.delete(refeicao);
	}
	
}

