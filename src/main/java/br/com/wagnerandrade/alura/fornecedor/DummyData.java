package br.com.wagnerandrade.alura.fornecedor;

import br.com.wagnerandrade.alura.fornecedor.core.entities.InfoFornecedor;
import br.com.wagnerandrade.alura.fornecedor.core.entities.Pedido;
import br.com.wagnerandrade.alura.fornecedor.core.entities.PedidoItem;
import br.com.wagnerandrade.alura.fornecedor.core.entities.Produto;
import br.com.wagnerandrade.alura.fornecedor.core.enums.PedidoStatusEnum;
import br.com.wagnerandrade.alura.fornecedor.core.repositories.InfoRepository;
import br.com.wagnerandrade.alura.fornecedor.core.repositories.PedidoRepository;
import br.com.wagnerandrade.alura.fornecedor.core.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DummyData implements CommandLineRunner {

    private final InfoRepository infoRepository;
    private final ProdutoRepository produtoRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {
        this.infoRepository.deleteAll();
        ;

        List<InfoFornecedor> infoFornecedors = List.of(
                new InfoFornecedor(1L, "Fornecedor-ES", "ES", "Endereço do fornecedor do ES"),
                new InfoFornecedor(2L, "Fornecedor-GO", "GO", "Endereço do fornecedor do GO"),
                new InfoFornecedor(3L, "Fornecedor-RJ", "RJ", "Endereço do fornecedor do RJ"),
                new InfoFornecedor(4L, "Fornecedor-SP", "SP", "Endereço do fornecedor do SP")
        );
        this.infoRepository.saveAll(infoFornecedors);

        Produto produto1 = new Produto(null, "Ipad 1", "ES", "Descrição do Ipad", new BigDecimal("2300.0"));
        Produto produto2 = new Produto(null, "Ipad 2", "GO", "Descrição do Ipad", new BigDecimal("4500.0"));
        Produto produto3 = new Produto(null, "Ipad 3", "GO", "Descrição do Ipad", new BigDecimal("9990.0"));
        Produto produto4 = new Produto(null, "Ipad 4", "RJ", "Descrição do Ipad", new BigDecimal("1540.0"));
        Produto produto5 = new Produto(null, "Ipad 5", "SP", "Descrição do Ipad", new BigDecimal("25440.0"));
        this.produtoRepository.saveAll(Arrays.asList(produto1, produto2, produto3, produto4, produto5));

        PedidoItem pedidoItem1 = new PedidoItem(null, 5, produto1);
        PedidoItem pedidoItem2 = new PedidoItem(null, 52, produto1);
        PedidoItem pedidoItem3 = new PedidoItem(null, 19, produto2);
        PedidoItem pedidoItem4 = new PedidoItem(null, 2, produto3);
        PedidoItem pedidoItem5 = new PedidoItem(null, 8, produto4);
        PedidoItem pedidoItem6 = new PedidoItem(null, 8, produto5);
        List<PedidoItem> pedidoItems = Arrays.asList(pedidoItem1, pedidoItem2, pedidoItem3, pedidoItem4, pedidoItem5, pedidoItem6);

        Pedido pedido1 = new Pedido(null, 30, PedidoStatusEnum.RECEBIDO, pedidoItems);
        Pedido pedido2 = new Pedido(null, 20, PedidoStatusEnum.PRONTO, pedidoItems);
        Pedido pedido3 = new Pedido(null, 60, PedidoStatusEnum.RECEBIDO, pedidoItems);
        Pedido pedido4 = new Pedido(null, 10, PedidoStatusEnum.ENVIADO, pedidoItems);
        Pedido pedido5 = new Pedido(null, 45, PedidoStatusEnum.PRONTO, pedidoItems);
        this.pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2, pedido3, pedido4, pedido5));
    }
}