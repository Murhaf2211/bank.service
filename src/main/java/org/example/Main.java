package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("John", "Doe", "C12345");

        // Create an Account instance
        Account account = new Account("A12345", BigDecimal.valueOf(1000.00), client);

        // Print account details
        System.out.println(account);

        // Deposit money
        account.deposit(BigDecimal.valueOf(500.00));
        System.out.println("After deposit: " + account);

        // Withdraw money
        account.withdraw(BigDecimal.valueOf(200.00));
        System.out.println("After withdrawal: " + account);


    }
}