package syncgui.parkingmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import syncgui.parkingmanagement.model.Parking;
import syncgui.parkingmanagement.model.Vehicle;

import java.util.UUID;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, UUID> {
}
