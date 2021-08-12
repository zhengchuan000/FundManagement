package com.example.fundmanagement.fund;

public class FundNotFoundException extends IllegalArgumentException{

    private final Long id;

    public FundNotFoundException(Long id){
        super("Fund with id " + id + "not found.");
        this.id = id;
    }
}
