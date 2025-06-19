package com.rojas.spring.app.tiendaspring.model;

import jakarta.persistence.*;
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
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;
    private String nombre;
    private String descripcion;

    @ManyToOne
    //todo: Las tablas que dependen de otra tienen llaves foraneas en bd y en el model
    //todo: Es la llave foranea
    @JoinColumn(name = "id_categoria", nullable = false) //todo: llave foranea
    //todo: no ponemos id porque jpa trabaja con objetos
    //todo: este nombre va a ir al otro lado de la relacion!
    private Categoria categoria;
    //todo: Relacion Inversa
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductoColor> colores = new ArrayList<>();

}
