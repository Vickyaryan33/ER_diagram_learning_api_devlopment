package com.example.Er_digram_Learning.Service;

import com.example.Er_digram_Learning.Repository.BusStopsRepository;
import com.example.Er_digram_Learning.entity.Bus;
import com.example.Er_digram_Learning.entity.BusStops;
import org.springframework.stereotype.Service;

@Service
public class BusStopService {
    private BusStopsRepository busStopsRepository;


    public BusStopService(BusStopsRepository busStopsRepository) {
        this.busStopsRepository = busStopsRepository;
    }


    public BusStops addBusStops(BusStops busStops) {
        return busStopsRepository.save(busStops);
    }
}
