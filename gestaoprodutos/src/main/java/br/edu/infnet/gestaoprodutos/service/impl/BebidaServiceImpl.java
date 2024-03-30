package br.edu.infnet.gestaoprodutos.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.infnet.gestaoprodutos.model.Bebida;
import br.edu.infnet.gestaoprodutos.repository.BebidaRepository;
import br.edu.infnet.gestaoprodutos.service.BebidaService;

@Service
public class BebidaServiceImpl implements BebidaService{

	private BebidaRepository bebidaRepository;
	
	public BebidaServiceImpl(BebidaRepository bebidaRepository) {
		this.bebidaRepository = bebidaRepository;
	}
	

	@Override
	public Bebida salvar(Bebida bebida) {
		Bebida bebidaSalva = bebidaRepository.save(bebida);
		return bebidaSalva;
	}



	@Override
	public Optional<List<Bebida>> pesquisarTodos() {
		List<Bebida> resultados = bebidaRepository.findAll();
		
		return resultados.isEmpty()
		? Optional.empty()
				: Optional.of(resultados);
	}
	
	@Override
	public Optional<Bebida> pesquisarPorCodigo(Long codigo) {
		return bebidaRepository.findById(codigo);
		
	}
	@Override
	public Bebida atualizar(Bebida bebida)throws Exception{
		return bebidaRepository.save(bebida);
	}
	@Override
	public void deletar(Bebida bebida)throws Exception{
		bebidaRepository.delete(bebida);
	}

}
