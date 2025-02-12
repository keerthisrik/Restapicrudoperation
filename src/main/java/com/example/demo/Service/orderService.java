package com.example.demo.Service;


import org.springframework.stereotype.Service;

import com.example.demo.Repository.orderRepository;
import com.example.demo.models.orders;

import java.util.List;
import java.util.Optional;

@Service
public class orderService {
    private final orderRepository employeeRepository;

    public orderService(orderRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<orders> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public orders saveEmployee(orders employee) {
        return employeeRepository.save(employee);
    }

    public Optional<orders> getEmployeeByUserName(String userName) {
        return employeeRepository.findByUserName(userName);
    }
}
