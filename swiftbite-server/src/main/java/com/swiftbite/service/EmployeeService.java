package com.swiftbite.service;

import com.swiftbite.dto.EmployeeDTO;
import com.swiftbite.dto.EmployeeLoginDTO;
import com.swiftbite.dto.EmployeePageQueryDTO;
import com.swiftbite.entity.Employee;
import com.swiftbite.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
