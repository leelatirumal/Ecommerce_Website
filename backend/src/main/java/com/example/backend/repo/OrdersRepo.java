package com.example.backend.repo;

import com.example.backend.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,Long > {
}
