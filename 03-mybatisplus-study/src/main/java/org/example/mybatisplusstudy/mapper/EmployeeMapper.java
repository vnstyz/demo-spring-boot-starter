package org.example.mybatisplusstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.mybatisplusstudy.model.entity.Employee;
import org.example.mybatisplusstudy.model.vo.DepartmentVO;
import org.example.mybatisplusstudy.model.vo.EmployeeVO;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee> {
    EmployeeVO getEmpAndDeptByEmpId(Integer id);
    List<DepartmentVO> getDeptAndEmps(Integer id);
}
