package com.example.fundmanagement.fund;

public class FundAlreadyExistsException extends IllegalArgumentException{

    private String name;

    public FundAlreadyExistsException(String name){
        super("Fund named " + name + "already exists");
        this.name = name;
    }
}
