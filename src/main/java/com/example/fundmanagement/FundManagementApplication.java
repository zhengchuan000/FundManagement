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

    @Bean
    CommandLineRunner commandLineRunner(
            PositionsRepository positionsRepository) {
        return args -> {
            //Integer positionsId,String securityName,Integer quantity, LocalDate datePurchased,Integer fundId
            List<Positions> positions = List.of(
                    new Positions(1,
                            "IBM",
                            100,
                            LocalDate.of(2016, 1, 1),
                            1),
                    new Positions(2,
                            "IBM",
                            200,
                            LocalDate.of(2020, 1, 1),
                            3)
            );

            List<Positions> savedPositions = positionsRepository.saveAll(positions);
        };
    }
}
