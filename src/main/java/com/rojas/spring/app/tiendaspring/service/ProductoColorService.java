package com.rojas.spring.app.tiendaspring.service;

import com.rojas.spring.app.tiendaspring.model.ProductoColor;
import com.rojas.spring.app.tiendaspring.repository.ProductoColorRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoColorService {

    private final ProductoColorRepository productoColorRepository;

    public ProductoColorService(ProductoColorRepository productoColorRepository) {
        this.productoColorRepository = productoColorRepository;
    }

    public List<ProductoColor> findAll() {
        return Collections.unmodifiableList(productoColorRepository.findAll());
    }

    public ProductoColor agregarProductoColor(ProductoColor productoColor) {
        return productoColorRepository.save(productoColor);
    }

    Optional<ProductoColor> buscarProductoColorPorId(Long id) {
        return productoColorRepository.findById(id);
    }

    public void eliminarProductoColorPorId(Long id) {
        productoColorRepository.deleteById(id);
    }

}
