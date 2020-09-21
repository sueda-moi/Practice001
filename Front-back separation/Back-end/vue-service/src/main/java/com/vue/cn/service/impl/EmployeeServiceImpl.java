package com.vue.cn.service.impl;

import com.vue.cn.domin.Employee;
import com.vue.cn.mapper.EmployeeMapper;
import com.vue.cn.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> findAll() {
        return employeeMapper.selectByExample(null);
    }

    public int deleteById(Integer id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.insert(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Employee employee) {
        return employeeMapper.updateByPrimaryKey(employee);
    }
}
