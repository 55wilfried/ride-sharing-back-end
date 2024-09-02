package com.ictu3091081.Controller;

import com.ictu3091081.Services.RideStatusService;
import com.ictu3091081.model.RideStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides/status")
public class RideStatusController {

    @Autowired
    private RideStatusService rideStatusService;

    @GetMapping("/{rideId}")
    public ResponseEntity<RideStatus> getRideStatus(@PathVariable Long rideId) {
        RideStatus rideStatus = rideStatusService.getRideStatus(rideId);
        return ResponseEntity.ok(rideStatus);
    }
}
