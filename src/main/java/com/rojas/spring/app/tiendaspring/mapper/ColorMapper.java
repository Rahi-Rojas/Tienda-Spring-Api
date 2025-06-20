package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.Color;
import com.rojas.spring.app.tiendaspring.model.request.ColorRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ColorMapper {

    Color toEntity(ColorRequest colorRequest);

    ColorRequest toRequest(Color color);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromRequest(ColorRequest colorRequest, @MappingTarget Color color);

}
