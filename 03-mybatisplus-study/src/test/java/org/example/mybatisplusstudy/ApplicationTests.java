package org.example.mybatisplusstudy;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.example.mybatisplusstudy.model.entity.Department;
import org.example.mybatisplusstudy.model.entity.Employee;
import org.example.mybatisplusstudy.mapper.EmployeeMapper;
import org.example.mybatisplusstudy.model.vo.DepartmentVO;
import org.example.mybatisplusstudy.model.vo.EmployeeVO;
import org.example.mybatisplusstudy.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
        List<DepartmentVO> deptAndEmps = employeeMapper.getDeptAndEmps(101);
        deptAndEmps.forEach(System.out::println);
    }
}
