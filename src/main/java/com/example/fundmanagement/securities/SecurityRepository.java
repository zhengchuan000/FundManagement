package com.example.fundmanagement.securities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SecurityRepository extends JpaRepository <Security,Integer>{
    Optional<Security> findFundByDescription(String description);
}
