package com.microservices.department.service;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("DepartmentService::saveDepartment", department);
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).get();
    }
}
