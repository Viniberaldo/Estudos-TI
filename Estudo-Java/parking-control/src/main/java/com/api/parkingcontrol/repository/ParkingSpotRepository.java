package com.api.parkingcontrol.repository;

import com.api.parkingcontrol.model.ParkingSpotModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author viniberaldo
 */
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel,UUID>{
    
}
