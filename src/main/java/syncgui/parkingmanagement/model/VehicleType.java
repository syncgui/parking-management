package syncgui.parkingmanagement.model;

public enum VehicleType {

    MOTORCYCLE(0),
    CAR(1);

    private final int id;

    VehicleType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
