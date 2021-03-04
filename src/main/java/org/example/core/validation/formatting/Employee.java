package org.example.core.validation.formatting;

public class Employee {
    private String name;
    private String dept;
    private String phoneNumber;

    public Employee (String name, String dept, String phoneNumber) {
        this.name = name;
        this.dept = dept;
        this.phoneNumber = phoneNumber;
    }

    public String getName () {
        return name;
    }

    public String getDept () {
        return dept;
    }


    public String getPhoneNumber () {
        return phoneNumber;
    }
}