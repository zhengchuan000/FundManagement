package com.example.fundmanagement.securities;

public class SecurityAlreadyExistsException extends IllegalArgumentException{

    private String description;

    public SecurityAlreadyExistsException(String description){
        super("Security named " + description + " already exists");
        this.description = description;
    }
}
