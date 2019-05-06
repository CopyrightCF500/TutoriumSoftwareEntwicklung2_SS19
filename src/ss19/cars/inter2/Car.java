package ss19.cars.inter2;

public class Car implements Motor, Vehicle , Puller {

    private final String color;

    private final int capacity;

    private final int power;

    private Pullable pullable;

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

    @Override
    public Pullable getPullable() {
        return pullable;
    }

    @Override
    public void setPullable(Pullable pullable) {
        this.pullable = pullable;
    }
}
