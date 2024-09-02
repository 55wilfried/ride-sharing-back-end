package com.ictu3091081.Respiratory;

import com.ictu3091081.model.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<RideRequest, Long> {
}
