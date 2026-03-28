package com.swiftbite.service;

import com.swiftbite.dto.EmployeeDTO;
import com.swiftbite.dto.EmployeeLoginDTO;
import com.swiftbite.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);
}
