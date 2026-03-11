package org.example.jdbcstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.jdbcstudy.entity.Employee;
import org.example.jdbcstudy.mapper.EmployeeMapper;
import org.example.jdbcstudy.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
    @Override
    public List<Employee> listByDept(Integer department) {
        return lambdaQuery()
                .eq(Employee::getDepartment,department)
                .list();
    }
}
