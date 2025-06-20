package com.rojas.spring.app.tiendaspring.mapper;

import com.rojas.spring.app.tiendaspring.model.Categoria;
import com.rojas.spring.app.tiendaspring.model.request.CategoriaRequest;
import com.rojas.spring.app.tiendaspring.model.response.CategoriaResponse;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMaper {

    //todo: Para post y put manual
    public Categoria toEntity(CategoriaRequest categoriaRequest) {
        Categoria categoria = new Categoria();
        categoria.setNombre(categoriaRequest.getNombre());
        return categoria;
    }

    //todo: Para Get
    public CategoriaResponse toResponse(Categoria categoria) {
        return new CategoriaResponse(categoria.getId(), categoria.getNombre());
    }

    //todo: Para Put - Editar
    public void updateEntityFromRequest(CategoriaRequest categoriaRequest, Categoria categoria) {
        categoria.setNombre(categoriaRequest.getNombre());
    }
}
