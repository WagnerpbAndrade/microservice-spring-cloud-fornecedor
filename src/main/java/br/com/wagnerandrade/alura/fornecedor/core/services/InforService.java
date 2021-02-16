package br.com.wagnerandrade.alura.fornecedor.core.services;

import br.com.wagnerandrade.alura.fornecedor.core.mappers.InfoMapper;
import br.com.wagnerandrade.alura.fornecedor.core.repositories.InfoRepository;
import br.com.wagnerandrade.alura.fornecedor.core.transport.InfoFornecedorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InforService {

    private final InfoRepository infoRepository;
    private final InfoMapper infoMapper;

    public InfoFornecedorDTO getInfoPorEstado(String estado) {
        return this.infoMapper.toInfoFonecedorDTO(
                this.infoRepository
                        .findByEstado(estado)
                        .orElseThrow(() -> new RuntimeException("Estado não encontrado")));
    }
}
