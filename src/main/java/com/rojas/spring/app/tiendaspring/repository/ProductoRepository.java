package com.rojas.spring.app.tiendaspring.repository;

import com.rojas.spring.app.tiendaspring.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {

}
