package com.example.Er_digram_Learning.Service;

import com.example.Er_digram_Learning.Repository.BusRepository;
import com.example.Er_digram_Learning.entity.Bus;
import org.springframework.stereotype.Service;

@Service
public class BusService {
    private BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Bus addBus(Bus bus) {
        return busRepository.save(bus);

    }


    public Bus findById(long busid) {
        return busRepository.findById(busid).get();
    }
}
