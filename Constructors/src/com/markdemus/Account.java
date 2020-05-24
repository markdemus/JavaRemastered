package com.markdemus;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default Name", "Default Phone","Default Email");
        System.out.println("Empty constructor called"); //calling another constructor within a constructor; optional, must be first line in block
    }

    public Account(String number, double balance, String customerName, String customerPhoneNumber, String customerEmail) {
        //setting field values
        System.out.println("Account constructor when parameters are called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("9999999", 100, customerName, customerPhoneNumber, customerEmail);

    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
