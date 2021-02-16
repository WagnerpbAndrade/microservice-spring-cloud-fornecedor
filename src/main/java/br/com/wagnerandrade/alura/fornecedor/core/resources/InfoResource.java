package br.com.wagnerandrade.alura.fornecedor.core.resources;

import br.com.wagnerandrade.alura.fornecedor.core.services.InforService;
import br.com.wagnerandrade.alura.fornecedor.core.transport.InfoFornecedorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
@RequiredArgsConstructor
public class InfoResource {

    private final InforService inforService;

    @GetMapping("/{estado}")
    public ResponseEntity<InfoFornecedorDTO> getInfoPorEstado(@PathVariable String estado) {
        return ResponseEntity.ok().body(this.inforService.getInfoPorEstado(estado));
    }
}
