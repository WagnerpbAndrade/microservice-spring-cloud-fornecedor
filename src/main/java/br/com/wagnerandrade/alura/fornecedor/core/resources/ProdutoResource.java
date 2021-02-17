package br.com.wagnerandrade.alura.fornecedor.core.resources;

import br.com.wagnerandrade.alura.fornecedor.core.entities.Produto;
import br.com.wagnerandrade.alura.fornecedor.core.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
@RequiredArgsConstructor
public class ProdutoResource {

	private final ProdutoService produtoService;
	
	@GetMapping("/{estado}")
	public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
		return produtoService.getProdutosPorEstado(estado);
	}
}
