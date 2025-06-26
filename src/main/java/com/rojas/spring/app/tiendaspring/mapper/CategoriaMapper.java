package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.Categoria;
import com.rojas.spring.app.tiendaspring.model.request.CategoriaRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    //todo: ComponentModel sirve para especificar con que trabajamos en este caso spring
    //Todo: Los mappers sirven para transladar datos!

    //todo: Crear desde dto de entrada (para Post/Put)
    Categoria toEntity(CategoriaRequest request);

    //todo: Convertir a DTO de salida (para Get)
    CategoriaRequest toRequest(Categoria categoria);

    //todo: Actualizar entidad existente (por ejemplo, en Put)
    //todo: Sirve para conservar los datos que no han sido actualizados!
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
                        //todo: la fuente es esta                           este el objetivo
    void updateEntityFromRequest(CategoriaRequest request, @MappingTarget Categoria categoria);
    //todo el mappingTarget es para actualizar el objeto y no crear otro
}
