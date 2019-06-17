package ss19.cars.abcexception;

public class Truck extends VehicleABC implements Motor, Puller, Loadable {

    private final int power;

    private Pullable pullable;

    private int load;

    /**
     * Constructor.
     * @param color
     * @param capacity
     * @param power
     */
    public Truck(String color, int capacity, int power) {
        super(6,capacity,color,800000);
        this.load = 0;
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

    @Override
    public int getLoad() {
        return load;
    }

    @Override
    public void setLoad(int load) {
        this.load = load;
    }
}