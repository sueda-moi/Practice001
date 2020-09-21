package com.vue.cn.controller;

import com.vue.cn.domin.Employee;
import com.vue.cn.domin.ResponseBean;
import com.vue.cn.domin.StatusEnum;
import com.vue.cn.domin.StatusResponse;
import com.vue.cn.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("employee")

public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping
    public ResponseEntity<ResponseBean> findAll(){
        List<Employee> all = iEmployeeService.findAll();
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,all));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<StatusResponse> deleteById(@PathVariable Integer id){
        if (iEmployeeService.deleteById(id)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @PostMapping
    public ResponseEntity<StatusResponse> addEmployee(@RequestBody Employee employee){
        employee.setActive(false);
        employee.setEmployeePassword("123456");
        if (iEmployeeService.addEmployee(employee)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseBean> findById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseBean(StatusEnum.OK,iEmployeeService.findById(id)));
    }

    @PutMapping
    public ResponseEntity<StatusResponse> update(@RequestBody Employee employee){
        if (iEmployeeService.update(employee)>0){
            return ResponseEntity.ok(new StatusResponse(StatusEnum.OK));
        }
        return ResponseEntity.ok(new StatusResponse(StatusEnum.ERROE));
    }

}
