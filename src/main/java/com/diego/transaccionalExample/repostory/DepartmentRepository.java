package com.diego.transaccionalExample.repostory;

import com.diego.transaccionalExample.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
