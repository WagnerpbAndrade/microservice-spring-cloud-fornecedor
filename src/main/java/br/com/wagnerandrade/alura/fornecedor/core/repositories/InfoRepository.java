package br.com.wagnerandrade.alura.fornecedor.core.repositories;


import br.com.wagnerandrade.alura.fornecedor.core.entities.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {

    Optional<InfoFornecedor> findByEstado(String estado);
}
