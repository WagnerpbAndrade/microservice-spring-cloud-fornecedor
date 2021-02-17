package br.com.wagnerandrade.alura.fornecedor.core.services;

import br.com.wagnerandrade.alura.fornecedor.core.entities.Produto;
import br.com.wagnerandrade.alura.fornecedor.core.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

	private final ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}

	
}
