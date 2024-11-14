package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Service.StopsService;
import com.example.Er_digram_Learning.entity.Stops;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stops")
public class StopsController {
    private StopsService stopsService;

    public StopsController(StopsService stopsService) {
        this.stopsService = stopsService;
    }
    @PostMapping("/add")
    public ResponseEntity<Stops>addStops(
            @RequestBody Stops stops
    ){
        Stops s1=stopsService.addStops( stops);
        return new ResponseEntity<>(s1, HttpStatus.CREATED);

    }

}
