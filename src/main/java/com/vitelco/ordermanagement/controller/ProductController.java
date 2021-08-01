package com.vitelco.ordermanagement.controller;

import com.vitelco.ordermanagement.model.Customer;
import com.vitelco.ordermanagement.model.Order;
import com.vitelco.ordermanagement.model.Product;
import com.vitelco.ordermanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseBody
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        Customer customer = new Customer(1l, "dilba", "demir",  "demirdilba@gmail.com");
        Order order = new Order(2l, "Kalem", 20, customer, Order.Category.STATIONARY );
        Product product = new Product(3l, "Urun", 10, 2, order);
        return product;
    }

    @PostMapping
    @ResponseBody
    public Product createProduct(@RequestBody Product product){

        return productService.save(product);
    }
}