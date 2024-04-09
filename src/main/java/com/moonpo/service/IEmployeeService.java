package com.moonpo.service;



import java.util.List;

import com.moonpo.model.Employee;
import com.moonpo.viewmodel.EmployeeView;

public interface IEmployeeService {

    List<Employee> getAllEmployees();

    List<EmployeeView> getAllEmployeesView();

    Employee getEmployeeById(String id);

    Boolean saveEmployee(EmployeeView employee);

    Boolean updateEmployee(EmployeeView employee);

    Boolean deleteEmployeeById(String id);
}
