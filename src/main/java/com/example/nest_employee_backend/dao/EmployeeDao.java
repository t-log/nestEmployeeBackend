package com.example.nest_employee_backend.dao;

import com.example.nest_employee_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

}
