package com.example.test.services;

import com.example.test.entities.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
    void assignProduitToStock(Long idProduit, Long idStock);
}
