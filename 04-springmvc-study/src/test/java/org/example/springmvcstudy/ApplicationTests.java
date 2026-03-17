package org.example.springmvcstudy;

import org.example.springmvcstudy.entity.Employee;
import org.example.springmvcstudy.service.EmployeeService;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class ApplicationTests {

    @Test
    void contextLoads() {
        EmployeeService service = new EmployeeService();
        Employee employee1 = Employee.builder().id(1010).username("lisi").password("123456").build();

        service.delete(1001);
        System.out.println(service.getEmployees());
    }
}
