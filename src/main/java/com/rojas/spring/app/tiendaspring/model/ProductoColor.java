package com.rojas.spring.app.tiendaspring.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto_color")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductoColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_color")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false) //la llave foranea
    private Producto producto;

    //la llave foranea lleva el joincolumn
    @ManyToOne
    @JoinColumn(name = "id_color", nullable = false) //la llave fonarea el nombre
    private Color color;
    //todo: mapped by la llave foranea ya fue establecida y le das el atributo
    @OneToMany(mappedBy = "producto_color", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Stock> stocks = new ArrayList<>();

    @OneToMany(mappedBy = "producto_color", cascade = CascadeType.ALL, orphanRemoval = true)
    //todo: cuando es muchos va a una lista de esos
    private List<ImagenProductoColor> imagenes = new ArrayList<>();
}
