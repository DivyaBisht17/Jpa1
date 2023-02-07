package com.training.jpaPractice1.service;

import com.training.jpaPractice1.model.Employee;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAll();
    public  Employee addEmployee (Employee emp);
    public Employee updateEmployee (Employee emp);
    public  String deleteEmployee (Long id);
}
