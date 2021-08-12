package com.example.fundmanagement.fund;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/funds")
public class FundController {
    private final FundService fundService;

    @Autowired
    public FundController(FundService fundService) {
        this.fundService = fundService;
    }


    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World";
    }

    //GET /api/v1/funds
    @GetMapping
    public List<Fund> getFunds(){
        return fundService.getFunds();
    }

    @GetMapping(path="{fundId}")
    public Fund getFund(@PathVariable("fundId") Long id){
        return fundService.getFund(id);
    }

    @PostMapping
    public void registerNewFund(@RequestBody Fund fund){
        fundService.addFund(fund);
    }

    @DeleteMapping(path="{fundId}")
    public void deleteFund(@PathVariable("fundId") Long id){
        fundService.deleteFund(id);
    }

    @PutMapping(path = "{fundId}")
    public void updateFund(@PathVariable Long fundId, @RequestBody Fund newFund){
        fundService.updateFund(fundId, newFund);
    }









}
