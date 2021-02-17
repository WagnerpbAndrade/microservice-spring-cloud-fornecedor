package br.com.wagnerandrade.alura.fornecedor.core.repositories;

import br.com.wagnerandrade.alura.fornecedor.core.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
