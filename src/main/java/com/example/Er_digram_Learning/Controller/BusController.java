package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Service.BusService;
import com.example.Er_digram_Learning.entity.Bus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {
    private BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }
  @PostMapping("/add")
    public ResponseEntity<Bus> addBus(@RequestBody Bus bus){
        Bus b1=busService.addBus(bus);
        return new ResponseEntity<>(b1, HttpStatus.CREATED);

    }

}
