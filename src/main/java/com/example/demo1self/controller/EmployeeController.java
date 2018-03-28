package com.example.demo1self.controller;

import com.example.demo1self.dao.EmployeeMapper;
import com.example.demo1self.po.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FileName: EmployeeController
 * Author: yeyang
 * Date: 2018/3/28 14:30
 */
@RestController
@Slf4j
@Api(value = "员工管理2",description = "第二次")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;
    @ApiOperation(value = "列表获取全部员工",response = Employee.class,notes = "并不知道显示在哪里")
    @RequestMapping(value = "listEmployee" ,method = RequestMethod.POST)
    public List<Employee> listEmployee(){
        return employeeMapper.getAll();
    }
}
