package com.example.test.controllers;

import com.example.test.entities.Stock;
import com.example.test.services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    IStockService iStockService;

    @GetMapping("/getStocks")
    public List<Stock> retrieveAllStocks() {
        return iStockService.retrieveAllStocks();
    }

    @PostMapping("/addStock")
    public Stock addStock(@RequestBody Stock s) {
        return iStockService.addStock(s);
    }

  @PutMapping("updateStock")
    public Stock updateStock(@RequestBody Stock s) {
        return iStockService.updateStock(s);
    }

   @GetMapping("/getStock/{id}")
    public Stock retrieveStock(@PathVariable Long id) {
        return iStockService.retrieveStock(id);
    }

@DeleteMapping("/deleteStock/{id}")
    public void removeStock(@PathVariable Long id) {
        iStockService.removeStock(id);

    }
@PostMapping("/assignProduitToStock/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock) {

    iStockService.assignProduitToStock(idProduit, idStock);
}
    }
