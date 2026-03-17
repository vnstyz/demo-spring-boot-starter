package org.example.mybatisplusstudy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mybatisplusstudy.model.entity.Employee;
import org.example.mybatisplusstudy.mapper.EmployeeMapper;
import org.example.mybatisplusstudy.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
