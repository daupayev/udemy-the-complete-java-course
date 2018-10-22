package com.udemy.oop.classes.bank;

public class Bank {

    public static void main(String[] args) {

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());

        VipCustomer person2 = new VipCustomer("Bob", 250000.0);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.0, "test");
        System.out.println(person3.getName());
    }

}
