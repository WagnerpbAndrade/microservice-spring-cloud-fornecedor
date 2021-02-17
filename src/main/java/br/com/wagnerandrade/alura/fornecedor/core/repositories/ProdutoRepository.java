package br.com.wagnerandrade.alura.fornecedor.core.repositories;

import br.com.wagnerandrade.alura.fornecedor.core.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByEstado(String estado);
	
	List<Produto> findByIdIn(List<Long> ids);
}
