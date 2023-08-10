package com.example.travel_app_api.service;

import com.example.travel_app_api.Repository.ActivityRepository;
import com.example.travel_app_api.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(@Autowired ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getAll(){
        return activityRepository.findAll();
    }

    public Activity getById(UUID id){
        return activityRepository.findById(id).orElseThrow();
    }

    public Activity createOne(Activity activity){
        return activityRepository.save(activity);
    }
}
