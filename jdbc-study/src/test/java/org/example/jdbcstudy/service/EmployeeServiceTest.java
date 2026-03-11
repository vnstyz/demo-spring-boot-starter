package org.example.jdbcstudy.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.jdbcstudy.entity.Employee;
import org.example.jdbcstudy.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void testEmployeeService() {
        employeeService.listByDept(101);
        System.out.println("===============================");
        Page<Employee> page = employeeMapper.selectPage(
                new Page<>(1, 3),
                null
        );
    }
}
