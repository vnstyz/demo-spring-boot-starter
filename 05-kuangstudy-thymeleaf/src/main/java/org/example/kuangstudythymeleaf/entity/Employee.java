package org.example.kuangstudythymeleaf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("employee")
public class Employee {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer department;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth;
}
