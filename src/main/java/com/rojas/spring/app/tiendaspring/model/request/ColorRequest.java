package com.rojas.spring.app.tiendaspring.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColorRequest {
    private String nombre;
    private String codigo;
}
