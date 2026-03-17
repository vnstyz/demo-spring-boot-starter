package org.example.kuangstudythymeleaf.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.kuangstudythymeleaf.entity.Employee;

public interface EmployeeService extends IService<Employee> {

    // [MOD-PAGINATION] Unified service-level pagination query.
    IPage<Employee> queryPage(long pageNo, long pageSize);
}
