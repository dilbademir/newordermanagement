package com.vitelco.ordermanagement.model;

import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private LocalDateTime createdTime;
    private int price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerid" , nullable = false)
    private Customer assignedCustomer;
    private Category category;

    public Order(Long id, String title, int price, Customer customer, Category category) {
        this.id = id;
        this.title = title;
        this.createdTime = LocalDateTime.now();
        this.price = price;
        this.assignedCustomer = customer;
        this.category = category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum Category{
        STATIONARY, MARKET
    }

}