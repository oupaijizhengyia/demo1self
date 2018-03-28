package com.example.demo1self.po;

import java.util.Date;

public class Employee {
    private Integer id;

    private String employeeName;

    private String initialCode;

    private Boolean useState;

    private String employeeCode;

    private String employeeTel;

    private Integer roleId;

    private String employeePassword;

    private Integer isOperator;

    private Date createTime;

    private Date modTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getInitialCode() {
        return initialCode;
    }

    public void setInitialCode(String initialCode) {
        this.initialCode = initialCode == null ? null : initialCode.trim();
    }

    public Boolean getUseState() {
        return useState;
    }

    public void setUseState(Boolean useState) {
        this.useState = useState;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel == null ? null : employeeTel.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword == null ? null : employeePassword.trim();
    }

    public Integer getIsOperator() {
        return isOperator;
    }

    public void setIsOperator(Integer isOperator) {
        this.isOperator = isOperator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }
}