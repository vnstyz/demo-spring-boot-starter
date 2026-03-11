package org.example.jdbcstudy.mapper;

import org.example.jdbcstudy.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void testEmployeeMapper() {
        Employee employee = employeeMapper.selectOneById(1010L);
        System.out.println(employee);
    }
}
