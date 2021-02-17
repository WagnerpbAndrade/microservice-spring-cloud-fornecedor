package br.com.wagnerandrade.alura.fornecedor.core.resources;

import br.com.wagnerandrade.alura.fornecedor.core.entities.Pedido;
import br.com.wagnerandrade.alura.fornecedor.core.services.PedidoService;
import br.com.wagnerandrade.alura.fornecedor.core.transport.ItemDoPedidoDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
@RequiredArgsConstructor
public class PedidoResource {
	private static final Logger LOG = LoggerFactory.getLogger(PedidoResource.class);

	private final PedidoService pedidoService;
	
	@PostMapping
	public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
		LOG.info("Pedido recebido");
		return pedidoService.realizaPedido(produtos);
	}
	
	@RequestMapping("/{id}")
	public Pedido getPedidoPorId(@PathVariable Long id) {
		return pedidoService.getPedidoPorId(id);
	}
}
