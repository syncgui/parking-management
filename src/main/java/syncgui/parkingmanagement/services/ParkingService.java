package syncgui.parkingmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syncgui.parkingmanagement.dto.ParkingDto;
import syncgui.parkingmanagement.dto.VehicleDto;
import syncgui.parkingmanagement.exceptions.NoParkingSpacesException;
import syncgui.parkingmanagement.exceptions.RequiredObjectIsNullException;
import syncgui.parkingmanagement.exceptions.ResourceNotFoundException;
import syncgui.parkingmanagement.model.Company;
import syncgui.parkingmanagement.model.Parking;
import syncgui.parkingmanagement.model.Vehicle;
import syncgui.parkingmanagement.model.VehicleType;
import syncgui.parkingmanagement.repositories.CompanyRepository;
import syncgui.parkingmanagement.repositories.ParkingRepository;
import syncgui.parkingmanagement.repositories.VehicleRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static syncgui.parkingmanagement.mapper.Mapper.parseListObject;
import static syncgui.parkingmanagement.mapper.Mapper.parseObject;

@Service
public class ParkingService {

    @Autowired
    ParkingRepository parkingRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    CompanyRepository companyRepository;

    public List<ParkingDto> findAll() {
        return parseListObject(parkingRepository.findAll(), ParkingDto.class);
    }

    public ParkingDto findById(UUID id) {
        return parseObject(parkingRepository.findById(id).orElseThrow(ResourceNotFoundException::new), ParkingDto.class);
    }

    public ParkingDto checkIn(UUID companyId, UUID vehicleId) {
        if (vehicleId == null || companyId == null) throw new RequiredObjectIsNullException();
        Company company = companyRepository.findById(companyId).orElseThrow(ResourceNotFoundException::new);
        Vehicle vehicle = vehicleRepository.findById(vehicleId).orElseThrow(ResourceNotFoundException::new);
        if (vehicle.getType().equals(VehicleType.CAR) && company.getCarSpaces() > 0) {
            company.setCarSpaces(company.getCarSpaces() - 1);
        } else if (vehicle.getType().equals(VehicleType.MOTORCYCLE) && company.getMotorcycleSpaces() > 0) {
            company.setMotorcycleSpaces(company.getMotorcycleSpaces() - 1);
        } else {
            throw new NoParkingSpacesException();
        }
        LocalDateTime checkIn = LocalDateTime.now();
        return parseObject(parkingRepository.save(new Parking(company, vehicle, checkIn, null)), ParkingDto.class);
    }

    public ParkingDto checkOut(UUID parkingId) {
        if (parkingId == null) throw new RequiredObjectIsNullException();
        Parking parking = parkingRepository.findById(parkingId).orElseThrow(ResourceNotFoundException::new);
        if (parking.getVehicle().getType().equals(VehicleType.CAR)) {
            parking.getCompany().setCarSpaces(parking.getCompany().getCarSpaces() + 1);
        } else if (parking.getVehicle().getType().equals(VehicleType.MOTORCYCLE)) {
            parking.getCompany().setMotorcycleSpaces(parking.getCompany().getMotorcycleSpaces() + 1);
        }
        parking.setCheckOut(LocalDateTime.now());
        return parseObject(parkingRepository.save(parking), ParkingDto.class);
    }
}
