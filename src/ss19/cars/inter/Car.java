package ss19.cars.inter;

public class Car implements MotorVehicle{

    private final String color;

    private final int capacity;

    private final int power;

    /**
     * Constructor.
     * @param color
     * @param capacity
     * @param power
     */
    public Car(String color, int capacity, int power) {
        if(power>1000)
            throw new IllegalArgumentException();
        this.color = color;
        this.capacity = capacity;
        this.power = power;
    }

    /**
     * Has always 4 wheels
     * @return 4 int
     */
    @Override
    public int getWheelCount() {
        return 4;
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
    public int getPower() {
        return power;
    }
}
