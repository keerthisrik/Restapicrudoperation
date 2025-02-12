package com.example.demo.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private String contactNo;
    private String emailId;
    private String role;
    private String userName;
    private String password;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    private Long reportsTo;
}
