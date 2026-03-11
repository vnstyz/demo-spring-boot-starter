package org.example.mybatisplusstudy.model.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import lombok.experimental.Accessors;
import org.example.mybatisplusstudy.model.entity.Department;
import org.example.mybatisplusstudy.model.entity.Employee;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class EmployeeVO extends Employee {
    private Department department;
}
