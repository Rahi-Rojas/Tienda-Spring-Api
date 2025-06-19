package com.rojas.spring.app.tiendaspring.service;

import com.rojas.spring.app.tiendaspring.model.Color;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

    private final ColorService colorRepository;

    public ColorService(ColorService colorRepository) {
        this.colorRepository = colorRepository;
    }

    public List<Color> listarColores() {
        return Collections.unmodifiableList(colorRepository.listarColores());
    }

    public Color guardarColor (Color color) {
        return colorRepository.guardarColor(color);
    }

    public Optional<Color> buscarColorPorId (Long id) {
        return colorRepository.buscarColorPorId(id);
    }

    public void eliminarColorPorId (Long id) {
        colorRepository.eliminarColorPorId(id);
    }

}
