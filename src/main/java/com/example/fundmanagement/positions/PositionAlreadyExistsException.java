package com.example.fundmanagement.positions;

public class PositionAlreadyExistsException extends IllegalArgumentException{

    private Integer id;

    public PositionAlreadyExistsException(Integer id){
        super("Position with id " + id + " already exists");
        this.id = id;
    }
}
