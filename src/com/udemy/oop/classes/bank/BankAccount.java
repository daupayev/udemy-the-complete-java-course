package com.udemy.oop.classes.bank;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        //call another constructor
        //is class is created?
        this("default id234",2.50, "Mary", "test@test.com", "1231235");

        System.out.println("Empty constructor called");
    }

    /*
    //initialize when creating object()
    //BankAccount(constructor)
    public BankAccount(String phoneNumber, double balance, String customerName, String email){
        //System.out.println("with parameters...");
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }
    */

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("with parameters...");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //we create one constructor
    //other constructors should only call other constructors

    public BankAccount(String customerName, String email, String phoneNumber) {

        //why was it created? cos we do not know the account number and, balance
        //and it will be default
        this("123123", 100.5, customerName, email, phoneNumber);

        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. Now balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawAmount){

        if (this.balance - withdrawAmount <= 0){
            System.out.println("Only " + this.balance + " available.");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance is: " + this.balance);
        }
    }

}
