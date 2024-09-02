package com.ictu3091081.Controller;

import com.ictu3091081.Services.RideService;
import com.ictu3091081.model.RideRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    @PostMapping("/request")
    public ResponseEntity<RideRequest> requestRide(@RequestBody RideRequest rideRequest) {
        RideRequest newRideRequest = rideService.requestRide(rideRequest);
        return ResponseEntity.ok(newRideRequest);
    }


}