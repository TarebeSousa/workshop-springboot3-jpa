package com.tarebesousa.api.repositories;

import com.tarebesousa.api.entities.Order;
import com.tarebesousa.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
