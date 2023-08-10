package com.example.travel_app_api.controller;

import com.example.travel_app_api.model.Day;
import com.example.travel_app_api.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class DayController {

    private final DayService dayService;

    public DayController(@Autowired DayService dayService) {
        this.dayService = dayService;
    }

    @GetMapping("/days")
    public List<Day> getAll(){
        return dayService.getAll();
    }

    @GetMapping("/day/{id}")
    public Day getOneById(UUID id){
        return dayService.getOneById(id);
    }

    @PostMapping("/days")
    public Day save(@RequestBody Day day){
        return dayService.save(day);
    }
}
