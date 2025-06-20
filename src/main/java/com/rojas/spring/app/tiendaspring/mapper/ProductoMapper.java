package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.Producto;
import com.rojas.spring.app.tiendaspring.model.request.ProductoRequest;
import com.rojas.spring.app.tiendaspring.model.response.ProductoResponse;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

    Producto toEntity(ProductoRequest request);

    ProductoResponse toResponse(Producto producto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromRequest(ProductoRequest request, @MappingTarget Producto producto);

}
