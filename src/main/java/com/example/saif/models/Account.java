package com.example.saif.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

// TODO Add support for multiple account types (business, savings, etc.)
// TODO Add support for foreign currency accounts
@Entity
@Table(name = "account", schema = "online_bank")
public class Account {

    @Id @GeneratedValue
    private long id;

    private String sortCode;

    private String accountNumber;

    private double currentBalance;
    
    private String currency;

    private String bankName;

    private String ownerName;

    private transient List<Transaction> transactions;

    protected Account() {}
    public Account(String bankName, String ownerName, String generateSortCode, String generateAccountNumber, double currentBalance, String currency) {
        this.sortCode = generateSortCode;
        this.accountNumber = generateAccountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.currency=currency;
    }
    public Account(long id, String sortCode, String accountNumber, double currentBalance, String bankName, String ownerName, String currency) {
        this.id = id;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.currency=currency;
    }

    public Account(long id, String sortCode, String accountNumber, double currentBalance, String bankName, String ownerName, String currency, List<Transaction> transactions) {
        this.id = id;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.transactions = transactions;
        this.currency=currency;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getSortCode() {
        return sortCode;
    }
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getCurrentBalance() {
        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", currentBalance=" + currentBalance +
                ", currency=" + currency +
                ", bankName='" + bankName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
