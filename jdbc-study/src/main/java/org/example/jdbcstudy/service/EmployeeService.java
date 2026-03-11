package org.example.jdbcstudy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.jdbcstudy.entity.Employee;

import java.util.List;

public interface EmployeeService extends IService<Employee> {
    List<Employee> listByDept(Integer department);
}
