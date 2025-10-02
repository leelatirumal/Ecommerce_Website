package com.example.backend.repo;

import com.example.backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Long> {
}
