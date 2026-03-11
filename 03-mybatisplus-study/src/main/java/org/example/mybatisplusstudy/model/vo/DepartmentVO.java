package org.example.mybatisplusstudy.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.*;
import lombok.experimental.Accessors;
import org.example.mybatisplusstudy.model.entity.Department;
import org.example.mybatisplusstudy.model.entity.Employee;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class DepartmentVO extends Department {
    private List<Employee> emps;
}
