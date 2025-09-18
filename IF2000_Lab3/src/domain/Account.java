/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Daniel Ríos
 */
public abstract class Account {
    
    protected String accountNumber;
    protected Client holder;
    protected double balance;
    protected String bank;

    public Account(){
    }
    
    public Account(String accountNumber, Client holder, double Balance, String bank) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = Balance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    
    public abstract double interestCalculation();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
        
    @Override
    public String toString() {
        String result = "\nBANK ACCOUNT INFORMATION:"
                + "------------------------------------------------"
                + "\nACCOUNT NUMBER: " + this.getAccountNumber()
                + "\nBALANCE: " + this.getBalance()
                + "\nACCOUNTHOLDER: " + this.getHolder().toString()
                +"\nBANK: " + this.getBank();
        
        return result;
    }
}