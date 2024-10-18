package com.tarebesousa.api.repositories;

import com.tarebesousa.api.entities.Category;
import com.tarebesousa.api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
