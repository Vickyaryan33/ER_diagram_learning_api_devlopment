package com.example.Er_digram_Learning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "bus_name", nullable = false)
    private String busName;

    @Column(name = "bus_number", nullable = false)
    private String busNumber;


}