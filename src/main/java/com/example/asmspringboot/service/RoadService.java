package com.example.asmspringboot.service;

import com.example.asmspringboot.entity.District;
import com.example.asmspringboot.entity.Road;
import com.example.asmspringboot.exception.NotFoundException;
import com.example.asmspringboot.repository.DistrictRepository;
import com.example.asmspringboot.repository.RoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadService {
    @Autowired
    RoadRepository roadRepository;

    @Autowired
    DistrictRepository districtRepository;
    public Road save(Road road) {
        District district = districtRepository.findById(road.getDistrict_id()).orElse(null);
        if (district == null) {
            throw new NotFoundException("No district found!");
        }
        else {
            road.setDistrict(district);
            roadRepository.save(road);
        }
        return road;

    }
    public List<Road> findAll() {
        return roadRepository.findAll();
    }
}

