package syncgui.parkingmanagement.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Company company;

    @ManyToOne
    private Vehicle vehicle;

    @Column(name = "check_in")
    private LocalDateTime checkIn;

    @Column(name = "check_out")
    private LocalDateTime checkOut;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    public Parking() {
    }

    public Parking(Company company, Vehicle vehicle, LocalDateTime checkIn, LocalDateTime checkOut) {
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
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
        Parking parking = (Parking) o;
        return Objects.equals(id, parking.id) && Objects.equals(company, parking.company) && Objects.equals(vehicle, parking.vehicle) && Objects.equals(checkIn, parking.checkIn) && Objects.equals(checkOut, parking.checkOut) && Objects.equals(createdAt, parking.createdAt) && Objects.equals(updatedAt, parking.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, vehicle, checkIn, checkOut, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", company=" + company +
                ", vehicle=" + vehicle +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
