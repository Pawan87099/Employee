package com.demo.Controller;


import com.demo.Entity.Employee;
import com.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;

 @PostMapping
 public String addEmployee(@RequestBody Employee employee) {
     return employeeService.addEmployee(employee);
 }

 @GetMapping
 public List<Employee> getAllEmployees() {
     return employeeService.getAllEmployees();
 }

 @DeleteMapping("/{id}")
 public void deleteEmployeeById(@PathVariable String id) {
     employeeService.deleteEmployeeById(id);
 }

 @PutMapping("/{id}")
 public void updateEmployeeById(@PathVariable String id, @RequestBody Employee updatedEmployee) {
     employeeService.updateEmployeeById(id, updatedEmployee);
 }
}

