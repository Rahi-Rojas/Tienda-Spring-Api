package com.rojas.spring.app.tiendaspring.repository;

import com.rojas.spring.app.tiendaspring.model.Talla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallaRepository extends JpaRepository <Talla, Long> {

}
