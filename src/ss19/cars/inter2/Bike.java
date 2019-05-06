package ss19.cars.inter2;

/**
 * Simple Bike
 * @author Eduard Bartolovic
 */
public class Bike implements Vehicle {

    private final String color;

    /**
     * Constructor.
     * @param color String
     */
    public Bike(String color) {
        this.color = color;
    }

    /**
     * Has always 2 wheels
     * @return 2 int
     */
    @Override
    public int getWheelCount() {
        return 2;
    }

    /**
     * Has always 1 seat
     * @return 1 int
     */
    @Override
    public int getCapacity() {
        return 1;
    }

    @Override
    public String getColor() {
        return color;
    }
}
