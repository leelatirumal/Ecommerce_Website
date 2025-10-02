package com.example.backend.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long userId;

    private Double totalAmount;

    @OneToMany(mappedBy = "orderId")
    private List<OrderItem> orderItems;
}
