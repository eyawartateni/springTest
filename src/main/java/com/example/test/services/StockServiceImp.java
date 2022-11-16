package com.example.test.services;

import com.example.test.entities.Produit;
import com.example.test.entities.Stock;
import com.example.test.repository.ProduitRepository;
import com.example.test.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements IStockService{
    @Autowired
    StockRepository stockRepository;
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        stockRepository.deleteById(id);

    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null)
        {
            produit.setStock(stock);
            produitRepository.save(produit);

        }
    }
}
