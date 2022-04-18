package com.diego.transaccionalExample.service;

import com.diego.transaccionalExample.dto.DepartmentDto;
import com.diego.transaccionalExample.entity.Department;
import com.diego.transaccionalExample.entity.Employee;
import com.diego.transaccionalExample.repostory.DepartmentRepository;
import com.diego.transaccionalExample.repostory.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor

public class DepartmentService {
    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;



    public void save(DepartmentDto departmentDto) {

        var department =  new Department(departmentDto.getName());
        Long idDepartment = departmentRepository.save(department).getId();

        var employee = new Employee(idDepartment, "Diego",9_000_000);
        employeeRepository.save(employee);

    }
}
