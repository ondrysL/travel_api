package com.example.travel_app_api.service;

import com.example.travel_app_api.Repository.DayRepository;
import com.example.travel_app_api.model.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DayService {

    private final DayRepository dayRepository;

    public DayService(@Autowired DayRepository dayRepository) {
        this.dayRepository = dayRepository;
    }

    public List<Day> getAll(){
        return dayRepository.findAll();
    }

    public Day getOneById(UUID id){
        return dayRepository.findById(id).orElseThrow();
    }

    public Day save(Day day){
        return dayRepository.save(day);
    }
}
