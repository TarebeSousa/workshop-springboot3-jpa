package com.tarebesousa.api.repositories;

import com.tarebesousa.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
