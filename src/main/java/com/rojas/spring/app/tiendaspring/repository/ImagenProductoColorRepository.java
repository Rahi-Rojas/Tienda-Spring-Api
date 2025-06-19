package com.rojas.spring.app.tiendaspring.repository;

import com.rojas.spring.app.tiendaspring.model.ImagenProductoColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenProductoColorRepository extends JpaRepository <ImagenProductoColor, Long> {

}
