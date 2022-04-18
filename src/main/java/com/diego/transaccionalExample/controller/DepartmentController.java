package com.diego.transaccionalExample.controller;

import com.diego.transaccionalExample.dto.DepartmentDto;
import com.diego.transaccionalExample.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/company")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    @Transactional
    public void createDepartment(@RequestBody DepartmentDto departmentDto){
        departmentService.save(departmentDto);
    }
}
