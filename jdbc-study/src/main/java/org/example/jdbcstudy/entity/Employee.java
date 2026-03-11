package org.example.jdbcstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
@TableName("employee")
public class Employee {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String lastName;
    private String email;
    private String gender;
    private Integer department;
    private LocalDateTime birth;
}
