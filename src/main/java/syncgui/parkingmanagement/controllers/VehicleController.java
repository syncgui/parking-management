package syncgui.parkingmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import syncgui.parkingmanagement.dto.VehicleDto;
import syncgui.parkingmanagement.services.VehicleService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleService service;

    @GetMapping
    public List<VehicleDto> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public VehicleDto findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public VehicleDto create(@RequestBody VehicleDto vehicleDto) {
        return service.create(vehicleDto);
    }

    @PutMapping
    public VehicleDto update(@RequestBody VehicleDto vehicleDto) {
        return service.update(vehicleDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
