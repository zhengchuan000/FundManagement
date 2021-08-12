package com.example.fundmanagement;

import com.example.fundmanagement.positions.Positions;
import com.example.fundmanagement.positions.PositionsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class FundManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(FundManagementApplication.class, args);
    }

}
