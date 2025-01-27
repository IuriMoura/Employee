package com.br.Employee.Controller;

import com.br.Employee.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepo repository;

    @GetMapping
    public ResponseEntity getAllEmployee(){
        var allEmployees = repository.findAll();
        return ResponseEntity.ok(allEmployees);
    }
}
