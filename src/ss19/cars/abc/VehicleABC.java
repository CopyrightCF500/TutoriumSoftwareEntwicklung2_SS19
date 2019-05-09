package ss19.cars.abc;

/**
 * Interface for a Vehicle.
 * @author Eduard Bartolovic
 */
public abstract class VehicleABC implements Vehicle{

    private final int wheelCount;

    private final int capacity;

    private final String color;

    /**
     * Constructor.
     * @param wheelCount
     * @param capacity
     * @param color
     */
    public VehicleABC(int wheelCount, int capacity, String color) {
        this.wheelCount = wheelCount;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getColor() {
        return color;
    }
}
