package ss19.cars.abccollection;

/**
 * Interface for a Vehicle.
 * @author Eduard Bartolovic
 */
public abstract class VehicleABC implements Vehicle {

    private final int wheelCount;

    private final int capacity;

    private final String color;

    private int distanceDriven;

    private final int maxDistance;

    /**
     * Constructor.
     * @param wheelCount
     * @param capacity
     * @param color
     */
    public VehicleABC(int wheelCount, int capacity, String color, int maxDistance) {
        if (wheelCount<0 || capacity <0 || color == null || maxDistance <0)
            throw new IllegalArgumentException();
        this.wheelCount = wheelCount;
        this.capacity = capacity;
        this.color = color;
        this.maxDistance = maxDistance;
        distanceDriven = 0;
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



    @Override
    public void drive(int distance) throws VehicleMalfunctionException {
        if(distanceDriven > maxDistance){
            throw new VehicleMalfunctionException();
        }
        distanceDriven += distance;
    }
}
