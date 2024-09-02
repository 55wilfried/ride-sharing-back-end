package com.ictu3091081.Services;

import com.ictu3091081.Respiratory.RideRepository;
import com.ictu3091081.model.RideRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    public RideRequest requestRide(RideRequest rideRequest) {
        // Handle ride request logic
        return rideRepository.save(rideRequest);
    }
}