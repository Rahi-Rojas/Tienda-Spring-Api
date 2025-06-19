package com.rojas.spring.app.tiendaspring.service;

import com.rojas.spring.app.tiendaspring.model.ImagenProductoColor;
import com.rojas.spring.app.tiendaspring.repository.ImagenProductoColorRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ImagenProductoColorService {

    public final ImagenProductoColorRepository imagenProductoColorRepository;

    public ImagenProductoColorService(ImagenProductoColorRepository imagenProductoColorRepository) {
        this.imagenProductoColorRepository = imagenProductoColorRepository;
    }

    public List<ImagenProductoColor> listarImagenProductoColor() {
        return Collections.unmodifiableList(imagenProductoColorRepository.findAll());
    }

    public ImagenProductoColor guardarImagenProductoColor(ImagenProductoColor imagenProductoColor) {
        return imagenProductoColorRepository.save(imagenProductoColor);
    }

    Optional<ImagenProductoColor> buscarImagenProductoColorPorId(Long id) {
        return imagenProductoColorRepository.findById(id);
    }

    public void eliminarImagenProductoColor(Long id) {
        imagenProductoColorRepository.deleteById(id);
    }


}
