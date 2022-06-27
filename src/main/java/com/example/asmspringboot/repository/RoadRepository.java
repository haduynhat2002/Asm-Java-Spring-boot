package com.example.asmspringboot.repository;

import com.example.asmspringboot.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadRepository extends JpaRepository<Road, Integer> {
}
