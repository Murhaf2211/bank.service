package org.example;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for accountBalance
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Getter and Setter for client
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Method to deposit money
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            this.accountBalance = this.accountBalance.add(amount);
        }
    }

    // Method to withdraw money
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(this.accountBalance) <= 0) {
            this.accountBalance = this.accountBalance.subtract(amount);
        }
    }

    @Override
    public String toString() {
        return String.format("Account Number: %s, Balance: %s, Client: %s %s",
                accountNumber, accountBalance, client.firstName(), client.lastName());
    }

}
