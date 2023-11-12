package syncgui.parkingmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import syncgui.parkingmanagement.dto.ParkingDto;
import syncgui.parkingmanagement.services.ParkingService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    ParkingService service;

    @GetMapping
    public List<ParkingDto> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ParkingDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping(value = "/{companyId}/{vehicleId}")
    public ParkingDto checkIn(@PathVariable UUID companyId, @PathVariable UUID vehicleId) {
        return service.checkIn(companyId, vehicleId);
    }

    @PutMapping(value = "/{parkingId}")
    public ParkingDto checkOut(@PathVariable UUID parkingId) {
        return service.checkOut(parkingId);
    }
}
