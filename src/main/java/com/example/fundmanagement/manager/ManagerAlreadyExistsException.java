package com.example.fundmanagement.manager;

public class ManagerAlreadyExistsException extends IllegalArgumentException{

    private String name;

    public ManagerAlreadyExistsException(String name) {
        super("Manager with name " + name + " already exists");
        this.name = name;
    }
}
