package syncgui.parkingmanagement.dto;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class CompanyDto {

    private UUID id;

    private String name;

    private String address;

    private String phoneNumber;

    private Integer carSpaces;

    private Integer motorcycleSpaces;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public CompanyDto() {
    }

    public CompanyDto(UUID id, String name, String address, String phoneNumber, Integer carSpaces, Integer motorcycleSpaces, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.carSpaces = carSpaces;
        this.motorcycleSpaces = motorcycleSpaces;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyDto that = (CompanyDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(carSpaces, that.carSpaces) && Objects.equals(motorcycleSpaces, that.motorcycleSpaces) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, carSpaces, motorcycleSpaces, createdAt, updatedAt);
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
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
