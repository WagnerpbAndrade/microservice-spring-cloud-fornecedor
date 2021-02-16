package br.com.wagnerandrade.alura.fornecedor.core.mappers;

import br.com.wagnerandrade.alura.fornecedor.core.entities.InfoFornecedor;
import br.com.wagnerandrade.alura.fornecedor.core.transport.InfoFornecedorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InfoMapper {
    InfoMapper instance = Mappers.getMapper(InfoMapper.class);

    InfoFornecedorDTO toInfoFonecedorDTO(InfoFornecedor infoFornecedor);
}
