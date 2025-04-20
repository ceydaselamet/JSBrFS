package com.pair3.Odev.repositories;

import com.pair3.Odev.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
