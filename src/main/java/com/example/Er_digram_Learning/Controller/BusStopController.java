package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Service.BusService;
import com.example.Er_digram_Learning.Service.BusStopService;
import com.example.Er_digram_Learning.Service.StopsService;
import com.example.Er_digram_Learning.entity.Bus;
import com.example.Er_digram_Learning.entity.BusStops;
import com.example.Er_digram_Learning.entity.Stops;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/busStop")
public class BusStopController {
    private BusStopService busStopService;
    private BusService busService;
    private StopsService stopsService;

    public BusStopController(BusStopService busStopService, BusService busService, StopsService stopsService) {
        this.busStopService = busStopService;
        this.busService = busService;
        this.stopsService = stopsService;
    }
    @PostMapping("/add")
    public ResponseEntity<BusStops> allLoacteRoute(
            @RequestParam long busid,
            @RequestParam long stopid,
            @RequestBody BusStops busStops
    ){
        Bus bus=busService.findById(busid);
        Stops stops=stopsService.findById(stopid);

        busStops.setBus(bus);
        busStops.setStops(stops);

        BusStops busStops1=busStopService.addBusStops(busStops);

        return new ResponseEntity<>(busStops1, HttpStatus.CREATED);
    }
}
