package com.br.Employee.Controller;

import com.br.Employee.Domain.Employee;
import com.br.Employee.Domain.RequestEmployee;
import com.br.Employee.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepo repository;

    @GetMapping(value = "/all")
    public ResponseEntity getAllEmployee(){
        var allEmployees = repository.findAll();
        return ResponseEntity.ok(allEmployees);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getEmployee(@PathVariable String id){
        var employee = repository.findById(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping(value="/creat")
    public ResponseEntity creatEmployee(@RequestBody RequestEmployee data){
        Employee employee = new Employee(data);
        repository.save(employee);
        return ResponseEntity.ok().build();
    }
}
