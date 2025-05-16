package com.example;

public class Employee {

    private Department department; 

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void showDepartment() {
        System.out.println("Department: " + department.getDeptName());
    }
}
