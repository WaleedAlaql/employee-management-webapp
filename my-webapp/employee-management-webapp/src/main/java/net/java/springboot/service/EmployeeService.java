package net.java.springboot.service;

import net.java.springboot.entity.Employee;
import java.util.List;

public interface EmployeeService {

        List<Employee> getAllEmployee();

        Employee getEmployeeById(int theId);

        Employee save(Employee theEmployee);

        void deleteEmployeeById(int id);
    }
