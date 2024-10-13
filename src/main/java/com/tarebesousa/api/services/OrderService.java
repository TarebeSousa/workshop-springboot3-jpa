package com.tarebesousa.api.services;

import com.tarebesousa.api.entities.Order;
import com.tarebesousa.api.entities.User;
import com.tarebesousa.api.repositories.OrderRepository;
import com.tarebesousa.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findaAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
