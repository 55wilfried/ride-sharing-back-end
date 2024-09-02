package com.ictu3091081.Services;

import com.ictu3091081.Respiratory.RideRequestRepository;
import com.ictu3091081.model.RideRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideRequestService {

    @Autowired
    private RideRequestRepository rideRequestRepository;

    public RideRequest requestRide(RideRequest rideRequest) {
        return rideRequestRepository.save(rideRequest);
    }

    public RideRequest getRideDetails(Long rideId) {
        return rideRequestRepository.findById(rideId)
                .orElseThrow(() -> new RuntimeException("Ride not found"));
    }
}
