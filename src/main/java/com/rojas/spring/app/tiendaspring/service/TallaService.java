package com.rojas.spring.app.tiendaspring.service;

import com.rojas.spring.app.tiendaspring.model.Talla;
import com.rojas.spring.app.tiendaspring.repository.TallaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TallaService {

    private final TallaRepository tallaRepository;

    public TallaService(TallaRepository tallaRepository) {
        this.tallaRepository = tallaRepository;
    }

    public List<Talla> listarTalla() {
        return Collections.unmodifiableList(tallaRepository.findAll());
    }

    public Talla guardarTalla(Talla talla) {
        return tallaRepository.save(talla);
    }

    Optional<Talla> buscarTallaPorId(Long id) {
        return tallaRepository.findById(id);
    }

    public void eliminarTalla(Long id) {
        tallaRepository.deleteById(id);
    }
}
