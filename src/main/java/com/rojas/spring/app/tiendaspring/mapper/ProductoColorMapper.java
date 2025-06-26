package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.ProductoColor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoColorMapper {
    //todo: Crear desde dto de entrada (para Post/Put)
    ProductoColor toEntity(ProductoColor productoColor);

}
