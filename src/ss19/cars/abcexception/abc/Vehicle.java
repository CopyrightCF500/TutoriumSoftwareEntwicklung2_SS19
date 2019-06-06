package ss19.cars.abcexception.abc;

/**
 * Interface for a Vehicle.
 * @author Eduard Bartolovic
 */
public interface Vehicle {

    /**
     * Getter for amount of wheels.
     * @return wheelCount int
     */
    int getWheelCount();

    /**
     * Getter for capacity.
     * @return capacity int
     */
    int getCapacity();

    /**
     * Getter for color of vehicle.
     * @return wheelCount int
     */
    String getColor();

    void drive(int distance) throws VehicleMalfunctionException;


}
