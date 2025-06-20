package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.Categoria;
import com.rojas.spring.app.tiendaspring.model.request.CategoriaRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    //todo: Crear desde dto de entrada (para Post/Put)
    Categoria toEntity(CategoriaRequest request);

    //todo: Convertir a DTO de salida (para Get)
    CategoriaRequest toRequest(Categoria categoria);

    //todo: Actualizar entidad existente (por ejemplo, en Put)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromRequest(CategoriaRequest request, @MappingTarget Categoria categoria);

}
