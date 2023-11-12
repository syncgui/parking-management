package syncgui.parkingmanagement.dto;

import java.util.Objects;
import java.util.UUID;

public class CompanyDto {

    private UUID id;

    private String name;

    private String address;

    private String phoneNumber;

    private Integer carSpaces;

    private Integer motorcycleSpaces;

    public CompanyDto() {
    }

    public CompanyDto(UUID id, String name, String address, String phoneNumber, Integer carSpaces, Integer motorcycleSpaces) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.carSpaces = carSpaces;
        this.motorcycleSpaces = motorcycleSpaces;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCarSpaces() {
        return carSpaces;
    }

    public void setCarSpaces(Integer carSpaces) {
        this.carSpaces = carSpaces;
    }

    public Integer getMotorcycleSpaces() {
        return motorcycleSpaces;
    }

    public void setMotorcycleSpaces(Integer motorcycleSpaces) {
        this.motorcycleSpaces = motorcycleSpaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyDto that = (CompanyDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(carSpaces, that.carSpaces) && Objects.equals(motorcycleSpaces, that.motorcycleSpaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, carSpaces, motorcycleSpaces);
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", carSpaces=" + carSpaces +
                ", motorcycleSpaces=" + motorcycleSpaces +
                '}';
    }
}
