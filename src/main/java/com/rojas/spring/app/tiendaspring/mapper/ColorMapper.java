package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.Color;
import com.rojas.spring.app.tiendaspring.model.request.ColorRequest;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ColorMapper {

    @Mapping(source = "codigo", target = "codigoColor")
    Color toEntity(ColorRequest colorRequest);
    //todo: el mapping sirve para especificar que los atributos del dto o record no son los
    //todo: mismos a los de la entidad
    @Mapping(source = "codigoColor", target = "codigo")
    ColorRequest toRequest(Color color);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromRequest(ColorRequest colorRequest, @MappingTarget Color color);

}
