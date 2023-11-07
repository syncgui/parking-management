package syncgui.parkingmanagement.dto;

import syncgui.parkingmanagement.model.VehicleType;

import java.util.Objects;
import java.util.UUID;

public class VehicleDto {

    private UUID id;

    private String brand;

    private String model;

    private String color;

    private String licensePlate;

    private VehicleType type;

    public VehicleDto() {
    }

    public VehicleDto(UUID id, String brand, String model, String color, String licensePlate, VehicleType type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleDto that = (VehicleDto) o;
        return Objects.equals(id, that.id) && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(color, that.color) && Objects.equals(licensePlate, that.licensePlate) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, licensePlate, type);
    }

    @Override
    public String toString() {
        return "VehicleDto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", type=" + type +
                '}';
    }
}
