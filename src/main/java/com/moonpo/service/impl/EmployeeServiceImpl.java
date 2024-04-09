package com.moonpo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moonpo.model.Employee;
import com.moonpo.repository.IEmployeeRepository;
import com.moonpo.service.IEmployeeService;
import com.moonpo.viewmodel.EmployeeView;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<EmployeeView> getAllEmployeesView() {
        return employeeRepository.findAll().stream()
                .map(this::convertToEmployeeView)
                .collect(Collectors.toList());
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean saveEmployee(EmployeeView employeeView) {
        String id = employeeView.getId();
        Employee employee = fromEmployeeView(employeeView);
        employee.setAddedDate(getCurrentTimestamp());
        if (!employeeRepository.existsById(id)) {
            employeeRepository.save(employee);
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateEmployee(EmployeeView employeeView) {
        String id = employeeView.getId();
        if (employeeRepository.existsById(id)) {
            employeeRepository.save(fromEmployeeView(employeeView));
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteEmployeeById(String id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private EmployeeView convertToEmployeeView(Employee employee) {
        return new EmployeeView(
                employee.getId(),
                employee.getNo(),
                employee.getName(),
                employee.getPhoto(),
                String.valueOf(employee.getDateOfBirth()),
                employee.getGender(),
                String.valueOf(employee.getIssueDate()),
                employee.getAddress()
        );
    }

    private Employee fromEmployeeView(EmployeeView employeeView) {
        return new Employee(
                employeeView.getId(),
                employeeView.getNo(),
                employeeView.getName(),
                employeeView.getPhoto(),
                employeeView.getDateOfBirth(),
                employeeView.getGender(),
                employeeView.getIssueDate(),
                employeeView.getAddress()
        );
    }

    private Timestamp getCurrentTimestamp() {
        // Get time now form system time
        long currentTimeMillis = System.currentTimeMillis();
        // Create Timestamp from currentTimeMillis
        Timestamp currentTimestamp = new Timestamp(currentTimeMillis);
        return currentTimestamp;
    }
}
