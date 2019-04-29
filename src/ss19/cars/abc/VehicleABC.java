package ss19.cars.abc;

import ss19.cars.inter.Vehicle;

public abstract class VehicleABC {

    private final int wheelCount;

    private final int capacity;

    private final String color;

    public VehicleABC(int wheelCount, int capacity, String color) {
        this.wheelCount = wheelCount;
        this.capacity = capacity;
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }
}
