package br.com.wagnerandrade.alura.fornecedor.core.entities;

import br.com.wagnerandrade.alura.fornecedor.core.enums.PedidoStatusEnum;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer tempoDePreparo;

	@Enumerated(EnumType.STRING)
	private PedidoStatusEnum status;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedidoId")
	private List<PedidoItem> itens;
}
