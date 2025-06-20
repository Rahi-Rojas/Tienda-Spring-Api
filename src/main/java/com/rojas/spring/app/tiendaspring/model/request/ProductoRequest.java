package com.rojas.spring.app.tiendaspring.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request para actualizar un producto")
public class ProductoRequest {
    @Schema(description = "Nombre del Producto", example = "Camiseta Seleccion Peruana")
    private String nombre;
    @Schema(description = "Descripcion del producto", example = "Camiseta deportiva moderna de la seleccion")
    private String descripcion;
}
