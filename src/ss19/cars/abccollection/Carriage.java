package ss19.cars.abccollection;

import java.util.ArrayList;
import java.util.List;

public class Carriage extends VehicleABC implements Loadable, Pullable {

    private List<Integer> load;

    private Puller puller;

    public Carriage(int load) {
        super(4,load,"Grey", 1000000);
        this.load = new ArrayList<>(load);
    }

    @Override
    public List<Integer> getLoad() {
        return load;
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

    @Override
    public Puller getPuller() {
        return puller;
    }

    @Override
    public void setPuller(Puller puller) {
        this.puller = puller;
    }

}
