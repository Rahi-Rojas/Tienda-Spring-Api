package com.rojas.spring.app.tiendaspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_color")
    private Long id;
    @NotBlank(message = "El nombre es Obligatorio")
    @Size(min = 3, message = "El nombre debe tener mas de 3 caracteres")
    private String nombre;
    @Column(name = "hexadecimal")
    private String codigoColor;

    @OneToMany(mappedBy = "color", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductoColor> productos = new ArrayList<>();
}
