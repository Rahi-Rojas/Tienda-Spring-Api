package com.rojas.spring.app.tiendaspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long id;
    @NotBlank(message = "El nombre es requerido")
    //Todo: Tamaño minimo de caracteres en el nombre en letras!
    @Size(min = 3, message = "El nombre debe tener mas de 3 caracteres")
    private String nombre;
    //TODO: Esto va para el que tiene el OneToMany nada mas
    //todo: Cascada es el tipo de actualizacion, type all es actualizar todo
    //todo: FetchTYPE.Higer puede servir para cargar todo
    //todo: FetchType.Lazy lo que hace es traer lo necesario de la consulta
    //todo: El nombre de "categoria" depende del atributo del otro lado
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //TODO: Cuando son muchos se pone lista para que los guarde!
    private List<Producto> productoList;
}
