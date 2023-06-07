package com.coolshop.productwebsite.repositories;

import com.coolshop.productwebsite.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
