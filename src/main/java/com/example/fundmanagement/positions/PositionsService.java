package com.example.fundmanagement.positions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionsService {
    private final PositionsRepository positionsRepository;

    @Autowired
    public PositionsService(PositionsRepository positionsRepository) {
        this.positionsRepository = positionsRepository;
    }

    public List<Positions> getPositions() {
        return positionsRepository.findAll();
    }

    public Positions getPositions(Integer id) {
        Optional<Positions> positions = positionsRepository.findById(id);
        if (positions.isEmpty()){
            throw new IllegalArgumentException(Integer.toString(id));
        }
        return positions.get();
    }
}
