package com.example.asmspringboot.service;

import com.example.asmspringboot.entity.District;
import com.example.asmspringboot.entity.Road;
import com.example.asmspringboot.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    DistrictRepository districtRepository;

    public District save(District district) {
        return districtRepository.save(district);
    }
    public List<District> findAll() {
        return districtRepository.findAll();
    }
}
