package com.lucena.agendadortarefas.business.mapper;

import com.lucena.agendadortarefas.business.dto.TarefasDTO;
import com.lucena.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);
    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
