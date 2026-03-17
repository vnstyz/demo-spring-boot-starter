package org.example.jdbcstudy.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.jdbcstudy.entity.Department;
import org.example.jdbcstudy.entity.Employee;

import java.util.List;


public interface EmployeeMapper {
    int insertEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteEmployee(Integer id);

    Employee selectEmployeeById(Integer id);
    @Select("SELECT * FROM employee")
    List<Employee> selectAllEmployees();
    List<Employee> selectEmployeeLikeName(String name);
    List<Employee> getEmpsByCondition(Employee employee);
    List<Employee> getEmpsByIds(List<Integer> ids);
    Employee getEmpAndDept(Integer id);
    Department getDeptAndEmps(Integer id);
}
