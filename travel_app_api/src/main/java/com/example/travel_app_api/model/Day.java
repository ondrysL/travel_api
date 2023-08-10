package com.example.travel_app_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(schema = "main", name = "day")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class Day {

    @Id
    private UUID id;

    @Column
    private String name;

    @Column
    private Date date;

    @Column
    public Integer price;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "day")
    private List<Activity> activities;
}
