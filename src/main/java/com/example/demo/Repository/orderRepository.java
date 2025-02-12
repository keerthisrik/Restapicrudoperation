package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.orders;

import java.util.Optional;

public interface orderRepository extends JpaRepository<orders, Long> {
    Optional<orders> findByUserName(String userName);
}
