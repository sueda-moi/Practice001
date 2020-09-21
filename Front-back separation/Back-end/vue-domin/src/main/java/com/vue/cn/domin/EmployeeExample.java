package com.vue.cn.domin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgIsNull() {
            addCriterion("employee_img is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgIsNotNull() {
            addCriterion("employee_img is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgEqualTo(String value) {
            addCriterion("employee_img =", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgNotEqualTo(String value) {
            addCriterion("employee_img <>", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgGreaterThan(String value) {
            addCriterion("employee_img >", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgGreaterThanOrEqualTo(String value) {
            addCriterion("employee_img >=", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgLessThan(String value) {
            addCriterion("employee_img <", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgLessThanOrEqualTo(String value) {
            addCriterion("employee_img <=", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgLike(String value) {
            addCriterion("employee_img like", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgNotLike(String value) {
            addCriterion("employee_img not like", value, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgIn(List<String> values) {
            addCriterion("employee_img in", values, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgNotIn(List<String> values) {
            addCriterion("employee_img not in", values, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgBetween(String value1, String value2) {
            addCriterion("employee_img between", value1, value2, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeImgNotBetween(String value1, String value2) {
            addCriterion("employee_img not between", value1, value2, "employeeImg");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("employee_email is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("employee_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("employee_email =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("employee_email <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("employee_email >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("employee_email >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("employee_email <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("employee_email <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("employee_email like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("employee_email not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("employee_email in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("employee_email not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("employee_email between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("employee_email not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("employee_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("employee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("employee_phone =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("employee_phone <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("employee_phone >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("employee_phone >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("employee_phone <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("employee_phone <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("employee_phone like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("employee_phone not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("employee_phone in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("employee_phone not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("employee_phone between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("employee_phone not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryIsNull() {
            addCriterion("employee_salary is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryIsNotNull() {
            addCriterion("employee_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryEqualTo(Double value) {
            addCriterion("employee_salary =", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryNotEqualTo(Double value) {
            addCriterion("employee_salary <>", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryGreaterThan(Double value) {
            addCriterion("employee_salary >", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("employee_salary >=", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryLessThan(Double value) {
            addCriterion("employee_salary <", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryLessThanOrEqualTo(Double value) {
            addCriterion("employee_salary <=", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryIn(List<Double> values) {
            addCriterion("employee_salary in", values, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryNotIn(List<Double> values) {
            addCriterion("employee_salary not in", values, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryBetween(Double value1, Double value2) {
            addCriterion("employee_salary between", value1, value2, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryNotBetween(Double value1, Double value2) {
            addCriterion("employee_salary not between", value1, value2, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptIsNull() {
            addCriterion("employee_dept is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptIsNotNull() {
            addCriterion("employee_dept is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptEqualTo(String value) {
            addCriterion("employee_dept =", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotEqualTo(String value) {
            addCriterion("employee_dept <>", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptGreaterThan(String value) {
            addCriterion("employee_dept >", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptGreaterThanOrEqualTo(String value) {
            addCriterion("employee_dept >=", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptLessThan(String value) {
            addCriterion("employee_dept <", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptLessThanOrEqualTo(String value) {
            addCriterion("employee_dept <=", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptLike(String value) {
            addCriterion("employee_dept like", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotLike(String value) {
            addCriterion("employee_dept not like", value, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptIn(List<String> values) {
            addCriterion("employee_dept in", values, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotIn(List<String> values) {
            addCriterion("employee_dept not in", values, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptBetween(String value1, String value2) {
            addCriterion("employee_dept between", value1, value2, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeeDeptNotBetween(String value1, String value2) {
            addCriterion("employee_dept not between", value1, value2, "employeeDept");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNull() {
            addCriterion("employee_password is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNotNull() {
            addCriterion("employee_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordEqualTo(String value) {
            addCriterion("employee_password =", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotEqualTo(String value) {
            addCriterion("employee_password <>", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThan(String value) {
            addCriterion("employee_password >", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("employee_password >=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThan(String value) {
            addCriterion("employee_password <", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThanOrEqualTo(String value) {
            addCriterion("employee_password <=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLike(String value) {
            addCriterion("employee_password like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotLike(String value) {
            addCriterion("employee_password not like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIn(List<String> values) {
            addCriterion("employee_password in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotIn(List<String> values) {
            addCriterion("employee_password not in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordBetween(String value1, String value2) {
            addCriterion("employee_password between", value1, value2, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotBetween(String value1, String value2) {
            addCriterion("employee_password not between", value1, value2, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIsNull() {
            addCriterion("employee_address is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIsNotNull() {
            addCriterion("employee_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressEqualTo(String value) {
            addCriterion("employee_address =", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotEqualTo(String value) {
            addCriterion("employee_address <>", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressGreaterThan(String value) {
            addCriterion("employee_address >", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("employee_address >=", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLessThan(String value) {
            addCriterion("employee_address <", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLessThanOrEqualTo(String value) {
            addCriterion("employee_address <=", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLike(String value) {
            addCriterion("employee_address like", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotLike(String value) {
            addCriterion("employee_address not like", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIn(List<String> values) {
            addCriterion("employee_address in", values, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotIn(List<String> values) {
            addCriterion("employee_address not in", values, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressBetween(String value1, String value2) {
            addCriterion("employee_address between", value1, value2, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotBetween(String value1, String value2) {
            addCriterion("employee_address not between", value1, value2, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeIsNull() {
            addCriterion("employee_time is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeIsNotNull() {
            addCriterion("employee_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeEqualTo(Date value) {
            addCriterion("employee_time =", value, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeNotEqualTo(Date value) {
            addCriterion("employee_time <>", value, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeGreaterThan(Date value) {
            addCriterion("employee_time >", value, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_time >=", value, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeLessThan(Date value) {
            addCriterion("employee_time <", value, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeLessThanOrEqualTo(Date value) {
            addCriterion("employee_time <=", value, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeIn(List<Date> values) {
            addCriterion("employee_time in", values, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeNotIn(List<Date> values) {
            addCriterion("employee_time not in", values, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeBetween(Date value1, Date value2) {
            addCriterion("employee_time between", value1, value2, "employeeTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeTimeNotBetween(Date value1, Date value2) {
            addCriterion("employee_time not between", value1, value2, "employeeTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}