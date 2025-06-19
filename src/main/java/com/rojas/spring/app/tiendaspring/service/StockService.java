package com.rojas.spring.app.tiendaspring.service;

import com.rojas.spring.app.tiendaspring.model.Stock;
import com.rojas.spring.app.tiendaspring.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    public final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> listarStock () {
        return Collections.unmodifiableList(stockRepository.findAll());
    }

    public Stock guardarStock (Stock stock) {
        return stockRepository.save(stock);
    }

    Optional<Stock> buscarStockPorId (Long id) {
        return stockRepository.findById(id);
    }

    public void eliminarStock (Long id) {
        stockRepository.deleteById(id);
    }

}
