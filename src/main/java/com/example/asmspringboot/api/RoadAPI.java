package com.example.asmspringboot.api;

import com.example.asmspringboot.entity.Road;
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
@RequestMapping("api/v1/Roads")
public class RoadAPI {
    @Autowired
    RoadService roadService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Road>> findAll(){
        return ResponseEntity.ok(roadService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Road> save(@RequestBody Road road){
        return ResponseEntity.ok(roadService.save(road));
    }
}
