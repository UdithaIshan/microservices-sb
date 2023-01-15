package com.microservices.department.controller;

import com.microservices.department.entity.Department;
import com.microservices.department.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(Department department) {
        log.info("DepartmentController::createDepartment");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        log.info("DepartmentController::getDepartment");
        return departmentService.getDepartmentById(id);
    }
}
