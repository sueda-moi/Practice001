package com.vue.cn.domin;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {
    private Integer employeeId;

    private String employeeName;

    private String employeeImg;

    private String employeeEmail;

    private String employeePhone;

    private Double employeeSalary;

    private String employeeDept;

    private String employeePassword;

    private String employeeAddress;

    private Boolean active;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date employeeTime;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeeImg() {
        return employeeImg;
    }

    public void setEmployeeImg(String employeeImg) {
        this.employeeImg = employeeImg == null ? null : employeeImg.trim();
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept == null ? null : employeeDept.trim();
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword == null ? null : employeePassword.trim();
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress == null ? null : employeeAddress.trim();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getEmployeeTime() {
        return employeeTime;
    }

    public void setEmployeeTime(Date employeeTime) {
        this.employeeTime = employeeTime;
    }
}