package com.example.backend.model;


import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private Integer quantity;

    private Double price;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
}
