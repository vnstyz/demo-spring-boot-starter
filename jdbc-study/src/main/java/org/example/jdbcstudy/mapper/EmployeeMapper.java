package org.example.jdbcstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.jdbcstudy.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    @Select("SELECT * FROM employee WHERE id = #{id}")
    Employee selectOneById(Long id);
}
