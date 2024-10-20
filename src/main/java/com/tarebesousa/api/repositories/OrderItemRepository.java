package com.tarebesousa.api.repositories;

import com.tarebesousa.api.entities.OrderItem;
import com.tarebesousa.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
