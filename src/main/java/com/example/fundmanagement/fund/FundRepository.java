package com.example.fundmanagement.fund;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FundRepository extends JpaRepository<Fund, Integer> {

    Optional<Fund> findFundByName(String name);
}
