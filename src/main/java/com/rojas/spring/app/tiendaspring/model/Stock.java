package com.rojas.spring.app.tiendaspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stock")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_producto_color", nullable = false)
    private ProductoColor productoColor;

    @ManyToOne
    @JoinColumn(name = "id_talla", nullable = false)
    private Talla talla;

    @Max(value = 250, message = "La cantidad maxima es de 250.")
    @Min(value = 0 , message = "La cantidad minima es de 0.")
    @NotNull(message = "El Stock no puede estar vacio.")
    private Integer cantidad;

}
