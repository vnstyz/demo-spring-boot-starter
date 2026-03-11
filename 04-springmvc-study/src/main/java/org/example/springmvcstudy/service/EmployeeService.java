package org.example.springmvcstudy.service;

import org.example.springmvcstudy.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class EmployeeService {
    private static Map<Integer, Employee> employees = new HashMap<>();
    private static Integer initId = 1003;
    static {
        employees.put(1001, Employee.builder().id(1001).username("zhangsan").password("123123").build());
        employees.put(1002, Employee.builder().id(1002).username("lisi").password("123123").build());
    }

    public Integer save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
            employees.put(employee.getId(), employee);
            return employee.getId();
        }
        if (employee.getId() != null){
            employees.put(employee.getId(), employee);
            return employee.getId();
        }
        return null;
    }

    public Collection<Employee> getEmployees() {
        return employees.values();
    }
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }
    public Integer delete(Integer id) {
        employees.remove(id);
        return null;
    }
}
