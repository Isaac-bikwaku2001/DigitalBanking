package com.example.ebankbackend.exceptions;

public class CustomerNotFoundException extends Throwable {
    public CustomerNotFoundException(String message){
        super(message);
    }
}
