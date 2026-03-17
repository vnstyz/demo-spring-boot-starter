package org.example.springmvcstudy.controller;

import jakarta.annotation.Resource;
import org.example.springmvcstudy.entity.Employee;
import org.example.springmvcstudy.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/employee")
    public String getEmployee(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "后台传入参数！！！");
        return "hello";
    }

    @GetMapping("/hello01/{name}")
    public String hello01(@PathVariable String name,Model model) {
        model.addAttribute("message", name);
        return "hello";
    }
}
