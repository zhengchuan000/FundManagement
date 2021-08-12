package com.example.fundmanagement.controller;

import com.example.fundmanagement.model.Positions;
import com.example.fundmanagement.service.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/positions")
public class PositionsController {

    private final PositionsService positionsService;
    @Autowired
    public PositionsController(PositionsService positionsService){
        this.positionsService = positionsService;
    }

    //Show all Positions
    @GetMapping
    public List<Positions> getPositions(){
        return positionsService.getPositions();
    }

    //Show position by id
    @GetMapping(path="{positonsId}")
    public Positions getPositions(@PathVariable("positionsId") Integer id){
        return positionsService.getPositions(id);
    }

//    //post
//    @PostMapping
//    public void postNewPositions(@RequestBody Positions newPositions){
//        positionsService.addNewPositions(newPositions);
//    }

    //add new position to a fund
    //delete
    //delete a position
    //put
    //update value of a position
}
