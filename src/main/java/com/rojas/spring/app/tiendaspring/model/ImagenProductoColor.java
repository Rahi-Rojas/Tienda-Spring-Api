package com.rojas.spring.app.tiendaspring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Entity
@Table(name = "imagen_producto_color")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImagenProductoColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen")
    private Long id;

    @Column(name = "url_imagen", length = 500)
    private String ImagenRuta;

    @ManyToOne
    @JoinColumn(name = "id_producto_color", nullable = false)
    private ProductoColor productoColor;

    private Integer orden;

}
