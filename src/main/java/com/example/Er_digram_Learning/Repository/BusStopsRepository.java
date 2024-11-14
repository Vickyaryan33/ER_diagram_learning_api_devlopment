package com.example.Er_digram_Learning.Repository;

import com.example.Er_digram_Learning.entity.BusStops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusStopsRepository extends JpaRepository<BusStops, Long> {
}