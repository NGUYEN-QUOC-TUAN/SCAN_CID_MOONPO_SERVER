package com.moonpo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moonpo.service.IEmployeeService;
import com.moonpo.viewmodel.EmployeeView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/view-employee")
    public String home(Model model) {
        List<EmployeeView> listEmployeesView = employeeService.getAllEmployeesView();
        model.addAttribute("listEmployees", listEmployeesView);
        return "index";
    }
}
