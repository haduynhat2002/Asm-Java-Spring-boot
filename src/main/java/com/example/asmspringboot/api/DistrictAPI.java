package com.example.asmspringboot.api;

import com.example.asmspringboot.entity.District;
import com.example.asmspringboot.entity.Road;
import com.example.asmspringboot.service.DistrictService;
import com.example.asmspringboot.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@CrossOrigin("*")
@Controller
@RequestMapping("api/v1/districts")
public class DistrictAPI {
    @Autowired
    DistrictService districtService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<District>> findAll(){
        return ResponseEntity.ok(districtService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<District> save(@RequestBody District district){
        return ResponseEntity.ok(districtService.save(district));
    }
}
