package com.udemy.oop.classes.bank;

public class Main {

    public static void main(String[] args) {

        //constructor always with object
        //we do not need setters here
        //BankAccount bobAccount = new BankAccount("id 145", 0.00, "Bob", "test@test.test", "457-987-45");

        //with parameter called first
        //then empty called
        BankAccount bobAccount = new BankAccount();

        System.out.println(bobAccount.getAccountNumber());

        //BankAccount janeAccount = new BankAccount();

        /*
        bobAccount.setAccountNumber("id 14587");
        bobAccount.setBalance(0.00);
        bobAccount.setCustomerName("Bob");
        bobAccount.setEmail("test@test.test");
        bobAccount.setPhoneNumber("457-987-45");
        */

        /*
        janeAccount.setAccountNumber("id 11187");
        janeAccount.setBalance(0.00);
        janeAccount.setCustomerName("Jane");
        janeAccount.setEmail("test@com.test");
        janeAccount.setPhoneNumber("457-941-45");
        */

        System.out.println("Operations");

        bobAccount.withdrawFunds(100.0);
        bobAccount.depositFunds(50.0);
        bobAccount.withdrawFunds(100.0);
        bobAccount.depositFunds(51.0);
        bobAccount.withdrawFunds(100.0);

        BankAccount timAccount = new BankAccount("Tim", "test mail", "123456");
        System.out.println(timAccount.getCustomerName() + " name" + timAccount.getAccountNumber());
    }

}
