package ss19.cars.inter2;

public class Truck implements  Vehicle, Motor, Puller , Loadable{

    private final String color;

    private final int capacity;

    private final int power;

    private Pullable pullable;

    private int load;

    /**
     * Constructor.
     * @param color
     * @param capacity
     * @param power
     * @param load
     */
    public Truck(String color, int capacity, int power) {
        this.load = 0;
        if(power>1000)
            throw new IllegalArgumentException();
        this.color = color;
        this.capacity = capacity;
        this.power = power;
    }

    /**
     * Has always 6 wheels
     * @return 6 int
     */
    @Override
    public int getWheelCount() {
        return 6;
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

    @Override
    public int getLoad() {
        return load;
    }

    @Override
    public void setLoad(int load) {
        this.load = load;
    }
}