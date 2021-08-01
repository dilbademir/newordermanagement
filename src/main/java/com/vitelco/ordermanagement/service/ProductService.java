package com.vitelco.ordermanagement.service;

import com.vitelco.ordermanagement.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Product save(Product product);
    Optional<Product> findById(Long id);
}