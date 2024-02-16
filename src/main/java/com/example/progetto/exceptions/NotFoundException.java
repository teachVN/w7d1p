package com.example.progetto.exceptions;

public class NotFoundException extends Exception{
    public NotFoundException() {}

    public NotFoundException(String message) {
        super(message);
    }
}
