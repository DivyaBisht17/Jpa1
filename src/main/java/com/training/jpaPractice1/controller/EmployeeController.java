package com.training.jpaPractice1.controller;

import com.training.jpaPractice1.model.Employee;
import com.training.jpaPractice1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/db")

public class EmployeeController {
    @Autowired
    private EmployeeService empService;


    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return empService.getAll();

    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp) {
        return empService.addEmployee(emp);
    }

    @PutMapping("/save")
    public Employee updatemployee(@RequestBody Employee emp) {
        return empService.updateEmployee(emp);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        return empService.deleteEmployee(id);

    }
}
