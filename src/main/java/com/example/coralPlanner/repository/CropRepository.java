package com.example.coralPlanner.repository;

import com.example.coralPlanner.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop, Integer> {
}
