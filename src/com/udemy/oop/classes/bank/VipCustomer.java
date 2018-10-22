package com.udemy.oop.classes.bank;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default", 50000.0, "Default");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
