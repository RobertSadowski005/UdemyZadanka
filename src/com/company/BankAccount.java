package com.company;

public class BankAccount {

    private Integer accountNumber;
    private double balance;
    private String CustomerName;
    private String customerEMail;
    private String CustomerPhoneNumber;

    public void depositFunds(double depositedFunds){
        this.balance += depositedFunds;
        System.out.println("Actual funds after deposit: " + this.balance);
    }

    public void withdrawFunds(double withdrawnFunds) {
        if (this.balance - withdrawnFunds < 0) {
            System.out.println("There is not inuff money in your account. Actual funds: " + this.balance);
        } else {
            this.balance -= withdrawnFunds;
            System.out.println("Actual funds after withdraw: " + this.balance);
        }
    }

    public BankAccount() {
        System.out.println("Created BankAccount without data/parameters");
    }

    public BankAccount(Integer accountNumber, double balance, String customerName, String customerEMail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.CustomerName = customerName;
        this.customerEMail = customerEMail;
        this.CustomerPhoneNumber = customerPhoneNumber;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEMail() {
        return customerEMail;
    }

    public void setCustomerEMail(String customerEMail) {
        this.customerEMail = customerEMail;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }
}
