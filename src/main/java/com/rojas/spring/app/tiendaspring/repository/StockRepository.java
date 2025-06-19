package com.rojas.spring.app.tiendaspring.repository;

import com.rojas.spring.app.tiendaspring.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository <Stock, Long> {

}
