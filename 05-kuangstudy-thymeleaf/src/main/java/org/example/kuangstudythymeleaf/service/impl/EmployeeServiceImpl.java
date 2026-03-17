package org.example.kuangstudythymeleaf.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.kuangstudythymeleaf.entity.Employee;
import org.example.kuangstudythymeleaf.mapper.EmployeeMapper;
import org.example.kuangstudythymeleaf.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Override
    public IPage<Employee> queryPage(long pageNo, long pageSize) {
        // [MOD-PAGINATION] Guard invalid page parameters.
        long safePageNo = pageNo < 1 ? 1 : pageNo;
        long safePageSize = pageSize < 1 ? 10 : Math.min(pageSize, 100);

        Page<Employee> page = new Page<>(safePageNo, safePageSize);

        // [MOD-PAGINATION] Keep page order stable.
        return this.page(page, Wrappers.<Employee>lambdaQuery().orderByAsc(Employee::getId));
    }
}
