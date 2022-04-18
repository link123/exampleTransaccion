package com.diego.transaccionalExample.repostory;

import com.diego.transaccionalExample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
