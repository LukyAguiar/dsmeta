package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Com essa anotação, ele está fazendo com que o SaleService seja Identificado como Serviço para Spring
public class SaleService {

    @Autowired //Faz uma importação automatica;
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
