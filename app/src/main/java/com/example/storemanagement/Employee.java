package com.example.storemanagement;

public class Employee {
    private static int employeeNum = 1;
    private Employee[] employees = new Employee[employeeNum];

    public Employee getEmpolyee(int n){
        if(n<0||n>=employeeNum)
            return null;
        else if(employees[n]==null){
            employees[n] = new Employee();
            return employees[n];
        }
        else return employees[n];
    }
}
