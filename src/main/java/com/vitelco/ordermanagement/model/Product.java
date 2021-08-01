package com.vitelco.ordermanagement.model;

import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private LocalDateTime createdTime;
    private int price;
    private int stock;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orderid" , nullable = false)
    private Order assignedOrder;

    public Product(Long id, String title, int price, int stock, Order assignedOrder) {
        this.id = id;
        this.title = title;
        this.createdTime=LocalDateTime.now();
        this.price = price;
        this.stock=stock;
        this.assignedOrder=assignedOrder;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}