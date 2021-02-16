package br.com.wagnerandrade.alura.fornecedor;

import br.com.wagnerandrade.alura.fornecedor.core.entities.InfoFornecedor;
import br.com.wagnerandrade.alura.fornecedor.core.repositories.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DummyData implements CommandLineRunner {

    private final InfoRepository infoRepository;

    @Override
    public void run(String... args) throws Exception {
        this.infoRepository.deleteAll();;

        List<InfoFornecedor> infoFornecedors = List.of(
                new InfoFornecedor(1L, "Fornecedor-ES", "ES", "Endereço do fornecedor do ES"),
                new InfoFornecedor(2L, "Fornecedor-GO", "GO", "Endereço do fornecedor do GO"),
                new InfoFornecedor(3L, "Fornecedor-RJ", "RJ", "Endereço do fornecedor do RJ"),
                new InfoFornecedor(4L, "Fornecedor-SP", "SP", "Endereço do fornecedor do SP")
        );

        this.infoRepository.saveAll(infoFornecedors);
    }
}
