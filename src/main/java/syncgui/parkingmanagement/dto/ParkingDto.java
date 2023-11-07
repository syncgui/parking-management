package syncgui.parkingmanagement.dto;

import syncgui.parkingmanagement.model.Company;
import syncgui.parkingmanagement.model.Vehicle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ParkingDto {

    private UUID id;

    private List<Company> company;

    private List<Vehicle> vehicle;

    private LocalDateTime checkIn;

    private LocalDateTime checkOut;

    public ParkingDto() {
    }

    public ParkingDto(UUID id, List<Company> company, List<Vehicle> vehicle, LocalDateTime checkIn, LocalDateTime checkOut) {
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

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }

    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
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
