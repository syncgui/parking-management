package syncgui.parkingmanagement.dto;

import syncgui.parkingmanagement.model.Company;
import syncgui.parkingmanagement.model.Vehicle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ParkingDto {

    private UUID id;

    private CompanyDto company;

    private VehicleDto vehicle;

    private LocalDateTime checkIn;

    private LocalDateTime checkOut;

    public ParkingDto() {
    }

    public ParkingDto(UUID id, CompanyDto company, VehicleDto vehicle, LocalDateTime checkIn, LocalDateTime checkOut) {
        this.id = id;
        this.company = company;
        this.vehicle = vehicle;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }

    public VehicleDto getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDto vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingDto that = (ParkingDto) o;
        return Objects.equals(id, that.id) && Objects.equals(company, that.company) && Objects.equals(vehicle, that.vehicle) && Objects.equals(checkIn, that.checkIn) && Objects.equals(checkOut, that.checkOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, vehicle, checkIn, checkOut);
    }

    @Override
    public String toString() {
        return "ParkingDto{" +
                "id=" + id +
                ", company=" + company +
                ", vehicle=" + vehicle +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}
