package ss19.cars.abcexception;

public class Carriage extends VehicleABC implements Loadable, Pullable {

    private int load;

    private Puller puller;

    public Carriage(int load) {
        super(4,0,"Grey", 1000000);
        this.load = load;
    }

    @Override
    public int getLoad() {
        return load;
    }

    @Override
    public void setLoad(int load) {
        this.load = load;
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
