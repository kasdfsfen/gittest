package com.max.spring.springboot.springcoursespringboot.service;



import com.max.spring.springboot.springcoursespringboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
