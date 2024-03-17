package org.accolite.model;

import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    private String emailId;
    private Address address;
    private Map<String,Integer> employeeExperienceInField;

    public Employee(int id, String name, String emailId, Address address, Map<String, Integer> employeeExperienceInField, List<String> phonenumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.address = address;
        this.employeeExperienceInField = employeeExperienceInField;
        this.phonenumbers = phonenumbers;
    }

    public Employee(int id, String name, String emailId, Address address) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.address = address;
    }

    public Employee(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public Map<String, Integer> getEmployeeExperienceInField() {
        return employeeExperienceInField;
    }

    public void setEmployeeExperienceInField(Map<String, Integer> employeeExperienceInField) {
        this.employeeExperienceInField = employeeExperienceInField;
    }

    public Employee(int id, String name, String emailId, Address address, List<String> phonenumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.address = address;
        this.phonenumbers = phonenumbers;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(List<String> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    private List<String> phonenumbers;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public Employee() {
    }

    public Employee(int id, String name, String emailId, List<String> phonenumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phonenumbers = phonenumbers;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    @Override
    public String toString() {
        return "id : " + id +
                ", name : " + name +
                ", emailId : " + emailId+
                ", phonenumbers : "+phonenumbers+", "+address+", "+employeeExperienceInField;
    }
}
