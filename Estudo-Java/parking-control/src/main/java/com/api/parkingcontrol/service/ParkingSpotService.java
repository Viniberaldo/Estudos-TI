package com.api.parkingcontrol.service;

import com.api.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author viniberaldo
 */
@Service
public class ParkingSpotService {
    
    
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    
}
