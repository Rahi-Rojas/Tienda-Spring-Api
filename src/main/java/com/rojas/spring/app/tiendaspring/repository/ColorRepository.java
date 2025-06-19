package com.rojas.spring.app.tiendaspring.repository;

import com.rojas.spring.app.tiendaspring.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository <Color, Long> {

}
