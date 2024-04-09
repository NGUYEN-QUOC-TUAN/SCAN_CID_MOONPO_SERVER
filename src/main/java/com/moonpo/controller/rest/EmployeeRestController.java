package com.moonpo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moonpo.model.Employee;
import com.moonpo.service.IEmployeeService;
import com.moonpo.viewmodel.EmployeeView;

import java.util.List;

@RestController
public class EmployeeRestController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employee/get-all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/employee/save")
    public ResponseEntity<EmployeeView> saveEmployee(@RequestBody EmployeeView employeeView) {
        boolean saved = employeeService.saveEmployee(employeeView);
        if (saved) {
            return ResponseEntity.ok(employeeView);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PutMapping("/employee/update")
    public ResponseEntity<EmployeeView> updateEmployee(@RequestBody EmployeeView employeeView) {
        if (employeeService.updateEmployee(employeeView)) {
            return ResponseEntity.ok(employeeView);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/employee/delete/{id}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") String id) {
        if (employeeService.deleteEmployeeById(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
