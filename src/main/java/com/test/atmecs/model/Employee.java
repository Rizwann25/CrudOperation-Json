package com.test.atmecs.model;

public class Employee {
    private Integer id;
    private String name;
    private Boolean isPermanent;
    private Address address;
    private String phoneNumber;
    private String role;

    public Employee() {
    }

    public Employee(Integer id, String name, Boolean isPermanent, Address address, String phoneNumber, String role) {
        this.id = id;
        this.name = name;
        this.isPermanent = isPermanent;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPermanent() {
        return isPermanent;
    }

    public void setPermanent(Boolean permanent) {
        isPermanent = permanent;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isPermanent=" + isPermanent +
                ", address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
