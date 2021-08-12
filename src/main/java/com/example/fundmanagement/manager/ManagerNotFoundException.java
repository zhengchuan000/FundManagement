package com.example.fundmanagement.manager;

public class ManagerNotFoundException extends IllegalArgumentException{
    private final Integer id;

    public ManagerNotFoundException(Integer id) {
        super("Manager with id " + id + "not found.");
        this.id = id;
    }
}
