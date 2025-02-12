package com.example.demo.Controller;


import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.orderService;
import com.example.demo.models.orders;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class orderController {
    private final orderService employeeService;

    public orderController(orderService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<orders> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public orders createEmployee(@RequestBody orders employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/login")
    public Optional<orders> login(@RequestBody orders employee) {
        return employeeService.getEmployeeByUserName(employee.getUserName());
    }
}
