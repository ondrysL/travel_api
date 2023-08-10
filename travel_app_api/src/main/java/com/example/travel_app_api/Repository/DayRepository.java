package com.example.travel_app_api.Repository;

import com.example.travel_app_api.model.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DayRepository extends JpaRepository<Day, UUID> {
}
