package com.training.jpaPractice1.service;

import com.training.jpaPractice1.model.Employee;
import com.training.jpaPractice1.model.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeRepository empRepository;
    @Override
    public List<Employee> getAll() {
        return empRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee emp) {
        return empRepository.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        Employee emp1 = empRepository.getById(emp.getId());
        if (emp.getName() !=null)
            emp1.setName(emp.getName());
        if(emp.getName() !=null)
            emp1.setName(emp.getName());
        if(emp.getPhoneNo() !=0)
            emp1.setPhoneNo(emp.getPhoneNo());
        return empRepository.save(emp);
    }

    @Override
    public String deleteEmployee(Long id) {
         empRepository.deleteById( id);
                 return "Deleted";
    }
}
