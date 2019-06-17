package ss19.cars.abccollection;

public class Car extends VehicleABC implements Motor, Puller {

    private final int power;

    private Pullable pullable;

    /**
     * Constructor.
     * @param color
     * @param capacity
     * @param power
     */
    public Car(String color, int capacity, int power) {
        super(4,capacity,color,500000);
        this.power = power;
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
