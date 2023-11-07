package syncgui.parkingmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syncgui.parkingmanagement.dto.VehicleDto;
import syncgui.parkingmanagement.exceptions.RequiredObjectIsNullException;
import syncgui.parkingmanagement.exceptions.ResourceNotFoundException;
import syncgui.parkingmanagement.model.Vehicle;
import syncgui.parkingmanagement.repositories.VehicleRepository;

import java.util.List;
import java.util.UUID;

import static syncgui.parkingmanagement.mapper.Mapper.parseListObject;
import static syncgui.parkingmanagement.mapper.Mapper.parseObject;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository repository;

    public List<VehicleDto> findAll() {
        return parseListObject(repository.findAll(), VehicleDto.class);
    }

    public VehicleDto findById(UUID id) {
        return parseObject(repository.findById(id).orElseThrow(ResourceNotFoundException::new), VehicleDto.class);
    }

    public VehicleDto create(VehicleDto vehicleDto) {
        if (vehicleDto == null) throw new RequiredObjectIsNullException();
        Vehicle vehicle = parseObject(vehicleDto, Vehicle.class);
        return parseObject(repository.save(vehicle), VehicleDto.class);
    }

    public VehicleDto update(VehicleDto vehicleDto) {
        if (vehicleDto == null) throw new RequiredObjectIsNullException();
        Vehicle vehicle = parseObject(repository.findById(vehicleDto.getId()).orElseThrow(ResourceNotFoundException::new), Vehicle.class);
        vehicle.setBrand(vehicleDto.getBrand());
        vehicle.setModel(vehicleDto.getModel());
        vehicle.setType(vehicleDto.getType());
        vehicle.setLicensePlate(vehicleDto.getLicensePlate());
        vehicle.setColor(vehicleDto.getColor());
        return parseObject(repository.save(vehicle), VehicleDto.class);
    }

    public void delete(UUID id) {
        Vehicle vehicle = repository.findById(id).orElseThrow(ResourceNotFoundException::new);
        repository.delete(vehicle);
    }
}
