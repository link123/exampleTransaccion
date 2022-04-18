package com.diego.transaccionalExample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private  Long id;
    private String name;

    public Department(String name) {
        this.name = name;
    }
}
