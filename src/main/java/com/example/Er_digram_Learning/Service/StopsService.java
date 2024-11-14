package com.example.Er_digram_Learning.Service;

import com.example.Er_digram_Learning.Repository.StopsRepository;
import com.example.Er_digram_Learning.entity.Stops;
import org.springframework.stereotype.Service;

@Service
public class StopsService {
    private StopsRepository stopsRepository;

    public StopsService(StopsRepository stopsRepository) {
        this.stopsRepository = stopsRepository;
    }

    public Stops addStops(Stops stops) {

            stopsRepository.save(stops);
            return stops;


    }

    public Stops findById(long stopid) {
        return stopsRepository.findById(stopid).get();
    }
}
