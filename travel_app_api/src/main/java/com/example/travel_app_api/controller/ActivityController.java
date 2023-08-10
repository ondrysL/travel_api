package com.example.travel_app_api.controller;

import com.example.travel_app_api.Repository.ActivityRepository;
import com.example.travel_app_api.model.Activity;
import com.example.travel_app_api.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(@Autowired ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("/activities")
    public List<Activity> getAll(){
        return activityService.getAll();
    }

    @GetMapping("/activity/{id}")
    public Activity getOneById(@PathVariable UUID id){
        return activityService.getById(id);
    }

    @PostMapping("/activities")
    public Activity createOne(@RequestBody Activity activity){
        return activityService.createOne(activity);
    }
}
