package syncgui.parkingmanagement.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 80)
    private String address;

    @Column(name = "phone_number", nullable = false, length = 15)
    private String phoneNumber;

    @Column(name = "car_spaces", nullable = false)
    private Integer carSpaces;

    @Column(name = "motorcycle_spaces", nullable = false)
    private Integer motorcycleSpaces;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public Company() {
    }

    public Company(UUID id, String name, String address, String phoneNumber, Integer carSpaces, Integer motorcycleSpaces, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(address, company.address) && Objects.equals(phoneNumber, company.phoneNumber) && Objects.equals(carSpaces, company.carSpaces) && Objects.equals(motorcycleSpaces, company.motorcycleSpaces) && Objects.equals(createdAt, company.createdAt) && Objects.equals(updatedAt, company.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, carSpaces, motorcycleSpaces, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Company{" +
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
