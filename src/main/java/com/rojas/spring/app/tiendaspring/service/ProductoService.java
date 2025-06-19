package com.rojas.spring.app.tiendaspring.service;

import com.rojas.spring.app.tiendaspring.model.Producto;
import com.rojas.spring.app.tiendaspring.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarProducto() {
        //todo: Seguridad a la lista para que no se pueda modificar
        return Collections.unmodifiableList(productoRepository.findAll());
    }
        //todo guardar sirve tambien para editar por su logica interna
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
        //todo Busqueda de productos por ID
    public Optional<Producto> buscarProductoPorId(Long id) {
        return productoRepository.findById(id);
    }
        //todo eliminar productos
    public void eliminarProductoPorId(Long id) {
        productoRepository.deleteById(id);
    }


}
