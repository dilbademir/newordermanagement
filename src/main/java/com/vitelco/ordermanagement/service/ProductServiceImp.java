package com.vitelco.ordermanagement.service;
import com.vitelco.ordermanagement.model.Order;
import com.vitelco.ordermanagement.model.Product;
import com.vitelco.ordermanagement.repository.OrderRepository;
import com.vitelco.ordermanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {

        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) {

        return productRepository.findById(id);
    }
}