package org.example.jdbcstudy.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.jdbcstudy.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class TestMapper {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void testSelect(){

        PageHelper.startPage(3, 3);
        List<Employee> employees = employeeMapper.selectAllEmployees();
        PageInfo<Employee> pageInfo = new PageInfo<>(employees);
        System.out.println("objectMapper:" + objectMapper);

        try {
            objectMapper.registerModule(new JavaTimeModule());
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pageInfo));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.registerModule(new JavaTimeModule());
//            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pageInfo));
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }

//        Department deptAndEmps = employeeMapper.getDeptAndEmps(102);
//        System.out.println(deptAndEmps);

//        Employee empAndDept = employeeMapper.getEmpAndDept(1016L);
//        System.out.println(empAndDept);

//        List<Employee> empsByIds = employeeMapper.getEmpsByIds(Arrays.asList(1010L, 1011L, 1012L));
//        empsByIds.forEach(System.out::println);

//        Employee zhangsan = Employee.builder()
//                .lastName("张三")
//                .gender(0)
//                .build();
//        List<Employee> condition = employeeMapper.getEmpsByCondition(zhangsan);
//        System.out.println(condition);

//        List<Employee> employees = employeeMapper.selectEmployeeLikeName("张");
//        employees.forEach(System.out::println);

//        Employee employee = employeeMapper.selectEmployeeById(1011L);
//        System.out.println(employee);
    }


    @Test
    public void deleteTest() {
        int rs = employeeMapper.deleteEmployee(1010);
        System.out.println(rs);
    }

    @Test
    public void updateTest() {
        Employee employeeUpdate = Employee.builder()
                .id(1010)
                .department(1)
                .gender(0)
                .email("test@test.com")
                .lastName("test")
                .birth(LocalDateTime.now()).build();
        int rs = employeeMapper.updateEmployee(employeeUpdate);
        System.out.println(rs);
    }

    @Test
    public void insetTest() {
        Employee employee = Employee.builder()
                .department(1)
                .gender(1)
                .email("test@test.com")
                .lastName("test")
                .birth(LocalDateTime.now()).build();
        int rs = employeeMapper.insertEmployee(employee);
        System.out.println(rs);
        System.out.println(employee.getId());
    }
}
