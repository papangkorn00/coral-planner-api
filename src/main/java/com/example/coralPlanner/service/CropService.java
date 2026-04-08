package com.example.coralPlanner.service;

import com.example.coralPlanner.entity.Crop;
import com.example.coralPlanner.repository.CropRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CropService {

    private final CropRepository cropRepository;

    public List<Crop> getAllCrops(){
        return cropRepository.findAll();
    }
}
