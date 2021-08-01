package com.vitelco.ordermanagement.controller;

import com.vitelco.ordermanagement.exception.NotFoundException;
import com.vitelco.ordermanagement.model.Customer;
import com.vitelco.ordermanagement.model.Order;
import com.vitelco.ordermanagement.service.CustomerService;
import com.vitelco.ordermanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    @ResponseBody
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
        Customer customer = new Customer(1l, "dilba", "demir",  "demirdilba@gmail.com");
        Order order = new Order(2l, "Kalem", 20, customer, Order.Category.STATIONARY );
        return order;
    }

    @PostMapping
    @ResponseBody
    public Order createOrder(@RequestBody Order order){
        return orderService.save(order);
    }
}