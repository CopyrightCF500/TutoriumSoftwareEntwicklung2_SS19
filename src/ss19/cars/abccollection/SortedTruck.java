package ss19.cars.abccollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedTruck extends VehicleABC implements Motor, Puller, Loadable {

    private final int power;

    private Pullable pullable;

    private final List<Integer> load;


    /**
     * Constructor.
     * @param color
     * @param capacity
     * @param power
     */
    public SortedTruck(String color, int capacity, int power) {
        super(6,capacity,color,800000);
        this.load = new ArrayList<>(capacity);
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
    public List<Integer> getLoad() {
        return Collections.unmodifiableList(load);
    }

    @Override
    public void putLoad(int obj) {
        if (getCapacity() > load.size()){
            load.add(obj);
        }
    }

    @Override
    public void removeLoad(int obj) {
        load.remove(obj);
    }
}