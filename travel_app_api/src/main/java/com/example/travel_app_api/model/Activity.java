package com.example.travel_app_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(schema = "main", name = "activity")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class Activity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String type;

    @Column
    private String name;

    @Column
    private Date date;

    @Column
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "day_id")
    private Day day;
}
