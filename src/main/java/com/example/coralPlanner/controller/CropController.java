package com.example.coralPlanner.controller;

import com.example.coralPlanner.service.CropService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/crop")
public class CropController {
    private final CropService cropService;

    @GetMapping("/getAllCrops")
    public ResponseEntity<Object> getAllCrops(){
        return ResponseEntity.ok(cropService.getAllCrops());
    }
}
