package com.ictu3091081.Services;

import com.ictu3091081.Respiratory.RideStatusRepository;
import com.ictu3091081.model.RideStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideStatusService {

    @Autowired
    private RideStatusRepository rideStatusRepository;

    public RideStatus getRideStatus(Long rideId) {
        return rideStatusRepository.findById(rideId)
                .orElseThrow(() -> new RuntimeException("Ride status not found"));
    }
}