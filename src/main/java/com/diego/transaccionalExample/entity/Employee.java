package com.diego.transaccionalExample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long departmentId;
    private String name;
    private Integer salary;

    public Employee(Long departmentId, String name, Integer salary) {
        this.departmentId = departmentId;
        this.name = name;
        this.salary = salary;
    }
}
