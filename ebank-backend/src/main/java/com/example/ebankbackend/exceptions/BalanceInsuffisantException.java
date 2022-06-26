package com.example.ebankbackend.exceptions;

public class BalanceInsuffisantException extends Throwable {
    public BalanceInsuffisantException(String message) {
        super(message);
    }
}
