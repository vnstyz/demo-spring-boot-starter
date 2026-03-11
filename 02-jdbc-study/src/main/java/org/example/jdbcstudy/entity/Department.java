package org.example.jdbcstudy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Department {
    private Integer id;
    private String departmentName;

    private List<Employee> emps;
}
