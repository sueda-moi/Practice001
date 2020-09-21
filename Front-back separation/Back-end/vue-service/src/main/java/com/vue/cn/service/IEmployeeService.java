package com.vue.cn.service;

import com.vue.cn.domin.Employee;

import java.util.List;

public interface IEmployeeService {
    //查询所有
    public List<Employee> findAll();

    //通过id删除
    public int deleteById(Integer id);

    //添加
    public int addEmployee(Employee employee);

    //根据id查询
    public Employee findById(Integer id);

    //修改
    public int update(Employee employee);

}
